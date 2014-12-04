<!DOCTYPE html>
<html lang="en">
<head>
<style type="text/css">
.rating {
	width: 80px;
	height: 16px;
	margin: 0 0 20px 0;
	padding: 0;
	list-style: none;
	clear: both;
	position: relative;
	background: url(images/star-matrix.gif) no-repeat 0 0;
}
/* add these classes to the ul to effect the change to the correct number of stars */
.nostar {
	background-position: 0 0
}

.onestar {
	background-position: 0 -16px
}

.twostar {
	background-position: 0 -32px
}

.threestar {
	background-position: 0 -48px
}

.fourstar {
	background-position: 0 -64px
}

.fivestar {
	background-position: 0 -80px
}

ul.rating li {
	cursor: pointer;
	/*ie5 mac doesn't like it if the list is floated\*/
	float: left;
	/* end hide*/
	text-indent: -999em;
}

ul.rating li a {
	position: absolute;
	left: 0;
	top: 0;
	width: 16px;
	height: 16px;
	text-decoration: none;
	z-index: 200;
}

ul.rating li.one a {
	left: 0
}

ul.rating li.two a {
	left: 16px;
}

ul.rating li.three a {
	left: 32px;
}

ul.rating li.four a {
	left: 48px;
}

ul.rating li.five a {
	left: 64px;
}

ul.rating li a:hover {
	z-index: 2;
	width: 80px;
	height: 16px;
	overflow: hidden;
	left: 0;
	background: url(images/star-matrix.gif) no-repeat 0 0
}

ul.rating li.one a:hover {
	background-position: 0 -96px;
}

ul.rating li.two a:hover {
	background-position: 0 -112px;
}

ul.rating li.three a:hover {
	background-position: 0 -128px
}

ul.rating li.four a:hover {
	background-position: 0 -144px
}

ul.rating li.five a:hover {
	background-position: 0 -160px
}
/* end rating code */
h3 {
	margin: 0 0 2px 0;
	font-size: 110%
}
</style>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="widtd=device-widtd, initial-scale=1">
<meta name="description" content="">
<meta name="autdor" content="">
<link rel="stylesheet" type="text/css" href="jquery/jRating.jquery.css"
	media="screen" />
<title>Shop Homepage - Start Bootstrap Template</title>
<style>
audio {
	widtd: 150px;
}

#linearBg2 {
	/* fallback */
	background-color: #1a82f7;
	background: url(images/linear_bg_2.png);
	background-repeat: repeat-x;
	color: white;
	/* Safari 4-5, Chrome 1-9 */
	background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#1a82f7),
		to(#2F2727));
	/* Safari 5.1, Chrome 10+ */
	background: -webkit-linear-gradient(top, #2F2727, #1a82f7);
	/* Firefox 3.6+ */
	background: -moz-linear-gradient(top, #2F2727, #1a82f7);
	/* IE 10 */
	background: -ms-linear-gradient(top, #2F2727, #1a82f7);
	/* Opera 11.10+ */
	background: -o-linear-gradient(top, #2F2727, #1a82f7);
}

.head {
	padding: 10px;
	width: 25%;
}

table {
	border: 1px solid #eee;
}

#search {
	width: 700px;
}
</style>
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
		<div class="row"
			style="border: 1px #eee solid; background: #eee; margin: 5px; padding: 30px">
			<div style="width: 25%; float: left">
				<img src="song.jpg" width="200px" height="200px"></img>
			</div>
			<div style="width: 40%; display: inline-block;">
				<h1>Item Name</h1>
				<h2>Artist</h2>
				Current Rating
				<ul class="rating threestar" id="six">
					<li class="one"><a href="#" title="1 Star">1</a></li>
					<li class="two"><a href="#" title="2 Stars">2</a></li>
					<li class="three"><a href="#" title="3 Stars">3</a></li>
					<li class="four"><a href="#" title="4 Stars">4</a></li>
					<li class="five"><a href="#" title="5 Stars">5</a></li>
				</ul>
				<audio controls>
					<source src="horse.ogg" type="audio/ogg">
					<source src="horse.mp3" type="audio/mpeg">
					Your browser does not support the audio element.
				</audio>
			</div>
			<div style="width: 20%; float: right;">
				<h3>ADD TO CART</h3>
				</br>
				<form>
					<input type="hidden"></input> <input type="Button"
						value="Add to cart" class="btn"></input>

				</form>
				</br>
				</br>
				<p>LEAVE A RATING</p>
				<ul class="rating nostar" id="six">
					<li class="one"><a href="#" title="1 Star"
						onclick="getPaging('six','one')">1</a></li>
					<li class="two"><a href="#" title="2 Stars"
						onclick="getPaging('six','two')">2</a></li>
					<li class="three"><a href="#" title="3 Stars"
						onclick="getPaging('six','three')">3</a></li>
					<li class="four"><a href="#" title="4 Stars"
						onclick="getPaging('six','four')">4</a></li>
					<li class="five"><a href="#" title="5 Stars"
						onclick="getPaging('six','five')">5</a></li>
				</ul>
			</div>
		</div>
		<!-- /.container -->
		<div class="container">
			<hr>
		</div>
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
