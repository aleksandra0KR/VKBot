package aleksandra0KR.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {

  @JsonProperty(value = "user_id")
  Long userId;

  private String message;

  @JsonProperty(value = "random_id")
  Long randomId;

}
