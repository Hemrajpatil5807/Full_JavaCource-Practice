<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin: All Books</title>

<%@include file="//WEB-INF/jsp/allcomponent/allCss.jsp"%>

</head>
<body style="background-color: #f1f0eb">
	<%-- <%@include file="navbar.jsp"%> --%>

	<h3 class="text-center mt-2">Hello Admin</h3>

	 <table class="table table-striped">
		<thead class="bg-primary">
			<tr>
				<th scope="col">Image</th>
				<th scope="col">Book Name</th>
				<th scope="col">Author Name</th>
				<th scope="col">Price</th>
				<th scope="col">Book Category</th>
				<th scope="col">Status</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
	     <c:forEach items="${booklist}" var="book">
			<tr>
				<th scope="row">1</th>
				<td>${book.bookName}</td>
				<td>${book.author}</td>
				<td>${book.price}</td>
				<td>${book.bookCategory}</td>
				<td>${book.status}</td>
				<td>
				   <a href="edit_Book" class="btn btn-sm btn-primary">Edit</a> 
				   <a href="#" class="btn btn-sm btn-danger">Delete</a>
				</td>
			</tr>
	    </c:forEach> 
		
		<!--     <tr>
				<th scope="row">2</th>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>@fat</td>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>
				  <a href="edit_Book" class="btn btn-sm btn-primary">Edit</a> 
				  <a href="#" class="btn btn-sm btn-danger">Delete</a>
				</td>
			</tr>
			<tr>
				<th scope="row">3</th>
				<td>John</td>
				<td>Doe</td>
				<td>@social</td>
				<td>John</td>
				<td>Doe</td>
				<td>
				    <a href="#" class="btn btn-sm btn-primary">Edit</a> 
				   <a href="#" class="btn btn-sm btn-danger">Delete</a>
				</td>
			</tr> -->
			
		</tbody>
	</table> 



 <div style="margin-top:350px">
	<%@include file="footer.jsp"%>
 </div>

</body>
</html>