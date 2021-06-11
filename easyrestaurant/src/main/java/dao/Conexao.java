package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	private  Connection conn;
	
	public  Connection fazerConexao() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String strConn = "jdbc:mysql://localhost:3306/easy_restaurant_jsf";
			String user = "fernando";
			String pass = "1234";
			
			this.conn = DriverManager.getConnection(strConn, user, pass);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return this.conn;
	}

}