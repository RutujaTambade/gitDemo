<%@page import="javax.net.ssl.HttpsURLConnection"%>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
//protected void dopost(HttpServletRequest request,HttpsURLConnection response) throws ServletException,IOException{
  String id=request.getParameter("id");
  String name=request.getParameter("name");
  String education=request.getParameter("education");
   System.out.println(id);
     try{
    	 
     Class.forName("com.mysql.cj.jdbc.Driver");
   System.out.println("Driver Load");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
   System.out.println("connection build");
   
   String a="Delete from teacher where id=(?)";
   PreparedStatement p=con.prepareStatement(a);
    p.setString(1, id);
    p.executeUpdate();
    p.close();
    con.close();
    /*
    String a="update teacher set name=(?) where id=(?)";
    PreparedStatement p=con.prepareStatement(a);
    p.setString(1,name);
    p.executeUpdate();*/
    
    p.close();
   con.close();
    
     }
     catch(Exception e){
    	 System.out.println(e);
     }
//}
%>
</body>
</html>