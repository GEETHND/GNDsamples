<?php
include('db.inc.php');
session_start();
$tusername = $_SESSION["username"];
$loguser = $tusername;

$dateadd=date("Y-m-d");
$itemno = $_POST['refno'];
$item = $_POST['item'];
$batch = $_POST['batch'];
$trademark = $_POST['trademark'];
$uprice = $_POST['uprice'];
$disc = $_POST['disc'];
$iss = $_POST['iss'];
if($iss!=0){
	$total = ($uprice*$iss)-$disc;
}
else{
	$total = $uprice-$disc;	
}

$_SESSION['dateadd'] = '2017-11-28';

$sql="SELECT * FROM `items`,itemtransaction where itemtransaction.itemno=items.itemno and itemtransaction.itemno='$item' and itemtransaction.batch='$batch'";
$result = mysql_query($sql) or die("Mysql error item loading");
while($row=mysql_fetch_assoc($result)) {
	$uprice=$row['uprice'];
	$itemno=$row['itemno'];
	$sql="SELECT sum(qty_rec) as r, sum(qty_issued) as i FROM itemtransaction where itemtransaction.itemno=$itemno and itemtransaction.batch='$batch'";
	$result = mysql_query($sql) or die("Mysql error qty loading");
	while($row=mysql_fetch_assoc($result)) {
		$inhand=$row['r']-$row['i'];
	}}

if (isset($_POST['btnadd']) or $_POST['btnadd']=="Add items")
{
$taddno=$_SESSION['addno']++;
$iss = $_POST['iss'];
$uprice1 = $_POST['uprice'];
$disc = $_POST['disc'];
$price = (($uprice1*$iss)-$disc)/$iss;
$sql="SELECT * FROM `items`,itemtransaction where itemtransaction.itemno=items.itemno and itemtransaction.itemno='$item'";
$result = mysql_query($sql) or die("Mysql error item loading");
while($row=mysql_fetch_assoc($result)) {
	$itemno=$row['itemno'];
if ($taddno==0)
$error=0;
$recno=0;

 $sql="select * from titem where itemno='$ticode' and user='$loguser'";
 $result=mysql_query($sql) or die("Mysql errorb");
 $recno= mysql_num_rows($result);

if($error==0)
{
$sql="select * from items where itemno='$itemno'";
$result=mysql_query($sql) or die("Mysql errora");

while ($row=mysql_fetch_array($result))
{
	   $titem=$row['item']  ;
}
echo "<script> alert ('$itemno, $uprice1, $price, $iss, $loguser not found!')</script>";
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
$titem1=addslashes(trim($titem));
$sql="INSERT INTO `titem` (`itemno`, `uprice`, `price`, `qty_issued`, `batch`, `user`) VALUES ('$itemno', '$uprice1', '$price', '$iss', '$batch', '$loguser');";
$result=mysql_query($sql) or die("Mysql errora1");
}
}}
	
