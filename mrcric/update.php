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
  <div id="nav" class="box">
    <h3 class="noscreen">Navigation</h3>
    <ul><li><a href="inventory.php">Inventory add</a></li>
      <li><a href="home.php">Issue</a></li>
      <li><a href="additem.php">Add item</a></li>
      <li id="nav-active"><a href="#">Update item</a></li>
    </ul>
  </div>
  <hr class="noscreen" />
  <div id="cols-top"></div>
  <div id="cols" class="box">
    <div id="content">
      <?php
include('db.inc.php');
$dateadd=date("Y-m-d");
//$itemno = $_POST['refno'];
$desc = $_POST['title'];
$trademark = $_POST['trademark'];
$uprice = $_POST['uprice'];
$rec = $_POST['rec'];
$remarks = $_POST['remarks'];
$item = $_POST['lstitem'];

$sql="SELECT * FROM `items` WHERE `itemno`='$item';";
$result=mysql_query($sql) or die("Mysql error importing!");
while($row=mysql_fetch_array($result)){
	$desc = $row['item'];
	$trademark = $row['trademark'];
}
if (isset($_POST['btnSave']) or $_POST['btnSave']=="Submit"){
$desc = $_POST['title'];
$trademark = $_POST['trademark'];
$sql="update `items` set `item`='$desc',`trademark`='$trademark' where `itemno`='$item'";
$result=mysql_query($sql) or die("Mysql error1");
}
?>
<div class="register-container container">
            <div class="row">
<div class="register span6">
<form name="books" action="" method="post" autocomplete="off" onSubmit="return formValidation();">

<table width="100%" border="0" align="center">
    <tbody>
      <tr>
        <td width="30%"><label for="textfield2">Item:</label></td>
        <td width="70%"><select style="align:left" name="lstitem" size="1" id="lstitem"  onchange="submit()" >
        <option selected="selected"><?php echo $item;?></option>
           <?php
				$sql="SELECT * FROM items ORDER BY item ASC";
				$result = mysql_query($sql) or die("Item error !!");
				while($row=mysql_fetch_assoc($result))
				{
				?>
				<option value="<?php echo $row['itemno'];?>"
				<?php  
					if(($row['itemno'])===$_REQUEST['lstitem'])
						echo "selected=\"selected\"" ;
				?>>
			    <?php 
					echo $row['item']."-".$row['trademark'];
				?>
			    </option>
				<?php
					}
				?>
        </select></td>
      </tr>
	  <tr>
        <td><label for="textfield3">Description:</label></td>
		<td><input class="txtstyle" type="text" name="title" id="title" value="<?php echo $desc; ?>"/></td>
		</tr>
	<tr>
        <td><label for="textfield3">Trademark:</label></td>
		<td><input class="txtstyle" name="trademark" type="text" id="trademark"  value="<?php echo $trademark ;?>" /></td>
		</tr>
      
      <tr>
         <td colspan="2" style="padding-left:150px;"> <center><input class="btnstyle" name="btnSave" type="submit" id="btnSave" value="Submit" /></center></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </tbody>
  </table>
  </div></div></div>
  </div>
    <hr class="noscreen" />
    <div id="aside">
      <!--h3 class="title">Existing Items</h3>
      <div class="aside-padding">
        <div id="search">
          <form action="#" method="get">
            <div> <span class="noscreen">Fulltext:</span>
              <input type="text" size="30" name="query" id="search-input" />
              <input type="submit" value="Search" id="search-submit" />
            </div>
          </form>
        </div>
      </div>
      <hr class="noscreen" /-->
      
      <h3 class="title">Complete list</h3>
      <div class="aside-padding">
        <table id="archive">
		<?php
		$sql="select * from items";
		$result=mysql_query($sql) or die("Error in SQL8");
		while($row=mysql_fetch_array($result))
		{
			$itemno1 = $row['itemno'];
			$sql1="SELECT SUM(`qty_rec`-`qty_issued`) as rec FROM `itemtransaction` WHERE itemno=$itemno1";
			$result1=mysql_query($sql1) or die("Error in SQL81");
			while($row1=mysql_fetch_array($result1))
			{
		?>
	      <tr>
            <td><a href="#"><?php echo $row['item']; ?></a></td>
            <td class="t-right low"><?php echo $row1['rec']; ?></td>
          </tr>
		 <?php
		 }}
		 ?>
         </table>
      </div>
      <hr class="noscreen" />
      
    </div>
  </div>
  <div id="cols-bottom"></div>
  <hr class="noscreen" />
  <div id="footer-top"></div>
  <div id="footer">
    <p class="f-right"><a href="http://www.mrcricket.lk/">Mr.Cricket</a></p>
    <p>&copy;&nbsp;2018 <a href="#">Mr.Cricket</a></p>
  </div>
  <div id="footer-bottom"></div>
</div>
</div>
</body>
</html>
