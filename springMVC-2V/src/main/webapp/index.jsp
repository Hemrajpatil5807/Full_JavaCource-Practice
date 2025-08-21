<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Veracity Soft.pvt.ltd</title>
    
 <style type="text/css">
     *{
    margin: 0;
    padding: 0;
} 

body{
    /* border: 1px solid gray; */
    /* height: 100vh; */
    
}
ul{
    list-style-type: none;
    padding:0%;
}
li{
    padding: 0%;
}
a{
    text-decoration: none;
}
.header{
    height: 100vh; 
    width: 100%;
    /* border: 2px solid black; */
    background-image: url(https://img.freepik.com/premium-photo/html-system-websites-concept_23-2150323552.jpg?semt=ais_hybrid);
    background-size: cover;
    background-repeat: no-repeat;
}

.logo{
    width:150px;
    height:fit-content;
    padding-left: 65px;
}
img{
    width:100%;
    height: 70px;
}
.nav{
   /* overflow: hidden; */
    margin-top: 5px;
    display:flex;
    flex-direction:row;
    /* flex-wrap: wrap;    Use to make Responsive  */
    width: 100%;
    height: 70px;
    position:sticky;
    top: 0;
    z-index: 1000;
    border-bottom: 1px solid gainsboro; 
    align-items: center;
    justify-content: space-between;
    background-color:#fff; 
}
.link{
    width:40%;
    display: flex;
    /* flex-direction:row; */
    align-items: center;
    gap:2rem;
    margin-left: 640px;
    /* transition: 0.5s;
    z-index: -1; */
    cursor: pointer;
}

.link a{
    /* margin-top: 1px; */
    padding:16px;
    /* background-color:rgb(81, 210, 81); */
    color: black;
    font-size:large;
    font-weight: bolder;
 
}
.link a.active {
    background-color: white;
    color: red;
}
.link a:hover{
	background-color: white; 
    color:#c00427;
 
}


/* Button */
.dropbtn {
  background-color: white; 
  color: black;
  padding: 10px 20px;
  font-size:large;
  font-weight: bolder;
  border: none;
  cursor: pointer;
}

.dropbtn:hover{
	background-color:white;
    color:#c00427;
}

/* Container */
.dropdown {
  position: relative;
  display: inline-block;
}

/* Dropdown items */
.dropdown-content {
  display: none;
  position: absolute;
  background-color: white; 
  min-width: 160px;
  border: 1px solid #ccc;
  box-shadow: 0px 4px 8px rgba(0,0,0,0.1);
  z-index: 1;
}

/* Dropdown links */
.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  overflow:visible;
}

/* Show on hover */
.dropdown:hover .dropdown-content {
  display: block;
  overflow:visible;
}

/* Optional: Hover effect */
.dropdown-content a:hover {
  background-color:white ;
  color:#c00427;
}


.log a{
    margin-right: 60px;
    font-size: larger;
    font-weight: bolder;
    color: black;
} 
/* .log a:hover{
    background-color: aliceblue;
    color:black;
    border: hidden;
    border-radius: 2px;
    padding: 8px;
    
} */
.section_header{
    height: 300px;
    margin-left: 18%;
    padding: 5rem 2rem;
    color: #fff;
}
.head_content{
    max-width: 600px;
    margin-top: 5rem;
}
.head_content h1{
    margin-bottom: 1rem;
    font-size: 3rem;
    font-weight: 600;
    line-height: 4rem; 
}
.head_content h2{
    margin-bottom: 2rem;
    font-size: 2rem;
    font-weight: 600;
}
.btn{
    padding: .75rem 1.5rem;
    color: white;
    background-color: #da042a;
    transition: 0.3s;
    outline: none;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    width:auto;
   
}
.btn:hover{
    background-color: #c00427;
}


.footer{
    width: 100%;
    height: 35px;
    color:#c00427;
    background-color: rgb(255, 246, 246);
    text-align: center;
    justify-items: center;
    position:sticky;
    overflow:visible;
    margin-bottom: 0;
   
}
.footer_content{
    justify-items: center;
}
.footer_content h5{
    padding-top: 10px;
}

    
    </style>
    
</head>
<body>
    <div> <!-- This div content all web-page content -->
    <div class="header">
        <div class="nav">
            <div class="logo">
                <a href="#"><img src="https://veracity-us.com//images/veracityNew-Logo.png" alt="Veracity Logo"></a>
            </div>
            
                <ul class="link" id="link">
                    <li><a href="navbar.html" class="active">Home</a></li>
                    <li><a href="about.html">About Us</a></li>
                    <li><a href="register.jsp">Register</a></li>
                </ul>
           
            <div class="log">
                <a href="login.jsp"><button class="btn">Log-In</button></a>
            </div>
        </div>   
       <div class="section_header" id="home">
        <div class="head_content">
            <h1>Welcome to Veracity</h1>
            <h2>Trusted Name in IT</h2>
            <h3>${successMsg}</h3><br>
            <div class="head_butt">
                <a href="https://in.linkedin.com/company/veracity-software-pvt.-ltd."><button class="btn">Explore More</button></a>
            </div>
        </div>
    </div>
    </div>

    
  </div> <!-- This div content all web-page content -->

  <footer class="footer"> 
    <div class="footer_content">
        <h5>VeracitySoft.pvt.LTD@copyrights2025</h5>
    </div>
</footer>


</body>
</html>