import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Created By Kinsey
 * Date: 5/10/22
 * Time: 3:34 p. m.
 */
public class MessagesService {

  public static void createMessage(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Write Message");
    String message = sc.nextLine();

    System.out.println("Write name author this message");
    String author = sc.nextLine();

    Messages ms = new Messages();
    ms.setMessage(message);
    ms.setAuthorMessage(author);

    MessagesDAO.createMessageDB(ms);

  }

  public static void listMessages(){
    MessagesDAO.readMessageDB();
  }

  public static void deleteMessage(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Write id of message");

    int id_message = sc.nextInt();

    MessagesDAO.deleteMessageDB(id_message);

  }

  public static void editMessage(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Write the new message");
    String msg = sc.nextLine();

    System.out.println("Enter the id of the message to edit");
    int id = sc.nextInt();

    Messages update = new Messages();
    update.setMessage(msg);
    update.setId_messages(id);
    MessagesDAO.updateMessageDB(update);

  }

}
