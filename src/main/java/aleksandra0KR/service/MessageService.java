package aleksandra0KR.service;

import aleksandra0KR.dto.Message;
import aleksandra0KR.dto.MessageResponse;
import java.net.URI;

public interface MessageService {

  String handleMessage(Message message);

  URI createURI(MessageResponse message);
}
