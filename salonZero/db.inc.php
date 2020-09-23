<?php
define("USER","root");
define("PWD","");
define("HOST","localhost");
define("DB","dbsalzero");

//connect to DataBase
$conn=mysql_connect(HOST,USER,PWD) or die (mysql_error());

//select DB
mysql_select_db(DB) or (mysql_error());
?>
