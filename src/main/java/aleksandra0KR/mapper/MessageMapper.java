package aleksandra0KR.mapper;

import aleksandra0KR.dto.Message;
import aleksandra0KR.dto.MessageResponse;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MessageMapper {

  private static final Random random = new Random();

  public MessageResponse MessageToMessageResponse(Message message) {
    Objects.requireNonNull(message);
    Map<String, Object> object = message.getObject();
    Map<String, Object> objectMessage = (Map<String, Object>) object.get("message");

    MessageResponse messageResponse = new MessageResponse();
    messageResponse.setMessage( "Вы сказали: ".concat(String.valueOf(objectMessage.get("text"))));
    messageResponse.setUserId(Long.parseLong(String.valueOf(objectMessage.get("from_id"))));
    messageResponse.setRandomId(random.nextLong());

    return messageResponse;

  }
}
