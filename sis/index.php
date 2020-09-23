<?php 
if(!isset($_session["user"])) {
	session_start();
	$_session["user"]="gamini";
}

?>

<html>
	<head>
       		<script language="javascript" src="jsfunction (1).js"></script>
	</head>
	<meta content="text/html;charset=utf-8" http-equiv="Content-Type">
<meta content="utf-8" http-equiv="encoding">
	</head>
	<body>
	  <div id="headerArea" style="background-color:#417da1">
		
		<span style="color:white">
		<h2><img align="middle" src="logohr.jpg" width="75" height="78" >
                    HUMAN RESOURCES MANAGEMENT SYSTEM<br>
                </h2>
		</span>
          </div>
          
	  <div id="navigationArea" > </div>

      <div id="menuArea" >This is the menu area.
	  </div>
	  <hr style="color:pink">
	  <div id="formArea" >
    		<form name="loginForm" method="post" accept-charset="utf-8" >

		        <table align='center' border='1' style='background-color:#c2d4e0' ><tr><td>
	           		<div><img src="logohr.jpg" width="267" height="260"/></div>
	         
		   		<div>&nbsp;&nbsp;&nbsp;User Name :
		  		<input type="text" name="username" class="textbox_one" /></div>
	           		<div>&nbsp;&nbsp;&nbsp;Password &nbsp; :
	           		<input type="password" name="password" class="textbox_one" /></div>
	            		<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    		<input name="login" type="submit" class="button_one" id="login" value="Sign in" onClick="userLogin()" /></div>
	       		</td></tr></table>
        	</form>
	  </div>
	<div id="msgArea"></div>
	</body>

</html>