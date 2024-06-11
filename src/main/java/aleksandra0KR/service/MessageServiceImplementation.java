package aleksandra0KR.service;

import aleksandra0KR.config.Config;
import aleksandra0KR.dto.Message;
import aleksandra0KR.dto.MessageResponse;
import aleksandra0KR.exceptions.MessageException;
import aleksandra0KR.exceptions.UnsupportedRequest;
import aleksandra0KR.mapper.MessageMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MessageServiceImplementation implements MessageService {

  private final Config config;
  private final ObjectMapper objectMapper;
  private final RestTemplate restTemplate;

  public MessageServiceImplementation(Config config, ObjectMapper objectMapper,
      RestTemplate restTemplate) {
    this.config = config;
    this.objectMapper = objectMapper;
    this.restTemplate = restTemplate;
  }

  @Override
  public String handleMessage(Message message) {
    switch (message.getType()) {
      case confirmation -> {
        return config.getConfirmation();
      }
      case message_new -> {
        MessageResponse messageResponse = MessageMapper.MessageToMessageResponse(message);
        URI uri = createURI(messageResponse);
        restTemplate.postForEntity(uri, null,
            MessageResponse.class);
        return "ok";
      }
      default -> throw new UnsupportedRequest();
    }
  }


  @Override
  public URI createURI(MessageResponse message) {
    try {
      MultiValueMap<String, String> map = objectMapper.convertValue(message,
          LinkedMultiValueMap.class);
      return UriComponentsBuilder.fromHttpUrl("https://api.vk.com/method/messages.send")
          .queryParam("access_token", config.getAccessToken())
          .queryParam("v", config.getV())
          .queryParams(map)
          .build()
          .toUri();
    } catch (Exception exception) {
      throw new MessageException(exception.getMessage());
    }
  }
}
