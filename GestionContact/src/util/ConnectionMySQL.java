
package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionMySQL {
//URL connection
private static String url = "jdbc:mysql://localhost:3306/gestioncontacts";
//User name
private static String user = "root";
//User pass
private static String passwd = "";
//Driver
private static String driver = "com.mysql.jdbc.Driver";
private static Connection connection;
/**
* Retourne une nouvelle instance si elle n'existe pas déjà
* @return
*/
public static Connection getInstance(){
try {
if(connection == null ||connection.isClosed()){
try {
Class.forName(driver);
connection = DriverManager.getConnection(url, user, passwd);
} catch (SQLException e) {
e.printStackTrace();
}
catch (Exception e) {
e.printStackTrace();
}
}
} catch (SQLException e) {
e.printStackTrace();
}
return connection;
}
}