package Ass2;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Second {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3309/Ass2","root","8705");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Connection could not be established");
		} 
		catch (SQLException e) {	
			System.out.println("Sql is bad");
		}
		String sql="SELECT * FROM Emp";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.println("empno: " + rs.getInt(1) + ", ename: " + rs.getString("Empname"));
		}
		
		if (stmt != null) stmt.close();		
	}}


