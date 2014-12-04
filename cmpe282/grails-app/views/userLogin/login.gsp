<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="widtd=device-widtd, initial-scale=1">
<meta name="description" content="">
<meta name="autdor" content="">

<link rel="stylesheet" type="text/css"
	href="<g:createLinkTo dir='jquery' file='jRating.jquery.css'/>"
	media="screen" />
<title>Shop Homepage - Start Bootstrap Template</title>

		
<link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.min.css')}" type="text/css">
<link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'shop-homepage.css')}" type="text/css">
<g:javascript src = "jquery.js"></g:javascript>
<g:javascript src = "bootstrap.js"></g:javascript>
<g:javascript src = "bootstrap.min.js"></g:javascript>

</head>
<body>		
	<div class="" id="loginModal">
		<div class="modal-header">

			<h3>Have an Account?</h3>
		</div>
		<div class="modal-body">
			<div class="well">
				<ul class="nav nav-tabs">
					<li class="active"><a href="#login" data-toggle="tab">Login</a></li>
					<li><a href="#create" data-toggle="tab">Create Account</a></li>
				</ul>
				<div id="myTabContent" class="tab-content">
					<div class="tab-pane active in" id="login">
						<g:form url="[controller:'UserLogin',action:'login']" class="form-horizontal"  method="POST">
							<fieldset>
								<div id="legend">
									<legend class="">Login</legend>
								</div>
								<div class="control-group">
									<!-- Username -->
									<label class="control-label" for="username">Username</label>
									<div class="controls">
										
											
									<g:textField type="text" id="username" name="username" class="input-xlarge"/>
									</div>
								</div>

								<div class="control-group">
									<!-- Password-->
									<label class="control-label" for="password">Password</label>
									<div class="controls">
										
										<g:passwordField  name="password" id="password" name="password"
											 class="input-xlarge"/>
									</div>
								</div>


								<div class="control-group">
									<!-- Button -->
									<div class="controls">
										<g:submitButton value="Login" name="Login" class="btn btn-success"/>
									</div>
								</div>
							</fieldset>
						</g:form>
					</div>
					<div class="tab-pane fade" id="create">
						<g:form url="[controller:'UserLogin',action:'register']" class="form-horizontal" method="POST" id="tab">
							<label>Username</label> 
								<g:textField type="text" id="username" name="username" class="input-xlarge"/><br>
								 <label>First Name</label>
								<g:textField type="text" id="fname" name="fname" class="input-xlarge"/><br>
								 <label>Last Name</label> 								
								<g:textField type="text" id="lname" name="lname" class="input-xlarge"/><br>
 						<label>Email</label>
						<g:textField type="text" id="email" name="email" class="input-xlarge"/><br>
 							<label>Address</label>
						<g:textField type="text" id="address" name="address" class="input-xlarge"/><br>
						<label>Password</label>
				<g:passwordField  name="password" id="password" name="password"
											placeholder="" class="input-xlarge"/><br>
							<div>
							<g:submitButton value="create" name="Create Account" class="btn btn-primary"/>
							</div>
						</g:form>
					</div>
				</div>
			</div>
		</div>

		<script class="cssdeck"
			src="http:/cdnjs.cloudflare.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<script class="cssdeck"
			src="http:/cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.1/js/bootstrap.min.js"></script>
</div>
</body>
</html>			