/**
 * Created with IntelliJ IDEA
 * Created By Robert Vasquez
 * Date: 5/10/22
 * Time: 1:52 p. m.
 */

public class Main {

  public static void main(String[] args){
    Connect conect = new Connect();

    try{
      conect.getConnection();
    }catch(Exception e){
      System.out.println(e);
    }

  }

}
