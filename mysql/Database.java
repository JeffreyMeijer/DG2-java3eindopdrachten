package mysql;

import java.sql.*;

public class Database {
	public void startConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/personen", "jeffrey", "Anglito22@");
			try {
				if(!con.isClosed()) {
					System.out.println("Connection successvol");
				}
			}catch (SQLException e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
