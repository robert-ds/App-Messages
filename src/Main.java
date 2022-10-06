import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vasquez
 * Date: 5/10/22
 * Time: 1:52 p. m.
 */

public class Main {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int opt = 0;

    do{
      System.out.println("==========================");
      System.out.println(" App Messages");
      System.out.println(" 1. Create Message");
      System.out.println(" 2. list Messages");
      System.out.println(" 3. Edit Messages");
      System.out.println(" 4. Delete Messages");
      System.out.println(" 5. exit");

      // Read option user
      opt = sc.nextInt();

      switch(opt){
        case 1:
          MessagesService.createMessage();
          break;

        case 2:
          MessagesService.listMessages();
          break;

        case 3:
          MessagesService.editMessage();
          break;

        case 4:
          MessagesService.deleteMessage();
          break;

        default:
          System.out.println("Invalid Option, app finished");
      }

    }while(opt != 5);



  }

}
