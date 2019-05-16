package mysql;

import java.sql.*;

public class Database {
	public Connection con;
	public void startConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/personen", "jeffrey", "Anglito22@");
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
	public void insertIntoDatabase(String voornaam, String achternaam) {
		try {
			if(!con.isClosed()) {
				Statement statement = con.createStatement();
				String query = String.format("insert into namen (Voornaam,Achternaam) values ('%s','%s')",voornaam,achternaam);
				statement.executeUpdate(query);
				System.out.println("Insert complete!");
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
