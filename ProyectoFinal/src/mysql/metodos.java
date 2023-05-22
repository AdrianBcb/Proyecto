package mysql;
import java.sql.*;
import clases.alumnos;

public class metodos {
	
	
	
	static String url1 = "jdbc:mysql://127.0.0.1:3306/escuela";
    static String user = "root";
    static  String password = "Tredex$03";
    
    
    
	public boolean registrar(String nombre, String apellidos,String direccion,String sexo,String nacionalidad,String tutor, String telefono, String a) {
		try { 
            Connection MyConn = DriverManager.getConnection(url1, user, password);
		    Statement myStmt  = MyConn.createStatement();
		   
		    String ejecutar="INSERT INTO alumnos "+"(Nombre, Apellidos, Direccion, Sexo, Nacionalidad, Tutor, Telefono_tutor)"+" values ("
		    										+"'"+nombre+"'"+","+"'"+apellidos+"'"+","+"'"+direccion+"'"+","+"'"+sexo+"'"+","+"'"+nacionalidad+"'"+","+"'"+tutor+"'"+","+"'"+telefono+"'"+"'"+a+"'"+");";

		    //String ejecutar="INSERT INTO alumnos (" +nombre+ ","+ apellidos+","+direccion+","+sexo+","+nacionalidad+","+tutor+","+telefono+");";
		    //System.out.println(ejecutar);
		    myStmt.executeUpdate(ejecutar);
		    return true;
	     }
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	public boolean buscar(String busca) {
		try {
			 Connection MyConn = DriverManager.getConnection(url1, user, password);
			 Statement myStmt  = MyConn.createStatement();
			// Select *from alumnos Where Nombre="Juan";
			 String sql = "Select *from alumnos Where Nombre="+"'"+busca+"'";
		     myStmt.executeQuery(sql);
		     return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
	    }
	//lo mismo pero mas chido a prueba de errores
}
	public void eliminar(alumnos a) {
	//este yo lo hago
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void editar(alumnos a) {
	//este surgió solito
}
}
