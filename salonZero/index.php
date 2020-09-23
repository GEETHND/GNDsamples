<?php
include "db.inc.php";
$dateadd=date("Y-m-d");
$ty=date('Y',strtotime($dateadd));
$empno = $_POST['empno'];
$name = $_POST['name'];
$year = $_POST['year'];
$month = $_POST['month'];
$designation = $_POST['designation'];
$basic_sal = $_POST['basic_sal'];
$incentive = $_POST['incentive'];

$sql="SELECT * FROM `employee` where empno='$empno'";
$result = mysql_query($sql) or die("Mysql error item loading employee");
while($row=mysql_fetch_assoc($result)) {
	$basic_sal=$row['basic_sal'];
	}

$sql="SELECT sum(`commission1`*`payment`*0.01) as c FROM `jobs` where empno1='$empno' and YEAR(date_add)='$year' and MONTH(date_add)='$month'";
$result = mysql_query($sql) or die("Mysql error item loading commission");
while($row=mysql_fetch_assoc($result)) {
	$commission1=$row['c'];
	$commission1 = number_format((float)$commission1, 2, '.', '');
	}

$sql="SELECT sum(`commission2`*`payment`*0.01) as c FROM `jobs` where empno2='$empno' and YEAR(date_add)='$year' and MONTH(date_add)='$month'";
$result = mysql_query($sql) or die("Mysql error item loading commission");
while($row=mysql_fetch_assoc($result)) {
	$commission2=$row['c'];
	$commission2 = number_format((float)$commission2, 2, '.', '');
	}
$commission = $commission1+$commission2;
	
if (isset($_POST['btnSal']) or $_POST['btnSal']=="Salary"){
$salary = $basic_sal+$commission+$incentive;
$salary = number_format((float)$salary, 2, '.', '');
}

if (isset($_POST['btnPay'])){
	$empno = $_POST['empno'];
	$salary = $_POST['salary'];
	$year = $_POST['year'];
	$month = $_POST['month'];
	$getsal = "SELECT `salary` FROM `salary` WHERE `empno`='$empno' AND `year`='$year' AND `month`='$month';";
	$resultsal=mysql_query($getsal) or die("Mysql error getting salary");
	$rowsal = mysql_fetch_assoc($resultsal);
	if($rowsal['salary']==0){
	$sql="INSERT INTO `salary` (`empno`, `year`, `month`, `salary`, `date_add`) VALUES ('$empno', '$year', '$month', '$salary', '$dateadd');";
	$result=mysql_query($sql) or die("Mysql error saving salary");
	echo "<script> alert ('$type added successfully!')</script>";
	if($salary==0){
		echo "<script> alert ('Please calculate the salary!')</script>";
	}
	else{
		header("location:rpt.php?empno=$empno");
	}}
	else{
	$sal = $rowsal['salary'];
	echo "<script>
    if (confirm('Press a button!')) {
       ."$sql="UPDATE `salary` SET `salary`='$salary' WHERE `empno`='$empno' AND `year`='$year' AND `month`='$month';";
		$result=mysql_query($sql) or die("Mysql error updating salary");
		echo "<script> alert ('$salary updated successfully!')</script>";".
    } else {
        ."echo "<script> alert ('$salary not updated!')</script>";".
    }
	</script>";
	} 
	}
?>

<!DOCTYPE HTML>
<html>

<head>
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
          <li class="selected"><a href="index.php">Home</a></li>
          <li><a href="jobs.php">Jobs</a></li>
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
		$sql="select * from employee";
		$result=mysql_query($sql) or die("Error in SQL8");
		while($row=mysql_fetch_array($result))
		{
		?>
	      <tr>
            <td><a href="#"><?php echo $row['name']; ?></a></td>
            <td class="t-right low"><?php echo $row1['designation']; ?></td>
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
        <h1>Salary calculator</h1>
    <form name="employee" action="" method="post" autocomplete="off" onSubmit="return formValidation();">
	<table width="100%" border="0" align="center">
    <tbody>
      <tr>
        <td width="30%"><label for="textfield2">Employee :</label></td>
		<td><select name="empno" id="empno" onChange="submit()">
               <option selected="selected">--Select</option>
			   <?php
					$sql="SELECT * FROM employee ORDER BY name ASC";
					$result = mysql_query($sql) or die("Employee error !!");
					while($row=mysql_fetch_assoc($result))
					{
					?>
					<option value="<?php echo $row['empno'];?>"
					<?php  
						if(($row['empno'])===$_REQUEST['empno'])
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
        <td><label for="textfield3">Basic salary:</label></td>
		<td><input class="txtstyle" name="basic_sal" type="text" readonly id="basic_sal"  value="<?php echo $basic_sal ;?>" /></td>
		</tr>
		
	<tr>
        <td><label for="textfield3">Year:</label></td>
		<td><select name="year" id="year" onChange="submit()">
            <option selected="selected"><?php echo $year;?></option>
            <?php
	  	  	  for ( $i=$ty-1;$i<=$ty;$i++)
	  {echo '<option>'.$i.'</option>';
	  }
	  	    
	  ?>
          </select></td>
		</tr>
        <tr>
        <td><label for="textfield3">Month:</label></td>
		<td><select name="month" id="month" onChange="submit()">
            <option selected="selected"><?php echo $month;?></option>
            <?php
		  for ( $i=1;$i<=12;$i++)
	 {echo '<option>'.$i.'</option>';
	  }
		?>
          </select></td>
		</tr>
        <tr>
        <td><label for="textfield3">Commission:</label></td>
		<td><input class="txtstyle" name="commission" type="text" readonly id="commission"  value="<?php echo $commission ;?>" /></td>
		</tr>
	  <tr>
        <td><label for="textfield3">Incentives:</label></td>
		<td><input class="txtstyle" name="incentive" type="text" id="incentive"  value="<?php echo $incentive ;?>" /></td>
		</tr>
       
   
      <tr>
         <td style="padding-left:150px;"> <center><input name="btnSal" type="submit" id="btnSal" value="Calc Salary" /></center></td>
         <td><input class="txtstyle" name="salary" type="text" id="salary"  value="<?php echo $salary ;?>" /></td>
        
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td><input name="btnPay" type="submit" id="btnPay" value="&nbsp;PAY&nbsp;" /></td>
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
