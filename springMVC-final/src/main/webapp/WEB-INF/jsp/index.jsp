<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>

<!-- Bootstrap CSS CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"
	integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
	
	
	<style type="text/css">
	body{
	  background-image: url('https://www.pixelstalk.net/wp-content/uploads/2016/07/Free-Amazing-Background-Images-Nature.jpg');
	  background-size: cover;
	  background-repeat: no-repeat;
	}
	.logo{
	   margin-left: 60px;
	}
	.link{
	   padding-left: 800px;
	}
	.nav-link{
	   margin-left: 20px;
	}
	
	
	</style>
</head>
<body>

  <div class="">
	<!-- Navigation Bar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark container-fluid p-3">
		<a class="navbar-brand logo" href="#">MyApp</a>

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="container collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav mr-auto link">
				<li class="nav-item active"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="about.jsp">AboutUs</a></li>
				<li class="nav-item"><a class="nav-link" href="contact.jsp">ContactUs</a></li>
				<li class="nav-item"><a class="nav-link" href="registerPage">Register</a></li>
			</ul>

			<form class="form-inline my-3 my-lg-0" action="loginPage">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Log In</button>
			</form>
		</div>
	</nav>
</div>

	<!-- Page Content -->
	<div class="container mt-5 color-black">
		<h1>Welcome to MyApp</h1>
		<p>This is the Homepage of your web application.</p>
	</div>

	<!-- Bootstrap JS and dependencies -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js"
		integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D"
		crossorigin="anonymous"></script>
</body>
</html>
