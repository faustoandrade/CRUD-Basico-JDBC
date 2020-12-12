package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    //Variable de conexión
    Connection con;
    
    //Constructor
    public Conexion() {
       try{
//           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "");
       } catch (SQLException e){
           
       }     
       
    }

    public Connection getConnection() {
        return con;
    }
    
}
