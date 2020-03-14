package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementCheckId {
	public static void main(String args[])throws ClassNotFoundException,SQLException
	{
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		String query="select * from customers where id=?";
		PreparedStatement pst=connection.prepareStatement(query);
		Scanner s=new Scanner(System.in);
		System.out.println("enter customer id");
		int id=s.nextInt();
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		else
		{
		   System.out.println("Invalid id");
		}
		rs.close();
		pst.close();
		connection.close();
	}
}