if ($_POST['btnSave']=="Save"){
$error=0 ;
if ($error==0){
if ($error==0){
$recno=0;
$sql="select * from titem where user='$loguser'" ;
$result=mysql_query($sql) or die("Mysql error selecting titem!");
$recno= mysql_num_rows($result);

if ($recno==0){
$error=1;
echo "<script> alert ('Items not found!')</script>";
}

if ($error==0){
$recno=0;
$tu=$loguser;
$tv=0;

if ($error==0){
if ($tu==$loguser or $tusergroup=='A'){
$i=0;
$tcount=0;

$sql="select * from `titem` where user='$loguser'" ;
$result=mysql_query($sql) or die("Mysql error41");

$sqlor="select max(ordno) as ord from `itemtransaction`" ;
$resultor=mysql_query($sqlor) or die("Mysql erro order");
while($rowor = mysql_fetch_array($resultor)){
$ordno = $rowor['ord']+1;

$ttotval=0;
$no=0;
while ($row=mysql_fetch_array($result))
	  {
	  $no++;
	  $tic=$row['itemno'];
	  $td=$row['uprice'];
	  $q=$row['price'];
	  $idesc=$row['qty_issued'];
	  $nreq=$row['remarks'];
	  $bat=$row['batch'];
	  $sql1="INSERT INTO itemtransaction (`ordno`,`itemno`,`uprice`,`price`,`qty_issued`,`qty_rec`,`remarks`,`batch`, `date_add`) VALUES ('$ordno','$tic', '$td', '$q', '$idesc',0, '$nreq', '$bat', '$dateadd');"	 ; 
	 $result1=mysql_query($sql1) or die("Mysql error5");
	 }
	 }
	 $trecno=0;  

 	$sql2="DELETE from titem where user='$loguser'" ;
	$result2=mysql_query($sql2) or die("Cant delete!!");
	echo "<script> alert ('Request added successfully!!'); </script>";
	unset($_REQUEST);
	$trademark="";
	$uprice="";
header("location:rpt.php?ordno=$ordno");
	}
$savebtn="disabled";
$editbtn="disabled";
}
else
echo "<script> alert ('You have no rights to add a request.')</script>";
}
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
  <div id="nav" class="box">
    <h3 class="noscreen">Navigation</h3>
    <ul><li><a href="inventory.php">Inventory add</a></li>
      <li id="nav-active"><a href="#">Issue</a></li>
      <li><a href="additem.php">Add item</a></li>
      <li><a href="update.php">Update item</a></li>     
    </ul>
  </div>
  <hr class="noscreen" />
  <div id="cols-top"></div>
  <div id="cols" class="box">
    <div id="content">

<div class="register-container container">
            <div class="row">
<div class="register span6">
<form name="books" action="" method="post" autocomplete="off" onSubmit="return formValidation();">

<table width="100%" border="0" align="center">
    <tbody>
      <tr>
        <td width="30%"><label for="textfield2">Item :</label></td>
		<td><select name="item" id="item" onChange="submit()">
               <option selected="selected">--Select</option>
			   <?php
					$sql="SELECT * FROM items ORDER BY item ASC";
					$result = mysql_query($sql) or die("Item error !!");
					while($row=mysql_fetch_assoc($result))
					{
					?>
					<option value="<?php echo $row['itemno'];?>"
					<?php  
						if(($row['itemno'])===$_REQUEST['item'])
							echo "selected=\"selected\"" ;
					?>>
					<?php 
						echo $row['item']."-".$row['trademark'];
					?>
					</option>
					<?php
						}
					?>
				</select>
		</td>
	</tr>
	<tr>
        <td width="30%"><label for="textfield2">Batch :</label></td>
		<td><select name="batch" id="batch" onChange="submit()">
               <option selected="selected"><?php echo $batch;?></option>
			   <?php
					if (($_REQUEST['item']<>0) )
								{	
									$item="$_REQUEST[item]";
					$sql="SELECT distinct(batch) FROM itemtransaction where itemno=$item";
					$result = mysql_query($sql) or die("Item error !!");
					while($row=mysql_fetch_assoc($result))
					{
					?>
					<option value="<?php echo $row['batch'];?>"
					<?php  
						if(($row['batch'])===$_REQUEST['batch'])
							echo "selected=\"selected\"" ;
					?>>
					<?php 
						echo $row['batch'];
					?>
					</option>
					<?php
						}}
					?>
							  </select>
		</td>
	</tr>
	<tr>
        <td><label for="textfield4">Unit price:</label></td>
        <td><input class="txtstyle" type="text" name="uprice" id="uprice" value="<?php echo ($uprice*1.35); ?>" onchange="submit()"></td>
      </tr>
	 <tr>
        <td><label for="textfield4">Qty. in hand:</label></td>
        <td><input class="txtstyle" type="text" name="inhand" id="inhand" value="<?php echo $inhand; ?>"></td>
      </tr>
      <tr>
        <td><label for="textfield4">Discount:</label></td>
        <td><input class="txtstyle" type="text" name="disc" id="disc" value="<?php echo $disc; ?>" onchange="submit()"></td>
      </tr>
      <tr>
        <td><label for="textfield5">Issuing qty.:</label></td>
		<td><input class="txtstyle" type="text" name="iss" id="iss" value="<?php echo $iss; ?>" onchange="submit()"></td>
      </tr>
      <tr>
        <td><label for="textfield6">Total:</label></td>
       	<td><input class="txtstyle" type="text" name="total" id="total" value="<?php echo $total; ?>"/>
</td></tr>
<tr>
		<td><input type="submit" name="btnadd" value="Add items" id="btnadd"  <?php echo $addbtn; ?>/></td>
      </tr>
      
<table width="100%" border="0" align="center">
	<tr bgcolor="#8DDE35">
		<th width="72" bgcolor="#8DDE35">Item Code</th>
		<th width="57" bgcolor="#8DDE35">Price</th>
		<th width="58" bgcolor="#8DDE35">Qty</th>
		<th width="62" bgcolor="#8DDE35">  </th>
	</tr>
	<?php  
	$sql="select * from titem where user='admin'";
	$result=mysql_query($sql) or die("Error in SQL8");
	while($row=mysql_fetch_array($result))
	{
	?>
	<form action="" name="form1" method="post">
	<tr>
	<td align="center"><?php echo $row['itemno']; ?></td>
	<td align="center" ><?php echo $row['price']; ?></td>
	<td align="right"><?php echo number_format($row['qty_issued'],2); ?></td>
	<td><div align="center"><!--input name="hdicode" type="hidden" id="hdicode" value="<?php echo $row['itemcode']; ?>" /--><!--input type="submit" name="btndelete" value="Remove" id="btndelete" /-->
	</form>
	</div></td>
	</tr>
	<?php }	?>   
</table>
<table width="100%">
<tr><td colspan="2" align="left" style="padding-left:125px"></td></tr>
</table>
      <tr>
         <td colspan="2" style="padding-left:150px;"> <center><input name="btnSave" type="submit" id="btnSave" value="Save" /></center></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </tbody>
  </table>
  </div>
  </div>
  </div>
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
