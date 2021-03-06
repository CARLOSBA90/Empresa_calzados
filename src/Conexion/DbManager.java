package Conexion;
import java.io.IOException;  
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Properties;   

public class DbManager {

 //   public String date = new SimpleDateFormat("dd-MM-yyyy-HH-mm").format(new Date());
    
    private static final int LoginTimeout = 10;  

    public DbManager() {  
    }  

    public Connection createConnection() throws IOException, ClassNotFoundException, SQLException {  
        String driver;  
        /*    Properties prop = new Properties();  
      //  System.out.println("\n\n=======================\nJDBC Connector Test " + date);  
      //  System.out.println("User home directory: " + System.getProperty("user.home"));  
        String host;  
        String username;  
        String password;  
       try {  
        	
            prop.load(new java.io.FileInputStream("C:\\Users/Kayreth/eclipse-workspace/Empresa_Calzados/files/mydb.cfg"));  
            host = prop.getProperty("host").toString();  
            username = prop.getProperty("username").toString();  
            password = prop.getProperty("password").toString();  
            driver = prop.getProperty("driver").toString();  
        } catch (IOException e) {  
            System.out.println("Unable to find mydb.cfg in " + System.getProperty("user.home") + "\n Please make sure that configuration file created in this folder.");  
            
            host = "Unknown HOST";  
            username = "Unknown USER";  
            password = "Unknown PASSWORD";  
            driver = "Unknown DRIVER";  
        }  

      //  System.out.println("host: " + host + "\nusername: " + username + "\npassword: " + password + "\ndriver: " + driver);  
*/
        Class.forName("com.mysql.jdbc.Driver"); 
        DriverManager.setLoginTimeout(LoginTimeout);  
        //Connection connection = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_69bd0ed0a4febcb", "b20bc5dd91893d", "31dc0f46"); 
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa_calzado", "root", ""); 


        return connection;  
    }  

}
