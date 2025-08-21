<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
    <h1>Hello World</h1>
    <h2>This is Home Page</h2>
    <h3>Called By Home Controller url(/home)</h3>
    <br> <br> <br>
    <% 
       String name = (String)request.getAttribute("name");
       int id = (int)request.getAttribute("id");
       
      List<String> fr = (List<String>) request.getAttribute("fruits");
      
    %>
    
    <h1>Welcome <%= name %> </h1>
    <h2>ID : <%= id %></h2>
     
     <% for(String f:fr) { %> <!-- for loop start -->
     
         <h1><%= f %></h1>
         
      <% } %>   <!-- for loop end -->
    
    <a href="register"><button>To Register Click me</button></a>
    <br><br>
    <a href="getEmployee"><button>To Register Click me</button></a>
   
    
    
    
</body>
</html>