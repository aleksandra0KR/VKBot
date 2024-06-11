package aleksandra0KR.controller;

import aleksandra0KR.dto.Message;
import aleksandra0KR.service.MessageService;
import java.net.http.HttpResponse;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callback")
@Validated
public class CallBackController {

  private final MessageService messageService;

  private CallBackController(MessageService messageService) {
    this.messageService = messageService;
  }

  @PostMapping
  public ResponseEntity<String> callBack(@RequestBody Message message) {
      return new ResponseEntity<>(messageService.handleMessage(message), HttpStatus.OK);
  }
}
