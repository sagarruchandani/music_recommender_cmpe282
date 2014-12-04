<!DOCTYPE html>
<html lang="en">
<head>

<link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.min.css')}" type="text/css">
<link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
<link rel="stylesheet" href="${resource(dir: 'css', file: 'shop-homepage.css')}" type="text/css">

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="widtd=device-widtd, initial-scale=1">
<meta name="description" content="">
<meta name="autdor" content="">

<link rel="stylesheet" type="text/css" href="<g:createLinkTo dir='jquery' file='jRating.jquery.css'/>" media="screen" />
<title>Shop Homepage - Start Bootstrap Template</title>
<link rel="stylesheet" href="<g:createLinkTo dir='css' file='style.css'/>" />

<!-- Bootstrap Core CSS -->

<link rel="stylesheet" href="<g:createLinkTo dir='css' file='bootstrap.min.css'/>" />
<!-- Custom CSS -->
<link href="<g:createLinkTo dir='css' file='shop-homepage.css'/>" rel="stylesheet">
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
				
				<ul class="nav navbar-nav" style="float: right">
				<g:if test="${session?.user}">
				<li><g:link controller="UserLogin" action="profile">Hi, ${session?.user.username} </g:link></li>
					<li><g:link controller="UserLogin" action="logout">Logout</g:link></li>
					</g:if>
					<g:else>
	 				 <li class="active"><g:link controller="UserLogin" action="login">Login</g:link></li>
	 				 </g:else>
					<li><img style="margin: 10px" src="cart.png" widtd="31"
						height="27"> </img></li>
						<li class="dropdown">
				            <a href="#" data-toggle="dropdown" class="dropdown-toggle">My Recommendations <b class="caret"></b></a>
				            <ul class="dropdown-menu pull-right">
				                <li><g:link controller="MyRecommender" action="myRecommenderByGenre">By Genre</g:link></li>
				                <li class="active"><g:link controller="MyRecommender" action="myRecommenderByAlbum">By Album</g:link></li>
				                <li><g:link controller="MyRecommender" action="myRecommenderByArtist">By Artist</g:link></li>
				                <li><g:link controller="MyRecommender" action="myRecommenderByTrack">By Track</g:link></li>
				            </ul>
				        </li>
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
				<p class="lead">Top Recommendations</p>
				<div class="list-group">
					<g:link controller="UserLogin" action="login" class="list-group-item">Home</g:link>
				<g:link controller="RecommendByType" action="topartist" class="list-group-item">Top Artists</g:link>
				<g:link controller="RecommendByType" action="topalbum" class="list-group-item">Top Albums</g:link>
				<g:link controller="RecommendByType" action="topgenre" class="list-group-item">Top Genre</g:link>
				<g:link controller="RecommendByType" action="toptrack" class="list-group-item">Top Track</g:link>
				</div>
			</div>
			<div class="col-md-9">
				<table width="100%">
					<tr style="padding: 20px; margin: 5px;" id="linearBg2">
					<td class="head">User</td>
						<td class="head">Top Artists</td>
						
						
						<td class="head">Number of Ratings</td>
						
					</tr>

					
						<g:each var="d" in="${data}">
						<tr style="padding: 20px; margin: 5px;">
							<td class="head">${d[0]}
							</td>
							<td class="head">${d[1]}
							</td>
							
							<td class="head">${d[2]}
							</td>
						
						</tr>
						</g:each>

				</table>
				
			</div>
		</div>
		<!-- /.container -->
		<div class="container">
			<hr>
		</div>
		<!-- /.container -->
		<!-- jQuery -->
		<script src="<g:createLinkTo dir='jquery' file='jquery.js'/>"></script>
		<script src="<g:createLinkTo dir='jquery' file='jRating.jquery.js'/>"></script>
		<script src="<g:createLinkTo dir='js' file='bootstrap.min.js'/>"></script>
		<script src="<g:createLinkTo dir='jquery' file='jquery.tablesorter.pager.js'/>"></script>
		
		
		<script>
         function getPaging(e,f)
         {
         document.getElementById(e).className = "rating "+f+"star";
         }
      </script>
</body>
</html>
