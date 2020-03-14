package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteCustomerUser {
	public static void main(String args[])throws ClassNotFoundException,SQLException
	{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
		Scanner s=new Scanner(System.in);
		System.out.println("enter htno to delete");
		int htno=s.nextInt();
		String query="delete from students where htno="+htno;
		int x=statement.executeUpdate(query);
		System.out.println(x+" record deleted");
		statement.close();
		connection.close();
	}
}
