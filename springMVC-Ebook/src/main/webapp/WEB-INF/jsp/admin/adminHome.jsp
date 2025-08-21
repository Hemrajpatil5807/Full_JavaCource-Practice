<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>

<%@include file="//WEB-INF/jsp/allcomponent/allCss.jsp"%> 
<style type="text/css">
.crd-ho:hover {
	background-color: #FAF9F7;
}
</style>
</head>
<body style="background-color: #f1f0eb">
  <%@include file="navbar.jsp"%>
	
	<h3 class="text-center mt-2">Hello Admin</h3>


	<div class="container">
		<div class="row p-5">
			<div class="col-md-3">
			     <a href="addBookPage" class="text-decoration-none">
					<div class="card crd-ho">
						<div class="card-body text-center">
						<i class="fa-solid fa-square-plus fa-4x text-primary"></i><br><br>
							<h4>Add Books</h4>
							----------------
						</div>
					</div>
				  </a>
			 </div>
			
			<div class="col-md-3">
			    <a href="allBooks" class="text-decoration-none">
					<div class="card crd-ho">
						<div class="card-body text-center">
						    <i class="fa-solid fa-book fa-4x text-danger"></i><br><br>
							<h4>All Books</h4>
					    	----------------
						</div>
					</div>
				</a>
			</div>
			
			<div class="col-md-3">
			    <a href="orderPage" class="text-decoration-none">
					<div class="card crd-ho">
						<div class="card-body text-center">
						  <i class="fa-solid fa-box-open fa-4x text-warning"></i></i><br><br>
							<h4>Order</h4>
							----------------
						</div>
					</div>
				</a>
			</div>
			
			<div class="col-md-3">
			     <a href="logout" class="text-decoration-none">
					<div class="card crd-ho">
						<div class="card-body text-center">
						 <i class="fa-solid fa-right-from-bracket fa-4x text-primary"></i></i><br><br>
							<h4>Log-Out</h4>
						   ----------------
						</div>
					</div>
				</a>
			</div>
			
			
		</div>
	</div>

 <div style="margin-top:250px">
	<%@include file="footer.jsp"%>
 </div>
	
</body>
</html>