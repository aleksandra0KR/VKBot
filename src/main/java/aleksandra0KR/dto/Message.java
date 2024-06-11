package aleksandra0KR.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class Message {

  private MessageType type;

  private Map<String, Object> object;

  @JsonProperty(value = "group_id")
  private Long groupId;

  private String secret;
  @JsonProperty(value = "event_id")

  private String eventId;

}

