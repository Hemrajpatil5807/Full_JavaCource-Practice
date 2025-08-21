<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recent Book</title>

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
<body>
<%@include file="allcomponent/lognavbar.jsp"%>

<div class="container">
		<h3 class="text-center pt-3 pb-2">Recent Books</h3>
		<!-- 1 -->
		<c:forEach var="book" items="${booklist}">
		<div class="row">
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="Java-Book" src="books/java.jpg"
							style="width: 200px; height: 250px" class="img-thumblin">
						<p>${book.bookName}</p>
						<p>${book.author}</p>
						<p>Categories: ${book.bookCategory}</p>
						<div class="row">
							<a href="" class="btn btn-danger btn-sm col-md-4 ml"><i
								class="fa-solid fa-cart-arrow-down"></i> Add Cart</a> <a href=""
								class="btn btn-success btn-sm col-md-4 ml">View Details</a>
							 <a href="" class="btn btn-danger btn-sm col-md-3 ml"></i> ${book.price}</a>
						</div>
					</div>
				</div>
			</div>
			<!-- 2 
			
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
				</div>-->
				<!-- 3 
				
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
					</div>-->
					<!-- 4 
					
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
						</div>-->

               </div>
               </c:forEach>
               
               <div class="text-center">
                <a href="" class="btn btn-danger btn-sm text-center mt-3">View All</a>
               </div>
		</div>
	<!-- end Recent Book -->
	
<%@include file="allcomponent/footer.jsp" %>

</body>
</html>