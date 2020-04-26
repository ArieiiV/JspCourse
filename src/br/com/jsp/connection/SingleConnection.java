package br.com.jsp.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/** 
 * Responsible to create the connection between the app and bank
 * @author Karoline Vieira
 * 
 * **/


//jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true
//jdbc:postgresql://127.0.0.1:52470/curso-jsp?autoReconnect=true
public class SingleConnection {
	private static String bank="jdbc:mysql://localhost:3306/cursojsp?useTimezone=true&serverTimezone=UTC";
	private static String password="root";
	private static String user="root";
	private static Connection connection = null;
	
	static {
		connect();
	}

	public SingleConnection() {
		connect();
		
	}

	private static void connect() {
		try {
			if (connection == null) {
				
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(bank,user,password);
				connection.setAutoCommit(false);
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Error when attempt to connect with bank" +e);
		}
		
	}
	
	
	public static Connection getConnection() {
		return connection;
	}
	
	
}
