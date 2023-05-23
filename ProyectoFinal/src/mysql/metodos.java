package mysql;
import java.sql.*;

import clases.alumnos;

public class metodos {
//	Luis Adrian Cocom Bacab
// Didier Nathanael Sanchez Tzeec 
	
	
	static String url1 = "jdbc:mysql://127.0.0.1:3306/escuela";
    static String user = "root";
    static  String password = "05Lanabe";
    
    
    
	public boolean registrar(String nombre, String apellidos,String direccion,String sexo,String nacionalidad,String tutor, String telefono, String a) {
		try { 
            Connection MyConn = DriverManager.getConnection(url1, user, password);
		    Statement myStmt  = MyConn.createStatement();
		    
		    String ejecutar="INSERT INTO alumnos "+"(Nombre, Apellidos, Direccion, Sexo, Nacionalidad, Tutor, Telefono_tutor)"+" values ("
		    										+"'"+nombre+"'"+","+"'"+apellidos+"'"+","+"'"+direccion+"'"+","+"'"+sexo+"'"+","+"'"+nacionalidad+"'"+","+"'"+tutor+"'"+","+"'"+telefono+"'"+"'"+a+"'"+");";
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
			 String sql = "Select * from alumnos Where Nombre="+"'"+busca+"'";
		     myStmt.executeQuery(sql);
		     return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
	    }
	
}
	
	
	
	
	
	
	public boolean eliminar(String nombre) {
		try {
			 Connection MyConn = DriverManager.getConnection(url1, user, password);
			 Statement myStmt  = MyConn.createStatement();
			 String sql = "Delete from alumnos Where Nombre = '"+nombre+"';";
		     myStmt.executeQuery(sql);
		     return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
	    }
	//este yo lo hago
}
	
	
	
	
	
	
	public ResultSet verclase(String clase) {
		Connection MyConn;
		try {
			MyConn = DriverManager.getConnection(url1, user, password);
			 Statement myStmt  = MyConn.createStatement();
			 String sql = "Select * from alumnos Where Asignatura = "+"'"+ clase +"' ;";
			 ResultSet rsResultSet = myStmt.executeQuery(sql);
			 
		     return rsResultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	public void editar(alumnos a) {
	//este surgió solito
}
}
