package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataExample {
	public static void main(String args[])throws ClassNotFoundException,SQLException
	{
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Drivers loaded");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		System.out.println("Connection established");
		DatabaseMetaData dmd=connection.getMetaData();
		System.out.println("DATABASE NAME: "+dmd.getDatabaseProductName());
		System.out.println("DATABASE VERSION: "+dmd.getDatabaseProductVersion());
		System.out.println("NAME OF THE DRIVER: "+dmd.getDriverName());
		System.out.println("VERSION OF THE DRIVER: "+dmd.getDriverVersion());
		System.out.println("MAJOR VERSION OF THE DRIVER: "+dmd.getDriverMajorVersion());
		System.out.println("MINOR VERSION OF THE DRIVER: "+dmd.getDriverMinorVersion());
		
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
		ResultSetMetaData rsmd=rs.getMetaData();
		   //own code
		  while(rs.next())
		   {
			  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		   }
		 rs.first();
		 System.out.println("first one is:");
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		 rs.last();
		 System.out.println("last one is:");
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		 rs.absolute(3);
		 System.out.println("third from starting  is:");
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		 rs.relative(3);
		 System.out.println("third from relative  is:");
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
	}
}
