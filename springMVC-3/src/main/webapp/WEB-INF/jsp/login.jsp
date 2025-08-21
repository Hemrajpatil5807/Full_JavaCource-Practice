<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <title>Log-In to Veracity</title>
  <style>
    body {
      background-image: url(https://images.pexels.com/photos/30104418/pexels-photo-30104418/free-photo-of-abstract-winter-forest-in-ethereal-blur.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1);
      background-size: cover;
      background-position: top center;
    }

    .maindiv {
      background-color: white;
      border: 1px solid black;
      box-shadow: 1px 1px 10px 10px rgb(255, 250, 250);
      width: 40%;
      height: 600px;
      margin-left: 30%;
      margin-top: 40px;
    }

    .logo {
      border: 1px solid rgb(12, 19, 1);
      height: 25%;
      /* background-color: rgb(12, 1, 1); */
    }

    .logo img {
      width: 100%;
      height: 100%;
    }

    .icon {
      display: inline-flex;
    }

    img {

      width: 30px;
      height: 30px;
    }

    form {

      align-items: center;
      justify-content: center;
      font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
    }

    form input {
      border-radius: 3px;
      border: 2px solid rgb(31, 30, 30);
      width: 170px;
      font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
      font-size: medium;
      height: 30px;
      width: 200px;
      
    }

    .fCSS {
      margin-left: 180px;
      margin-top: 70px;
    }

    h3 {
      font-size: x-large;
    }

    .butt {
      margin-left: 85px;
      margin-top: 20px;

    }

    .butt button {

      border-radius: 3px;
      padding: 3px 20px;
      background-color: rgb(246, 241, 241);
      font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
      font-size: 16px;
      cursor: pointer;

    }

    .butt button:hover {
      background-color: black;
      color: rgb(246, 241, 241);
    }

    .link {
      margin-left: 37px;
    }

    .link a {
      text-decoration: none;
      cursor: pointer;
      color: rgb(88, 0, 170);
    }

    .link a:hover {
      color: blue;
    }

</style>

</head>

<body>
  <div class="maindiv">
    <div class="logo">
      <img src="https://media.designrush.com/agencies/751065/conversions/Veracity-Design-Studio-logo-profile.jpg"
        alt="Veracity logo" />
    </div>
    <div class="Secdiv">
      <div class="fCSS">
        <form action="loginUser" class="form" id="loginForm">
          <h3>${errorMsg}</h3>
          <h3>Sign in to your account.</h3> <br>
          <!-- <label for="username">Username</label><br /> -->
          <div class="icon">
            <!-- <img src="profile.png" alt="profile">-->
            <input type="text" name="username" placeholder=" Username" id="userName" required/>
          </div><br><br>
          <!-- <label for="password">Password</label><br /> -->
          <div class="icon">
            <!--  <img src="padlock.png" alt="password">-->
            <input type="password" name="password" placeholder=" Password" id="password" required /><br /><br />
          </div> <br>
          <div class="butt">
            <button>Log-In</button>
          </div> <br><br>
          <div class="link">
            <a href="#"> Forget Your Password ?</a>
            <a href="register">Sign-Up</a>
          </div>
        </form>
      </div>
    </div>
  </div>
 
</body>
</html>
