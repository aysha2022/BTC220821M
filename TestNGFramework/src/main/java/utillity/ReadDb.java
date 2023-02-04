package utillity;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadDb {

		
 public void connectDb() throws SQLException {
			Connection con = DriverManager.getConnection("", "", "");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("");
			while(rs.next()) {
				System.out.println(rs.getString(0));
			
			}
		//as we know java can not talk with database directly so we need a driver class as an interpreter
		//so then using driver manager class we will invoke get connection method which return connection 
		//interface.so then once we have connection, using the reference of connection we will invoke create
		//statement method which return statement interface then using the reference of statement we will invoke 
		//Execute query method where we will pass our sql query as a parameter which return resultset interface.
		//so once i have result i will iterate through based on my need.

	}
 }

