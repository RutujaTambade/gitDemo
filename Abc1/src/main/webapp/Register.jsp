<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
     String id=request.getParameter("id");
     String name=request.getParameter("name");
     String Address=request.getParameter("Address");
     String city=request.getParameter("city");
     String email=request.getParameter("email");
     String Pass=request.getParameter("Pass");
    System.out.println(id);
     
     Class.forName("com.mysql.cj.jdbc.Driver");
   System.out.println("Driver Load");
    // String user="root";
  //   String password="root";
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
      System.out.println("connection build");
      PreparedStatement p=con.prepareStatement("insert into register1 values(?,?,?,?,?,?)");
         p.setString(1,id);
         p.setString(2,name);
         p.setString(3, Address);
         p.setString(4,city);
         p.setString(5,email);
         p.setString(6,Pass);
         
         
       int i=  p.executeUpdate();
         
         p.close();
         con.close();
       
        %>
        
        
        
          
</body>
</html>

