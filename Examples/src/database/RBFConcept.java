package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class RBFConcept {
	public static void main(String args[]) throws ClassNotFoundException, IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("d://ctsdb.txt");
			Properties p=new Properties();
			p.load(fis);
			String dname=(String) p.get("Dname");
			String url=(String) p.get("URL");
			String username=(String) p.get("Uname");
			String password=(String) p.get("Pwd");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the table name");
			String tablename=s.next();
			Class.forName(dname);
			System.out.println("DRIVERS LOADED");
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("CONNECTION CREATED");
			 
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from "+tablename);
			
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println(" ----------------------------");
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.println(rsmd.getColumnName(i)+" ");
			}
			System.out.println("");
			System.out.println("-----------------------------");
			while(rs.next())
			{
				for(int j=1;j<=rsmd.getColumnCount();j++)
				{
					System.out.println(rs.getString(j)+" ");
				}
				System.out.println(" ");
			}
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}
