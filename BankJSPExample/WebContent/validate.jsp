<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String n=request.getParameter("userid");
	String p=request.getParameter("password");
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Drivers loaded");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
	System.out.println("connection established");
	Statement statement=con.createStatement();
	String query="select * from bank";
	ResultSet rs=statement.executeQuery(query);
	int flag=0;
	while(rs.next())
	{
		String t1=rs.getString(1);
		String t2=rs.getString(2);
		if(n.equals(t1) && p.equals(t2))
		{
			flag=1;
			break;
		}
	}
	if(flag==1) 
	{
%>
		<jsp:forward page="TransactionMenu.html" />
<%  } 
	else 
	{ 
%>
		<jsp:forward page="banklogin.html"/>
<% 
	}
	rs.close();
	statement.close();
	con.close();
%>
</body>
</html>