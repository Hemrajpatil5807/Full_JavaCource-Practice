<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn_Account</title>

<%@include file="allcomponent/allCss.jsp"%>
<link rel="stylesheet" href="allcomponent/style.css" />

</head>
<body style="background-color:#f1f0eb;">
	<%@include file="allcomponent/navbar.jsp"%>

	<div class="container mt-5">
	  <div class="row">
	     <div class="col-md-3 offset-md-4">
	     <div class="card">
	      <div class="card-body">
	      <h4 class="text-center">Log-In</h4>
	      <h6 style="color:red">${msg}</h6>
		<form action="login">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email</label> 
				<input type="email" name="username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" name="password" class="form-control" id="exampleInputPassword1" required="required">
			</div>
			<div class="text-center">
			     <button type="submit" class="btn btn-sm btn-primary"> Submit </button><br><br>
			     <a href="registerPage" class="text-decoration-none">Create Account?</a>
			</div>
		  </form>
		
		</div>
		</div>
       </div>
    </div>
</div>

 <div style="margin-top:230px">
    <%@include file="allcomponent/footer.jsp" %>
 </div>

</body>
</html>