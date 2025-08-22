package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Name";
		String user = "root";
		String password = "root";
		try {
			// Load MySQL JDBC Driver (optional in modern JDBC)
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish connection
			Connection connection = DriverManager.getConnection(url, user, password);
			// Create statement
			Statement statement = connection.createStatement();
			// Execute query
			ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
			// Process result
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				System.out.println("ID: " + id + ", Name: " + name);
			}
			// Close resources
			resultSet.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
