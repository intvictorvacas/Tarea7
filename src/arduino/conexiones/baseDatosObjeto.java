
package arduino.conexiones;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class baseDatosObjeto {
       Connection cn ;
    public Connection conexion(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_estado","root","2002");
        System.out.println("SE HISO LA CONEXION EXITOSA");
    }catch (Exception e){
            System.out.println(e.getMessage());
    } return cn;
    }
    Statement CreateStatement(){
         throw new UnsupportedOperationException("No Soportado");
    }
}
