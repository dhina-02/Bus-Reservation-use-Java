package busReservation;

import java.sql.*;

public class DbConnection {
  private static final String url = "jdbc:mysql://localhost:3306/busRes";
  private static final String userName = "root";
  private static final String password = "#Dhina123";
  
  public static Connection getConnection() throws SQLException{
	  return DriverManager.getConnection(url,userName,password);
  }
}
