package mysql;
import java.sql.*;
public class conecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//Conectarse a la base de datos
		    //Connection MyConn = DriverManager.getConnection("jdbc: mysql://localhost:8889/tienda","root","");
		    String url1 = "jdbc:mysql://127.0.0.1:3306/base";
            String user = "root";
            String password = "05Lanabe";

            Connection MyConn = DriverManager.getConnection(url1, user, password);
            
		    Statement myStmt  = MyConn.createStatement();
		    //Ejecuto el query o consulta a la bd
		    ResultSet myRs=  myStmt.executeQuery("select * from clientes");
		    //Proceso lo resultados
		    while(myRs.next()) { 
		    	  System.out.println(myRs.getString("Nombre"));
		    }
	     }
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
