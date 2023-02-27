
package arduino.conexiones;
import arduino.ConexionBD;
import java.sql.ResultSet;
import arduino.conexiones.conecxionBaseUser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class CodigoSQL {
    public static ConexionBD conexion=new ConexionBD();
    public static PreparedStatement senteciaSql;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadoNumero=0;
    

    public static String buscarNombre(String usuario){
        String busqueda=null;
        Connection conexion=null;
        try {
        conexion=conecxionBaseUser.conectar();
        String senteciaBuscar=("SELECT User FROM usuario WHERE User ='"+usuario+"'");
        senteciaSql=conexion.prepareStatement(senteciaBuscar);
        resultado=senteciaSql.executeQuery();
        if(resultado.next()){
            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            busqueda=(nombre+" "+apellido);
        }
        conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda;
    }
    
    public static String BusquedaUsuario(String usuario,String contraseña){
 String busquedaUsuario=null; 
        Connection conexion=null;
        try {
        conexion=conecxionBaseUser.conectar();
        String verificar=("SELECT User,Password FROM usuario WHERE User='"+usuario+"' && Password ='"+contraseña+"'");
        senteciaSql=conexion.prepareStatement(verificar);
        resultado=senteciaSql.executeQuery();
        if(resultado.next()){
           busquedaUsuario="Usuario encontrado"; 
        }else{
           busquedaUsuario="Usuario no encontrado"; 
        }
        conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busquedaUsuario;
    } 
}
