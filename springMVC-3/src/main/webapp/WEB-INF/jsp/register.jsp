<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration | Veracity Soft</title>
<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body {
	background-color: #f0f4f8;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 30px;
}

.mainDiv {
	max-width: 650px;
	width: 100%;
	background: #ffffff;
	padding: 30px 40px;
	border-radius: 12px;
	box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
}

.mainDiv h2 {
	text-align: center;
	margin-bottom: 10px;
	font-size: 28px;
	color: #da042a;
}

.mainDiv p.subtitle {
	text-align: center;
	font-size: 14px;
	color: #666;
	margin-bottom: 20px;
}

form label {
	display: block;
	margin-bottom: 5px;
	color: #333;
	font-weight: 500;
}

form input, form select, form textarea {
	width: 100%;
	padding: 10px 12px;
	margin-bottom: 20px;
	border: 1px solid #ccc;
	border-radius: 6px;
	font-size: 15px;
}

.name-group {
	display: grid;
	grid-template-columns: repeat(3, 1fr);
	gap: 15px;
}

.row-group {
	display: flex;
	gap: 20px;
	flex-wrap: wrap;
}

.row-group>div {
	flex: 1 1 45%;
}

.button-group {
	display: flex;
	justify-content: center;
	gap: 20px;
}

.button {
	padding: 10px 30px;
	background-color: #c00427;
	color: white;
	border: none;
	border-radius: 6px;
	font-size: 16px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

.button:hover {
	background-color: #da042a;
}

.button.reset {
	background-color: #e0e0e0;
	color: #333;
}

.button.reset:hover {
	background-color: #d5d5d5;
}

textarea {
	resize: vertical;
}
</style>
</head>
<body>
	<div class="mainDiv">
		<h2>Registration Form</h2>
		<p class="subtitle">Fill out the form carefully for registration</p>
		<form action="register" method="post">
			<label>Employee Name</label>
			<div class="name-group">
				<input type="text" name="name" placeholder="First Name" required>
				<input type="text" name="name" placeholder="Middle Name">
				<input type="text" name="name" placeholder="Last Name" required>
			</div>

			<div class="row-group">
				<div>
					<label for="mobile">Mobile</label> <input type="tel" name="mobile"
						pattern="[0-9]{10}" maxlength="10" placeholder="10-digit number"
						required>
				</div>
				<div>
					<label for="email">Email</label> <input type="email" name="email"
						placeholder="you@example.com" required>
				</div>
			</div>

			<div class="row-group">
				<div>
					<label for="bDate">Birth Date</label> 
					<input type="date" name="bDate" required>
				</div>
				<div>
					<label for="Gender">Gender</label> 
					<select name="gender" required>
						<option value="">Select Gender</option>
						<option value="Male">Male</option>
						<option value="Female">Female</option>
						<option value="Other">Other</option>
					</select>
				</div>
			</div>

			<label for="Address">Address</label>
			<textarea name="address" rows="4"
				placeholder="Enter your permanent address" required></textarea>

			<div class="button-group">
				<button type="submit" class="button">Submit</button>
				<button type="reset" class="button reset">Reset</button>
			</div>
		</form>
	</div>
</body>
</html>
