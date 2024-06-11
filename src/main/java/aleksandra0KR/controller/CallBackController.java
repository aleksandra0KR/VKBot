package aleksandra0KR.controller;

import aleksandra0KR.dto.Message;
import aleksandra0KR.exceptions.UnsupportedRequest;
import aleksandra0KR.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CallBackController {

  private final MessageService messageService;

  private CallBackController(MessageService messageService) {
    this.messageService = messageService;
  }

  @PostMapping
  public ResponseEntity<String> callBack(@RequestBody Message message) {
    return new ResponseEntity<>(messageService.handleMessage(message), HttpStatus.OK);
  }

  @ExceptionHandler
  private ResponseEntity<String> handlerException(UnsupportedRequest exception) {
    return new ResponseEntity<>("This operation doesn't supported", HttpStatus.BAD_REQUEST);
  }
}
