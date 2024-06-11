package aleksandra0KR.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
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

