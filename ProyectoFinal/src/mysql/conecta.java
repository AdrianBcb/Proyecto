package mysql;
import java.sql.*;

import clases.alumnos;
public class conecta {
	static String url1 = "jdbc:mysql://127.0.0.1:3306/Escuela";
    static String user = "root";
    static  String password = "Tredex$03";
	public static void main(String[] args) {
		try { 
            Connection MyConn = DriverManager.getConnection(url1, user, password);
		    Statement myStmt  = MyConn.createStatement();
		    ResultSet myRs=  myStmt.executeQuery("select * from alumnos");

		    while(myRs.next()) { 
		    	  System.out.println(myRs.getString("Nombre"));
		    }
	     }
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
