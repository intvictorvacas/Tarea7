
package arduino;

import java.sql.Connection;
import java.sql.*;

public class ConexionBD {

     Connection cn ;
    public Connection conexion(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/loggin ardunino","root","2002");
        System.out.println("SE HISO LA CONEXION EXITOSA");
    }catch (Exception e){
            System.out.println(e.getMessage());
    } return cn;
    }
    Statement CreateStatement(){
         throw new UnsupportedOperationException("No Soportado");
    }
    
    
}
