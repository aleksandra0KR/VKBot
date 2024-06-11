package aleksandra0KR.config;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@PropertySource(value = "classpath:vkCallback.properties")
public class Config {

  @NotBlank
  @Value("${vk.api.access-token}")
  private String accessToken;

  @NotBlank
  @Value("${vk.api.v}")
  private Double v;

  @NotBlank
  @Value("${vk.api.secret}")
  private String secret;

  @NotBlank
  @Value("${vk.api.confirmation}")
  private String confirmation;
}
