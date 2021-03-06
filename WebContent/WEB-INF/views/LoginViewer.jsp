<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
   <link rel="stylesheet" href="resources/css/LoginViewer.css">
</head>

<body>

   <div class="header">
      <img class = "ImageGallery" src="resources/img/PVFukushima.jpg">
      <a href="home">
	     <img class="logo" src="resources/img/Picture2.png" style="margin-left: 4%; width: 25%">
	  </a>  

   </div>

   
   
   <div class="login-page">
    <h3 class="error" style="text-align: center">${errorMessage}</h3> <!-- EL -->
     <div class="form">
       <form class="login-form" action="authenticate" method="POST">
         <input type="text" placeholder="Username"/ name="name" required>
         <input type="password" placeholder="Password"/ name="pwd" required>
         <button>login</button>
         <p class="message">Not a member yet? <a href="registerpage">Register</a></p>
       </form>
     </div>
   </div>

   

   <footer class="footer-distributed">

		<div class="footer-left" style="width:30%">

        <img class="logo-bottom" src="resources/img/Picture2.png" style="margin-left: 2%; width: 100%"> 

			<p class="footer-links">
				<a href="home">Home</a>
				
				<a href="package">Packages</a>
				
				<a href="customize">Customize</a>
				
				<a href="#about">About</a>
				
				<a href="#">FAQ</a>
				
				<a href="#">Contact</a>
			</p>

			<p class="footer-company-name" style="margin-top:20px">&copy; 2019 FDM VOYAGE all rights reserved</p>			
			
		</div>

		<div class="footer-right">

			<p>Contact Us</p>

			<form action="feedback" method="post">

				<input type="text" name="email" placeholder="Email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"/>
				<textarea name="message" placeholder="Message"></textarea>
				<button>Send</button>

			</form>

		</div>

		</footer>
   
   
</body>

</html>