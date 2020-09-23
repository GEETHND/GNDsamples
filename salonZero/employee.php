<?php
include "db.inc.php";
$dateadd=date("Y-m-d");
$empno = $_POST['empno'];
$name = $_POST['name'];
$designation = $_POST['designation'];
$basic_sal = $_POST['basic_sal'];

if (isset($_POST['btnSave']) or $_POST['btnSave']=="Submit"){
$sql="INSERT INTO `employee` (`empno`, `name`, `designation`, `basic_sal`) VALUES ('$empno', '$name', '$designation', '$basic_sal');";
$result=mysql_query($sql) or die("Mysql error employee");
echo "<script> alert ('$name added successfully!')</script>";
}

?>

<!DOCTYPE HTML>
<html>

<head>
  <script type="text/javascript">
  function formValidation()
  {	
	if (document.getElementById('name').value=="")
	{
		alert('Please Enter name ');
		return false;
	}
	
	if (document.getElementById('designation').value=="")
	{
		alert('Please Enter designation');
		return false;
	}
	
	var basic_sal=document.getElementById('basic_sal').value;
	if (basic_sal=='')
	{   
        alert('Please Enter Basic salary ');
		return false;
	}

    var basic_sal=document.getElementById('basic_sal').value;
	if (isNaN(basic_sal))
	{	alert('Basic salary have numbers only !');
		return false;
		basic_sal.focus();
		basic_sal="";
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
          <li><a href="jobs.php">Jobs</a></li>
          <li class="selected"><a href="employee.php">Employee</a></li>
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
            <form name="employee" method="post" action="#" id="search_form" onSubmit="return formValidation();">
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
        <h1>Employee</h1>
    <form name="employee" action="" method="post" autocomplete="off" onSubmit="return formValidation();">
	<table width="100%" border="0" align="center">
    <tbody>
      <tr>
        <td width="30%"><label for="textfield2">Employee no.:</label></td>
        <td width="70%"><input class="txtstyle" type="text" name="empno" id="empno"  value="<?php
							
		  $sql="SELECT max(`empno`) as r  FROM `employee` ";
		  $result=mysql_query($sql) or die("Error in SQL");
		  while($row=mysql_fetch_array($result))
		  echo $row['r']+1;  
		
		  ?>" readonly="readonly"></td>
      </tr>
	  <tr>
        <td><label for="textfield3">Name:</label></td>
		<td><input class="txtstyle" type="text" name="name" id="name" runat="server" list="titleName"/>
			<datalist id="titleName">
				<option selected="selected"><?php echo $name ?></option>
				  <?php
										
					  $sql="SELECT * FROM `employee` ";
					  $result=mysql_query($sql) or die("Error in SQL");
					  while($row=mysql_fetch_array($result))
					  echo '<option>'.$row['name'].'</option>' ;  
					
					  ?>
			</datalist>
		</tr>
    <tr>
        <td><label for="textfield3">Designation:</label></td>
		<td><input class="txtstyle" name="designation" type="text" id="designation"  value="<?php echo $designation ;?>" /></td>
		</tr>
	<tr>
        <td><label for="textfield3">Basic salary:</label></td>
		<td><input class="txtstyle" name="basic_sal" type="text" id="basic_sal"  value="<?php echo $basic_sal ;?>" /></td>
		</tr>
      <tr>
         <td colspan="2" style="padding-left:150px;"> <center><input name="btnSave" type="submit" id="btnSave" value="Submit" onClick="return formValidation()" /></center></td>
        <td>&nbsp;</td>
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
