<?php
include "db.inc.php";
$dateadd=date("Y-m-d");
$empno1 = $_POST['empno1'];
$empno2 = $_POST['empno2'];
$custno = $_POST['custno'];
$type = $_POST['type'];
$payment = $_POST['payment'];
$commission1 = $_POST['commission1'];
$commission2 = $_POST['commission2'];

$sql="SELECT max(`jobno`) as r  FROM `jobs` ";
$result=mysql_query($sql) or die("Error in SQL");
while($row=mysql_fetch_array($result))
$jobno = $row['r']+1;
//echo "<script> alert ('$jobno $empno1 $empno2 $custno $type $payment $commission1 $commission2 $dateadd')</script>";

if (isset($_POST['btnSave']) or $_POST['btnSave']=="Submit"){
$sql="INSERT INTO `jobs` (`jobno`, `empno1`, `empno2`, `custno`, `type`, `payment`, `commission1`, `commission2`, `date_add`) VALUES ('$jobno','$empno1','$empno2', '$custno', '$type', '$payment', '$commission1','$commission2', '$dateadd');";
$result=mysql_query($sql) or die("Mysql error job");
echo "<script> alert ('$type added successfully!')</script>";
}

?>

<!DOCTYPE HTML>
<html>

<head>
<script type="text/javascript">
function formValidation()
{
    if (document.getElementById("empno").selectedIndex == 0){
       alert("Select the employee");
       return false;
    }
	
	 if (document.getElementById("custno").selectedIndex == 0){
       alert("Select the customer");
       return false;
    }
	if (document.getElementById('type').value=="")
	{
		alert('Please enter type ');
		return false;
	}
	var payment=document.getElementById('payment').value;
	if (payment=='')
	{   
        alert('Please enter payment ');
		return false;
	}

    var payment=document.getElementById('payment').value;
	if (isNaN(payment))
	{	alert('Please enter a correct payment value !');
		return false;
		payment.focus();
		payment="";
	}
	var commission=document.getElementById('commission').value;
	if (commission=='')
	{   
        alert('Please enter commission ');
		return false;
	}

    var commission=document.getElementById('commission').value;
	if (isNaN(commission))
	{	alert('Please enter a correct commission value !');
		return false;
		commission.focus();
		commission="";
	}
	
}
</script>
  <title>simplestyle_blue_trees</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="style/style.css" />
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.html">salon<span class="logo_colour">Zero</span></a></h1>
          <h2>Payroll Manager</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li><a href="index.php">Home</a></li>
          <li  class="selected"><a href="jobs.php">Jobs</a></li>
          <li><a href="employee.php">Employee</a></li>
          <li><a href="customer.php">Customers</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      <div id="banner"></div>
	  <div id="sidebar_container">
        <div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item">
            <!-- insert your sidebar items here -->
            <h5>Today is <?php echo $dateadd;?></h5>
            <h4>Our Jobs</h4>
            
            <p><table id="archive">
		<?php
		$sql="select * from jobs";
		$result=mysql_query($sql) or die("Error in SQL8");
		while($row=mysql_fetch_array($result))
		{
		?>
	      <tr>
            <td><?php echo $row['type']; ?></td>
          </tr>
		 <?php
		 }
		 ?>
         </table></p>
          </div>
          <div class="sidebar_base"></div>
        </div>
        <div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item">
            <h3>Upcoming Birthdays</h3>
            <ul>
              <li><a href="#">link 1</a></li>
              <li><a href="#">link 2</a></li>
              <li><a href="#">link 3</a></li>
              <li><a href="#">link 4</a></li>
            </ul>
          </div>
          <div class="sidebar_base"></div>
        </div>
        <div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item">
            <h3>Search</h3>
            <form method="post" action="#" id="search_form">
              <p>
                <input class="search" type="text" name="search_field" value="Enter keywords....." />
                <input name="search" type="image" style="border: 0; margin: 0 0 -9px 5px;" src="style/search.png" alt="Search" title="Search" />
              </p>
            </form>
          </div>
          <div class="sidebar_base"></div>
        </div>
      </div>
      <div id="content">
        <!-- insert the page content here -->
        <h1>Jobs</h1>
    <form name="jobs" action="" method="post" autocomplete="off" onSubmit="return formValidation();">
	<table width="100%" border="0" align="center">
    <tbody>
    <tr>
        <td width="30%"><label for="textfield2">Customer :</label></td>
		<td colspan="3"><select name="custno" id="custno" onChange="">
               <option selected="selected" value="0">--Select</option>
			   <?php
					$sql="SELECT * FROM customer ORDER BY name ASC";
					$result = mysql_query($sql) or die("Employee error !!");
					while($row=mysql_fetch_assoc($result))
					{
					?>
					<option value="<?php echo $row['custno'];?>"
					<?php  
						if(($row['custno'])===$_REQUEST['custno'])
							echo "selected=\"selected\"" ;
					?>>
					<?php 
						echo $row['name']."-".$row['mobile'];
					?>
					</option>
					<?php
						}
					?>
				</select>
                <a href="./customer.php">Add new customer</a>
		</td>
	</tr>
    <tr>
        <td><label for="textfield3">Job type:</label></td>
		<td  colspan="3"><input class="txtstyle" name="type" type="text" id="type"  value="<?php echo $type ;?>" /></td>
		</tr>
	<tr>
        <td><label for="textfield3">Payment:</label></td>
		<td colspan="3"><input class="txtstyle" name="payment" type="text" id="payment"  value="<?php echo $payment ;?>" /></td>
		</tr>
      <tr>
        <td width="30%"><label for="textfield2">Employee1 :</label></td>
		<td><select name="empno1" id="empno1" onChange="">
               <option selected="selected" value="0">--Select</option>
			   <?php
					$sql="SELECT * FROM employee ORDER BY name ASC";
					$result = mysql_query($sql) or die("Employee error !!");
					while($row=mysql_fetch_assoc($result))
					{
					?>
					<option value="<?php echo $row['empno'];?>"
					<?php  
						if(($row['empno1'])===$_REQUEST['empno1'])
							echo "selected=\"selected\"" ;
					?>>
					<?php 
						echo $row['name']."-".$row['designation'];
					?>
					</option>
					<?php
						}
					?>
				</select>
		</td>
        <td width="30%"><label for="textfield2">Employee2 :</label></td>
		<td><select name="empno2" id="empno2" onChange="">
               <option selected="selected" value="0">--Select</option>
			   <?php
					$sql="SELECT * FROM employee ORDER BY name ASC";
					$result = mysql_query($sql) or die("Employee error !!");
					while($row=mysql_fetch_assoc($result))
					{
					?>
					<option value="<?php echo $row['empno'];?>"
					<?php  
						if(($row['empno2'])===$_REQUEST['empno2'])
							echo "selected=\"selected\"" ;
					?>>
					<?php 
						echo $row['name']."-".$row['designation'];
					?>
					</option>
					<?php
						}
					?>
				</select>
		</td>
	</tr>
	  
    <tr>
        <td><label for="textfield3">Commission to employee1(%):</label></td>
		<td><input class="txtstyle" name="commission1" type="text" id="commission1"  value="<?php echo $commission1 ;?>" /></td>
        <td><label for="textfield3">Commission to employee2(%):</label></td>
		<td><input class="txtstyle" name="commission2" type="text" id="commission2"  value="<?php echo $commission2 ;?>" /></td>
		</tr>
      <tr>
         <td colspan="4" style="padding-left:150px;"> <center><input name="btnSave" type="submit" id="btnSave" value="Submit" /></center></td>
        
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </tbody>
  </table></form>
        <h2>Browser Compatibility</h2>
        <p>This template has been tested in the following browsers:</p>
        <ul>
          <li>Internet Explorer 9</li>
          <li>FireFox 25</li>
          <li>Google Chrome 31</li>
        </ul>
      </div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
      <p><a href="index.html">Home</a> | <a href="examples.html">Examples</a> | <a href="page.html">A Page</a> | <a href="another_page.html">Another Page</a> | <a href="contact.html">Contact Us</a></p>
      <p>Copyright &copy; simplestyle_blue_trees | <a href="http://validator.w3.org/check?uri=referer">HTML5</a> | <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a></p>
    </div>
  </div>
</body>
</html>
