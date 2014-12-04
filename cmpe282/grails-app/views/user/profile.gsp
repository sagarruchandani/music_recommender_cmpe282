<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="widtd=device-widtd, initial-scale=1">
<meta name="description" content="">
<meta name="autdor" content="">
<link rel="stylesheet" type="text/css" href="jquery/jRating.jquery.css"
	media="screen" />
<title>Shop Homepage - Start Bootstrap Template</title>
<link rel="stylesheet" type="text/css" href="style.css">
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="css/shop-homepage.css" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view tde page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->
</head>
<body>
	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<!-- Collect tde nav links, forms, and otder content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<form style="float: left; margin: 10px">
					<input type="text" id="search"></input>
					<button type="submit" style="border: 0; background: transparent">
						<img src="search.png" width="30" height="30" alt="submit" />
					</button>
				</form>
				<ul class="nav navbar-nav" style="float: right">
					<li><a href="#">My Profile</a></li>
					<li><a href="#">Logout</a></li>
					<li><img style="margin: 10px" src="cart.png" widtd="31"
						height="27"> </img></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<p class="lead">Profile</p>
				<div class="list-group">
					<a href="#" class="list-group-item">View Past Orders</a> <a
						href="#" class="list-group-item">View My Cart</a> <a href="#"
						class="list-group-item">Get My Recommendations </a>
				</div>
			</div>
			<div class="col-md-9">
				<h1>Personal Information</h1>
				<table style="width: 100%">
					<tr>
						<td><h3>First Name:</h3></td>
						<td><h3>First Name</h3></td>
					</tr>

					<tr>

						<td>
							<h3>Last Name:</h3>
						</td>
						<td><h3>First Name</h3></td>
					</tr>

					<tr>
						<td><h3>Email</h3></td>
						<td><h3>First Name</h3></td>
					</tr>

					<tr>
						<td>
							<h3>Contact Number:</h3>
						</td>
						<td><h3>First Name</h3></td>
					</tr>
					</div>
					</div>
					<!-- /.container -->
					<div class="container"></div>
					<!-- /.container -->
					<!-- jQuery -->
					<script src="js/jquery.js"></script>
					<script type="text/javascript" src="jquery/jRating.jquery.js"></script>
					<!-- Bootstrap Core JavaScript -->
					<script src="js/bootstrap.min.js"></script>
					<script src="jquery/jquery.tablesorter.pager.js"></script>
					<script>
         function getPaging(e,f)
         {
         document.getElementById(e).className = "rating "+f+"star";
         }
      </script>
</body>
</html>
