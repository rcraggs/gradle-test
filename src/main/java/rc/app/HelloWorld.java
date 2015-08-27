package rc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* This is a class.
*/
public class HelloWorld {
  /**
  * This is a class.
  * @param args this is a param
  */
    public static void main(final String[] args) {
    }

    /**
    * This is a class.
    * @param a this is a param
    * @param b this is a param
    * @return the sum
    */
    public final int add(final int a, final int b)  {

    	int MYINT = a - b;
    	return MYINT;
    }

    public final int getNumberOfFeedbackComments(){

      int count = 0;

      try {

        Connection connect = null;
        Statement statement = null;
        ResultSet resultSet = null;

        // This will load the MySQL driver, each DB has its own driver
        Class.forName("com.mysql.jdbc.Driver");

        // Setup the connection with the DB
        connect = DriverManager
          .getConnection("jdbc:mysql://localhost/feedback?user=sqluser&password=sqluserpw");

        // Statements allow to issue SQL queries to the database
        statement = connect.createStatement();
        // Result set get the result of the SQL query
        resultSet = statement
          .executeQuery("select * from feedback.comments");

        while (resultSet.next()) {
          count++;
        }

      } catch (Exception e) {
        System.out.println(e);
      }

      return count;
    }
}
