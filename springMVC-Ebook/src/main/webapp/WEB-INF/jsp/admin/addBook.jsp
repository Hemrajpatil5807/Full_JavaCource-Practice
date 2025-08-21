<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin: Add Book</title>

<%@include file="//WEB-INF/jsp/allcomponent/allCss.jsp"%> 

</head>
<body style="background-color: #f1f0eb">

  <%@include file="navbar.jsp"%>

<div class="container mt-3 col-md-4">
    <div class="card shadow-lg">
        <div class="card-header  text-black text-center">
            <h4 class="mb-0">Add New Book</h4>
            <h6 style="color:green">${msg}</h6>
            <h6 style="color:green">${errmsg}</h6>
        </div>
        <div class="card-body">
            <form action="addBook" method="post" enctype="multipart/form-data">
                <div class="mb-3">
                    <label for="bookname" class="form-label">Book Name</label>
                    <input type="text" class="form-control" id="bookname" name="bookName" required>
                </div>
                <div class="mb-3">
                    <label for="author" class="form-label">Author</label>
                    <input type="text" class="form-control" id="author" name="author" required>
                </div>
                <div class="mb-3">
                    <label for="price" class="form-label">Price (₹)</label>
                    <input type="number" step="0.01" class="form-control" id="price" name="price" required>
                </div>
                <div class="mb-3">
                    <label for="bookcategory" class="form-label">Category</label>
                    <select class="form-select" id="bookcategory" name="bookCategory" required>
                        <option value="">-- Select Category --</option>
                        <option value="Recent">Recent</option>
                        <option value="New">New</option>
                        <option value="Old">Old</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label class="form-label">Status</label><br>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="status" id="available" value="Available" required>
                        <label class="form-check-label" for="available">Available</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="status" id="outofstock" value="Out of Stock">
                        <label class="form-check-label" for="outofstock">Out of Stock</label>
                    </div>
                </div>
                <div class="mb-3">
                    <label for="photo" class="form-label">Book Cover Photo</label>
                    <input class="form-control" type="file" id="photo" name="file" required>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Admin Email</label>
                    <input type="email" class="form-control" id="email" name="email" required>
                </div>
                <div class="text-center">
                  <button type="submit" class="btn btn-success">Add Book</button>
                </div>
            </form>
        </div>
    </div>
</div>


  <%@include file="footer.jsp"%>

</body>
</html>