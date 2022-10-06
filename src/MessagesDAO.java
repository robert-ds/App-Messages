import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

      }catch(SQLException e){
        System.out.println(e);
      }

    }catch(SQLException e){
      System.out.println(e);
    }

  }

  public static void readMessageDB(){
    Connect db_connect = new Connect();

    PreparedStatement ps = null;
    ResultSet rs = null;

    try(Connection connect = db_connect.getConnection()){
      String query = "SELECT * FROM messages";
      ps = connect.prepareStatement(query);
      rs = ps.executeQuery();

      while(rs.next()){
        System.out.println("ID: " + rs.getInt("id_message"));
        System.out.println("Message: " + rs.getString("message"));
        System.out.println("Message Author: " + rs.getString("message_author"));
        System.out.println("Date: " + rs.getString("date"));
        System.out.println("");
      }

    }catch(SQLException e){
      System.out.println("Messages not get");
      System.out.println(e);
    }

  }

  public static void deleteMessageDB(int id_message){
    Connect db_connect = new Connect();

    try(Connection connect = db_connect.getConnection()){
    PreparedStatement ps = null;

      try{
        String query = "DELETE FROM messages WHERE id_message = ?";
        ps = connect.prepareStatement(query);
        ps.setInt(1, id_message);
        ps.executeUpdate();
        System.out.println("The message has delete");
      }catch(SQLException e){
        System.out.println(e);
        System.out.println("The message has been deleted");
      }

    }catch(SQLException e){
      System.out.println(e);
    }

  }

  public static void updateMessageDB(Messages message){
    Connect db_connect = new Connect();

    try(Connection connect = db_connect.getConnection()) {
      PreparedStatement ps = null;

      try{
        String query = "UPDATE messages SET message = ? WHERE id_message = ?";
        ps = connect.prepareStatement(query);
        ps.setString(1, message.getMessage());
        ps.setInt(2, message.getId_messages());
        ps.executeUpdate();
        System.out.println("The message has been update");
      }catch(SQLException e){
        System.out.println(e);
        System.out.println("The message not been update");
      }

    }catch(SQLException e){
      System.out.println(e);
    }
  }

}
