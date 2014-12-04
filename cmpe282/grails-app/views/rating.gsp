
<!DOCTYPE html>
<html lang="en">

<head>
<link rel="stylesheet" type="text/css" href="jquery/jRating.jquery.css"
	media="screen" />
<!-- jQuery files -->
<script type="text/javascript" src="jquery/jquery.js"></script>
<script type="text/javascript" src="jquery/jRating.jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
      // simple jRating call
      $(".basic").jRating();
 
      
 
      // get the clicked rate !
      $(".basic").jRating({
        onClick : function(element,rate) {
         alert(rate);
        }
      });
});
</script>
</head>
<body>
	<div class="exemple">

		<!-- in this exemple, 12 is the average and 1 is the id of the line to update in DB -->
		<div class="basic" data-average="12" data-id="1"></div>

		<!-- in this other exemple, 8 is the average and 2 is the id of the line to update in DB -->
		<div class="basic" data-average="8" data-id="2"></div>

	</div>
</body>
</html>