<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select Employee</title>

  <style>
    body{
       background-color:white;
    }
    h1{
        color:#da042a;
        text-align:center;
    }
    table {
      width: 80%;
      border-collapse: collapse;
      margin: 20px auto;
      font-family: Arial, sans-serif;
    }

    th, td {
      border: 1px solid #ccc;
      padding: 10px;
      text-align: left;
    }

    th {
      background-color: #f2f2f2;
    }

    tr:hover {
      background-color: #f9f9f9;
    }
  </style>

</head>
<body>
<h1>Employee Details</h1>
  <table>
    <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Mobile</th>
        <th>Email</th>
        <th>Gender</th>
        <th>Address</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${emp.id}</td>
        <td>${emp.name}</td>
        <td>${emp.email}</td>
        <td>${emp.mobile}</td>
        <td>${emp.gender}</td>
        <td>${emp.adr}</td>
      </tr>
    </tbody>
  </table>
</body>
</html>