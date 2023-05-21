package mysql;
import java.sql.*;
import clases.alumnos;

public class metodos {
	static String url1 = "jdbc:mysql://127.0.0.1:3306/escuela";
    static String user = "root";
    static  String password = "Tredex$03";
	public boolean registrar(String nombre, String apellidos,String direccion,String sexo,String nacionalidad,String tutor, String telefono) {
		try { 
            Connection MyConn = DriverManager.getConnection(url1, user, password);
		    Statement myStmt  = MyConn.createStatement();
		    //INSERT INTO `escuela`.`alumnos` (`idAlumnos`, `Nombre`, `Apellidos`, `Direccion`, `Sexo`, `Nacionalidad`, `Tutor`, `Telefono tutor`) VALUES ('51', 'D', 'd', 'f', 'f', 'f', 't', 'my');
		    String sql="Insert into escuela.alumnos(Nombre,Apellidos,direccion,Sexo,Nacionalidad,Tutor,Telefono tutor)"
		    +"values('"+nombre+"','"+apellidos+"','"+direccion+"','"+sexo+"','"+nacionalidad+"','"+tutor+"','"+telefono+"')";
		     myStmt.executeUpdate(sql);
		     return true;
	     }
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public alumnos buscar(String busca) {
	
	alumnos a = new alumnos(busca, busca, busca, busca, busca, busca, busca);
	return a;
	//lo mismo pero mas chido a prueba de errores
}
	public void eliminar(alumnos a) {
	//este yo lo hago
}
	public void editar(alumnos a) {
	//este surgió solito
}
}
