/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/10/22
 * Time: 3:33 p. m.
 */

public class Messages {
  int id_messages;
  String message;
  String authorMessage;
  String dateMessage;

  public Messages(){}

  public Messages(int id_messages, String message, String authorMessage, String dateMessage) {
    this.id_messages = id_messages;
    this.message = message;
    this.authorMessage = authorMessage;
    this.dateMessage = dateMessage;
  }

  // Getters and Setters


  public int getId_messages() {
    return id_messages;
  }

  public void setId_messages(int id_messages) {
    this.id_messages = id_messages;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getAuthorMessage() {
    return authorMessage;
  }

  public void setAuthorMessage(String authorMessage) {
    this.authorMessage = authorMessage;
  }

  public String getDateMessage() {
    return dateMessage;
  }

  public void setDateMessage(String dateMessage) {
    this.dateMessage = dateMessage;
  }

}
