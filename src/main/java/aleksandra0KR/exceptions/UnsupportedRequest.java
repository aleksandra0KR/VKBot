package aleksandra0KR.exceptions;

public class UnsupportedRequest extends RequestException {

  public UnsupportedRequest() {
    super("This request doesnt support, try another request.");
  }
}
