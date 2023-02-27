
package arduino.conexiones;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conecxionBaseUser {
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="2002";
    private static final String url="jdbc:mysql://localhost:3306/loggin ardunino";
    
    public static Connection conectar(){
        Connection conexion=null;
        try {
            Class.forName(driver);
            conexion=DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }

    PreparableStatement prepareStatement(String sentenciaGuardar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
