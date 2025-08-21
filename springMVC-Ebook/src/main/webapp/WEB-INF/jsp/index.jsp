<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ebook: Index</title>

<%@include file="allcomponent/allCss.jsp"%> 

<style type="text/css">
.bk-img {
	background-image: url("img/bg.jpeg");
	background-size: cover;
	background-repeat: no-repeat;
	height: 40vh;
	width: 100%;
	border-bottom:1px solid grey;
}

.wel {
	padding-left: 140px;
	padding-top: 100px;
	font-family:Copperplate Gothic Light;
	font-size:xxx-larger;
	font-weight:bold;
}

.ml {
	margin-left: 7px;
}

.crd-ho:hover {
	background-color: #f8f0ed;
}
</style>

</head>
<body style="background-color: #f1f0eb">
	<%@include file="allcomponent/navbar.jsp"%>

	<div class="container-fluid bk-img">
		<h1 class="wel text-danger">Welcome to E-Books</h1>
		<h6 style="color:green; margin-left:150px;">${msg}</h6>
	</div>
	<!-- Start Recent Book -->

	<div class="container">
		<h3 class="text-center pt-3 pb-2">Recent Books</h3>
		<!-- 1 -->
		<div class="row">
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="Java-Book" src="books/java.jpg"
							style="width: 200px; height: 250px" class="img-thumblin">
						<p>Java Programming</p>
						<p>James Ghosling</p>
						<p>Categories: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
								class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
								class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
								href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
						</div>
					</div>
				</div>
			</div>
			<!-- 2 -->
			
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="Java-Book" src="books/java.jpg"
								style="width: 200px; height: 250px" class="img-thumblin">
							<p>Java Programming</p>
							<p>James Ghosling</p>
							<p>Categories: New</p>
							<div class="row">
								<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
									class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
									href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
							</div>
						</div>
					</div>
				</div>
				<!-- 3 -->
				
					<div class="col-md-3">
						<div class="card crd-ho">
							<div class="card-body text-center">
								<img alt="Java-Book" src="books/java.jpg"
									style="width: 200px; height: 250px" class="img-thumblin">
								<p>Java Programming</p>
								<p>James Ghosling</p>
								<p>Categories: New</p>
								<div class="row">
									<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
										class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
										class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
										href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
								</div>
							</div>
						</div>
					</div>
					<!-- 4 -->
					
						<div class="col-md-3">
							<div class="card crd-ho">
								<div class="card-body text-center">
									<img alt="Java-Book" src="books/java.jpg"
										style="width: 200px; height: 250px" class="img-thumblin">
									<p>Java Programming</p>
									<p>James Ghosling</p>
									<p>Categories: New</p>
									<div class="row">
										<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> 
										<a href="" class="btn btn-success btn-sm col-md-4 ml">View Details</a> 
										<a href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
									</div>
								</div>
							</div>
						</div>

               </div>
               <div class="text-center">
                <a href="" class="btn btn-danger btn-sm text-center mt-3">View All</a>
               </div>
		</div>
	<!-- end Recent Book -->
      <hr>
    <!-- New Book Start -->
    
    <div class="container">
		<h3 class="text-center pt-3 pb-2">New Books</h3>
		<!-- 1 -->
		<div class="row">
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="Java-Book" src="books/java.jpg"
							style="width: 200px; height: 250px" class="img-thumblin">
						<p>Java Programming</p>
						<p>James Ghosling</p>
						<p>Categories: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
								class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
								class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
								href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
						</div>
					</div>
				</div>
			</div>
			<!-- 2 -->
			
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="Java-Book" src="books/java.jpg"
								style="width: 200px; height: 250px" class="img-thumblin">
							<p>Java Programming</p>
							<p>James Ghosling</p>
							<p>Categories: New</p>
							<div class="row">
								<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
									class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
									href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
							</div>
						</div>
					</div>
				</div>
				<!-- 3 -->
				
					<div class="col-md-3">
						<div class="card crd-ho">
							<div class="card-body text-center">
								<img alt="Java-Book" src="books/java.jpg"
									style="width: 200px; height: 250px" class="img-thumblin">
								<p>Java Programming</p>
								<p>James Ghosling</p>
								<p>Categories: New</p>
								<div class="row">
									<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
										class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
										class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
										href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
								</div>
							</div>
						</div>
					</div>
					<!-- 4 -->
					
						<div class="col-md-3">
							<div class="card crd-ho">
								<div class="card-body text-center">
									<img alt="Java-Book" src="books/java.jpg"
										style="width: 200px; height: 250px" class="img-thumblin">
									<p>Java Programming</p>
									<p>James Ghosling</p>
									<p>Categories: New</p>
									<div class="row">
										<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
											class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
											class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
											href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
									</div>
								</div>
							</div>
						</div>

               </div>
               <div class="text-center">
                <a href="" class="btn btn-danger btn-sm text-center mt-3">View All</a>
               </div>
		</div>
    
    <!-- end New Book -->
    <hr>
    
    <!-- Start Old Book -->
    
         <div class="container">
		<h3 class="text-center pt-3 pb-2">Old Books</h3>
		<!-- 1 -->
		<div class="row">
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="Java-Book" src="books/java.jpg"
							style="width: 200px; height: 250px" class="img-thumblin">
						<p>Java Programming</p>
						<p>James Ghosling</p>
						<p>Categories: New</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
								class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
								class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
								href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
						</div>
					</div>
				</div>
			</div>
			<!-- 2 -->
			
				<div class="col-md-3">
					<div class="card crd-ho">
						<div class="card-body text-center">
							<img alt="Java-Book" src="books/java.jpg"
								style="width: 200px; height: 250px" class="img-thumblin">
							<p>Java Programming</p>
							<p>James Ghosling</p>
							<p>Categories: New</p>
							<div class="row">
								<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
									class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
									class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
									href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
							</div>
						</div>
					</div>
				</div>
				<!-- 3 -->
				
					<div class="col-md-3">
						<div class="card crd-ho">
							<div class="card-body text-center">
								<img alt="Java-Book" src="books/java.jpg"
									style="width: 200px; height: 250px" class="img-thumblin">
								<p>Java Programming</p>
								<p>James Ghosling</p>
								<p>Categories: New</p>
								<div class="row">
									<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
										class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
										class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
										href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
								</div>
							</div>
						</div>
					</div>
					<!-- 4 -->
					
						<div class="col-md-3">
							<div class="card crd-ho">
								<div class="card-body text-center">
									<img alt="Java-Book" src="books/java.jpg"
										style="width: 200px; height: 250px" class="img-thumblin">
									<p>Java Programming</p>
									<p>James Ghosling</p>
									<p>Categories: New</p>
									<div class="row">
										<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
											class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
											class="btn btn-success btn-sm col-md-4 ml">View Details</a> <a
											href="" class="btn btn-danger btn-sm col-md-3 ml"><i class="fa-solid fa-indian-rupee-sign"></i> 599</a>
									</div>
								</div>
							</div>
						</div>

               </div>
               <div class="text-center">
                <a href="" class="btn btn-danger btn-sm text-center mt-3">View All</a>
               </div>
		</div>
      

    <!-- end Old Book -->





  <%@include file="allcomponent/footer.jsp" %>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
</body>
</html>