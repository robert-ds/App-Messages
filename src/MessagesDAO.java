import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/10/22
 * Time: 3:33 p. m.
 */

public class MessagesDAO {

  public static void createMessageDB(Messages message){
    Connect db_connect = new Connect();

    try(Connection connect = db_connect.getConnection()){

      PreparedStatement ps = null;

      try{
        String query = "INSERT INTO messages (message, message_author, date) VALUES (?,?, CURRENT_TIMESTAMP)";
        ps = connect.prepareStatement(query);

        // Insert data in query
        ps.setString(1, message.getMessage());
        ps.setString(2, message.getAuthorMessage());
        ps.executeUpdate();
        System.out.println("The message created successfuly!");

      }catch(Exception e){
        System.out.println(e);
      }

    }catch(Exception e){
      System.out.println(e);
    }

  }

  public static void readMessageDB(){

  }

  public static void deleteMessageDB(int id_message){

  }

  public static void updateMessageDB(Messages message){

  }

}
