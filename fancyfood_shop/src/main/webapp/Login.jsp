<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<style>
	img.avatar {
	  width: 150px;
	  border-radius: 50%;
	}
</style>
</head>
<body>

	<div class="container">
		<div class="row justify-content-center align-items-center">
			<div class="col-md-7">
				<div class="py-5 my-5 bg-light border shadow-lg p-4">
					<h1 class="text-center font-weight-bold h3">HR Management System</h1>
					<form action="LoginServlet" method="post">
					
						<div class="imgcontainer my-4 text-center">
						    <img src="/fancyfood_shop/img/user-profile.jpg" alt="Avatar" class="avatar img-fluid">
						</div>
					  
						<div>
							<div class="form-group">
								<label for="username" class="font-weight-bold">User name:</label> 
								<input type="text" id="username" name="username" class="form-control" required>
							</div>
						</div>
						
						<div>
							<div class="form-group">
								<label for="password" class="font-weight-bold">Password:</label> 
								<input type="password" id="password" name="password" class="form-control" required>
							</div>
						</div>
						
						<div class="text-center">
							<button type="submit" class="btn font-weight-bold bg-info text-white px-5 py-2">Login</button>
							<button type="submit" class="btn font-weight-bold bg-info text-white px-5 py-2">Login</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


<script type="text/javascript">

</script>

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>