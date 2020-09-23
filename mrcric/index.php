<?php
   ob_start();
   session_start();
   require('db.inc.php');
   
   if (isset($_POST['btnLogin']) || $_POST['btnLogin']=="Login")
	{
	$tusername=$_REQUEST['username'];
	$tusername=strtolower($tusername);
	$tpassword=$_REQUEST['password'];
	$tdatetime=strftime("%Y-%m-%d %H:%M:%S");
	$sql = "SELECT *,count(*) as login FROM `users` WHERE `username`='$tusername' and `password`= '$tpassword'";
	$result= mysql_query($sql) or die("<script> alert('Invalid Username or Password'); document.history(-1);</script>");
	if($row=mysql_fetch_assoc($result))
	{
	if($row['login']==0)
	{	
		echo "<script> alert('Invalid Username or Password'); document.history(-1);</script>";
	}
	else
	{	
		$_SESSION["login"]= true;
		$_SESSION["username"] = $tusername;
		$_SESSION["currentdate"] = $tdatetime;
		header("location:home.php");
			
	}
	}
}
?>
<?xml version="1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Mr.Cricket</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link rel="stylesheet" media="screen,projection" type="text/css" href="css/main.css" />
<!--[if lte IE 6]><link rel="stylesheet" type="text/css" href="css/main-msie.css" /><![endif]-->
<link rel="stylesheet" media="screen,projection" type="text/css" href="css/scheme.css" />
<link rel="stylesheet" media="print" type="text/css" href="css/print.css" />
</head>
<body>
<div id="main">
  <div id="header">
    <h1 id="logo"><a href="#"><span>Mr.</span> Cricket</a></h1>
    <hr class="noscreen" />
    <p class="noscreen noprint"><em>Quick links: <a href="#content">content</a>, <a href="#nav">navigation</a>, <a href="#search">search</a>.</em></p>
  </div>
  <hr class="noscreen" />
  <hr class="noscreen" />
  <div id="cols-top"></div>
  <div id="cols" class="box">
    <div id="content" align="left" style="padding-left:50px;">
	<form method="post" name="login">
          Username&nbsp;&nbsp;&nbsp;<input type="text" name = "username" id = "username" placeholder="Enter username"></br>
          Password&nbsp;&nbsp;&nbsp;<input name = "password" id = "password" type="password" placeholder="Password"></br>
          <input name="btnLogin" type="submit" id="btnLogin" value="Login" />
        </form>

    </div>
	
  <div id="cols-bottom"></div>
  <hr class="noscreen" />
  <div id="footer-top"></div>
  <div id="footer">
    <p class="f-right"><a href="http://www.nuviotemplates.com/">Free web templates by Nuvio</a>, sponsored by <a href="http://www.zufanek.cz/">Zufanek</a></p>
    <p>&copy;&nbsp;2008 <a href="#">Mr.Cricket</a></p>
  </div>
  <div id="footer-bottom"></div>
</div>
</body>
</html>
