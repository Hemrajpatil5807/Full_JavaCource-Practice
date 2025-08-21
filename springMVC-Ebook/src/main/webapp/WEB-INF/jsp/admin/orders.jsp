<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin: Books Orders</title>

<%@include file="//WEB-INF/jsp/allcomponent/allCss.jsp"%>

</head>
<body style="background-color: #f1f0eb">
	<%@include file="navbar.jsp"%>

	<h3 class="text-center mt-2">Hello Admin</h3>

	<table class="table table-striped">
		<thead class="bg-primary">
			<tr>
				<th scope="col">OrderID</th>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Address</th>
				<th scope="col">Phone No</th>
				<th scope="col">Book Name</th>
				<th scope="col">Author</th>
				<th scope="col">Price</th>
				<th scope="col">Payment Type</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td>Mark</td>
				<td>Otto</td>
				<td>@mdo</td>
				<td>@mdo</td>
				<td>@mdo</td>
				<td>Otto</td>
				<td>@mdo</td>
				<td>@mdo</td>
			</tr>
			<tr>
				<th scope="row">2</th>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>@fat</td>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>Thornton</td>
				<td>@fat</td>
				<td>Jacob</td>
			</tr>
			<tr>
				<th scope="row">3</th>
				<td>John</td>
				<td>Doe</td>
				<td>@social</td>
				<td>John</td>
				<td>Doe</td>
				<td>Doe</td>
				<td>@social</td>
				<td>John</td>
			</tr>
		</tbody>
	</table>


  <div style="margin-top:365px">
	<%@include file="footer.jsp"%>
 </div>
</body>
</html>