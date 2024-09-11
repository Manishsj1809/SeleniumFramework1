package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertDataToDataBase {
	public static void main(String[] args) throws Throwable {
		Driver driverRef = new Driver();
		
		DriverManager.deregisterDriver(driverRef);
		
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium","root","root");
		
		Statement state = conn.createStatement();
		
		String query = "insert into selenium(id,first_name,last_name,address)values('4','rama','bhama','bengaluru')";
		int result = state.executeUpdate(query);
		
		if(result==1)
		{
			System.out.println("data is added sucesfully");
			
		}
		else
		{
			System.out.println("data is not added");
		}
		conn.close();
	}

}
