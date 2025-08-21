<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>

    <!-- Bootstrap CSS (optional for styling) -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            margin: 20px;
        }
        .form-container {
            max-width: 600px;
            margin: auto;
            padding: 25px;
            border: 1px solid #ccc;
            border-radius: 10px;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2 class="text-center">Registration Form</h2>
    <form action="register" method="post">
        <!-- Name -->
        <div class="mb-3">
            <label>Name:</label>
            <input type="text" name="name" class="form-control" required pattern="[A-Za-z ]+" title="Only alphabets allowed">
        </div>

        <!-- Email -->
        <div class="mb-3">
            <label>Email:</label>
            <input type="email" name="email" class="form-control" required>
        </div>

        <!-- Mobile -->
        <div class="mb-3">
            <label>Mobile:</label>
            <input type="text" name="mobile" class="form-control" required pattern="[6-9][0-9]{9}" title="Enter valid 10-digit mobile number">
        </div>

        <!-- Address -->
        <div class="mb-3">
            <label>Address:</label>
            <textarea name="address" class="form-control" rows="2" required></textarea>
        </div>

        <!-- PAN -->
        <div class="mb-3">
            <label>PAN Number:</label>
            <input type="text" name="pan" class="form-control" required pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}" title="Enter valid PAN (e.g. ABCDE1234F)">
        </div>

        <!-- Aadhar -->
        <div class="mb-3">
            <label>Aadhar Number:</label>
            <input type="text" name="aadhar" class="form-control" required pattern="\d{12}" title="Enter 12-digit Aadhar number">
        </div>

        <!-- Gender -->
        <div class="mb-3">
            <label>Gender:</label><br>
            <input type="radio" name="gender" value="Male" required> Male
            <input type="radio" name="gender" value="Female"> Female
            <input type="radio" name="gender" value="Other"> Other
        </div>

        <!-- DOB -->
        <div class="mb-3">
            <label>Date of Birth:</label>
            <input type="date" name="bDate" class="form-control" required max="<%= java.time.LocalDate.now() %>">
        </div>

        <!-- Job Role -->
        <div class="mb-3">
            <label>Job Role:</label>
            <select name="role" class="form-control" required>
                <option value="">-- Select Role --</option>
                <option>Developer</option>
                <option>Tester</option>
                <option>Manager</option>
                <option>Intern</option>
            </select>
        </div>

        <!-- Salary -->
        <div class="mb-3">
            <label>Salary:</label>
            <input type="number" name="salary" class="form-control" required min="1000" step="100">
        </div>

        <!-- Submit Button -->
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Register</button>
        </div>
    </form>
</div>

<!-- Bootstrap JS (optional) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
