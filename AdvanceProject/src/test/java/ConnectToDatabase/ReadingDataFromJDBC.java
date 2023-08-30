package ConnectToDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadingDataFromJDBC {
	public static void main(String[] args) throws SQLException {
		//creating a driver reference
		//Driver dbdriver = new Driver();// not required
		//register the driver
		//DriverManager.registerDriver(dbdriver);// not required

		//getconnection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium","root","root");
		Statement statement=connection.createStatement();
		ResultSet data = statement.executeQuery("select*from student");
		while (data.next()) {
			System.out.println(data.getString("id")+" "+data.getString("st_name")+" "+data.getString("phone"));
			
			
		}
		
	}

}
