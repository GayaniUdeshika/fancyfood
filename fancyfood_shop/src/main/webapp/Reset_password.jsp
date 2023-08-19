<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Password</title>

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
					<h1 class="text-center font-weight-bold h3">Reset Password</h1>
					<form action="/fancyfood_shop/Reset_password" method="post">
						<div class="imgcontainer my-4 text-center">
						    <img src="/fancyfood_shop/img/user-profile.jpg" alt="Avatar" class="avatar img-fluid">
						</div>
					  
						<div>
							<div class="form-group">
								<label for="username" class="font-weight-bold">User ID:</label> 
								<input type="text" id="id" name="id" placeholder="Id" class="form-control" required>
							</div>
						</div>
						<div>
							<div class="form-group">
								<label for="username" class="font-weight-bold">User name:</label> 
								<input type="text" id="username" name="username" placeholder="User name" class="form-control" required>
							</div>
						</div>
						<div>
							<div class="form-group">
								<label for="password" class="font-weight-bold">Old Password:</label> 
								<input type="password" id="password" name="oldpassword" placeholder="Password" class="form-control" required>
							</div>
						</div>
						
						<div>
							<div class="form-group">
								<label for="password" class="font-weight-bold">New Password:</label> 
								<input type="password" id="password" name="newpassword" class="form-control" required>
							</div>
						</div>
						
						<div class="text-center">
							<button type="submit" class="btn font-weight-bold bg-info text-white px-5 py-2">Reset</button>
							<a href="index.html" class="btn font-weight-bold bg-danger text-white px-5 py-2">Cancel</a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


<script type="text/javascript">
	function closeForm() {
	    // Close the form 
	    window.close();
	}
</script>

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>