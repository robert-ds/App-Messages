import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA
 * Created By robert
 * Date: 5/10/22
 * Time: 2:05 p. m.
 */

public class Connect {

  public Connection getConnection(){
    Connection conection = null;

    try{
      conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/app_messages","root","");

      if(conection != null){
        System.out.println("Successfuly Connection");
      }

    }catch(SQLException e){
      System.out.println(e);
    }

    return conection;

  }

}
