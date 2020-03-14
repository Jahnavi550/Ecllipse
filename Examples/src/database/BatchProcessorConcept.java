package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessorConcept {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Drivers loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		System.out.println("connection established");
		con.setAutoCommit(false);
		Statement st=con.createStatement();
		st.addBatch("insert into customers values(1006,'john','gold',46)");
		st.addBatch("delete from customers where id=1003");
		st.addBatch("update customers set name='mjanu' where id=1002");
		int res []=st.executeBatch();
		for(int i=0;i<res.length;i++)
		{
			System.out.println("no of rows effeccted "+res[i]);
		}
		con.commit();
		con.rollback();
		con.close();
	}
}
