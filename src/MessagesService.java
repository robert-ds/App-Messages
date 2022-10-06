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

  }

  public static void deleteMessage(){

  }

  public static void editMessage(){

  }

}
