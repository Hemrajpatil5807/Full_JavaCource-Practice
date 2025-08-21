<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>

    <!-- Bootstrap CSS (optional for styling) -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            margin: 40px;
        }
        .form-container {
            max-width: 400px;
            margin: auto;
            padding: 25px;
            border: 1px solid #ccc;
            border-radius: 10px;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h3 class="text-center">Login</h3>
    <form action="login">
        <!-- Username (Email) -->
        <div class="mb-3">
            <label>Username:</label>
            <input type="email" name="username" class="form-control" placeholder="Enter your email" required>
        </div>

        <!-- Password -->
        <div class="mb-3">
            <label>Password:</label>
            <input type="password" name="password" class="form-control" placeholder="Enter your password" required minlength="6">
        </div>

        <!-- Submit -->
        <div class="text-center">
            <button type="submit" class="btn btn-primary w-100">Log In</button>
        </div>
    </form>
</div>

<!-- Bootstrap JS (optional) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
