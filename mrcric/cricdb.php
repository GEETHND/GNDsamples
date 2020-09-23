<?php
   $hostname = '127.0.0.1';
   $username = 'root';
   $password = '';
   $dbname = 'dbcric';

   function connectDB($hostname, $username, $password)
   {
      $connect = mysql_connect($hostname, $username, $password);
      if(!$connect)
      {
         echo 'Database connection failed!<br/>';
      }
      else
      {
         echo "Database connection success.<br/>$connect<br/>";
         return $connect;
      }
   }
   function opendb($dbname, $link)
   {
      if(!mysql_select_db($dbname, $link))
      {
         echo "Failed to open database $dbname!<br/>";
      }
      else
      {
         echo "Successfully connected to database $dbname<br/>";
      }
   }


   $link = connectDB($hostname, $username, $password);
   $str = "CREATE DATABASE $dbname;";
   if($result = mysql_query($str, $link))
   {
      echo "Database $dbname created successfully.<br/>";
   }
   else
   {
      echo "Failed to create database $dbname, check for duplicates!<br/>";
   }
   opendb($dbname, $link);

   // Create Table: items
   $str = "CREATE TABLE items ( ";
   $str .= "itemno varchar(4) NOT NULL, ";
   $str .= "item varchar(400) NOT NULL, ";
   $str .= "trademark varchar(100) ";
   $str .= ") ENGINE=INNODB;";
   echo "<br/>Executing query: $str<br/>";
   if($result = mysql_query($str, $link))
   {
      echo 'Table title created successfully<br/>';
   }
   else
   {
      echo 'Failed to create table title!<br/>';
   }
   //
   
    // Create Table: itemsitemtransaction
   $str = "CREATE TABLE itemtransaction ( ";
   $str .= "transno INT NOT NULL AUTO_INCREMENT, ";
   $str .= "ordno INT (10), ";
   $str .= "itemno varchar(4) NOT NULL, ";
   $str .= "uprice decimal(9,2) NOT NULL, ";
   $str .= "price decimal(8,2) NOT NULL, ";
   $str .= "qty_issued int(6) NOT NULL, ";
   $str .= "qty_rec int(6) NOT NULL, ";
   $str .= "remarks varchar(500), ";
   $str .= "batch varchar(50), ";
   $str .= "date_add date NOT NULL, ";
   $str .= "PRIMARY KEY (transno) ";
   $str .= ") ENGINE=INNODB;";
   echo "<br/>Executing query: $str<br/>";
   if($result = mysql_query($str, $link))
   {
      echo 'Table title created successfully<br/>';
   }
   else
   {
      echo 'Failed to create table title!<br/>';
   }
   //
   // Create Table: titem
   $str = "CREATE TABLE titem ( ";
   $str .= "itemno varchar(4) NOT NULL, ";
   $str .= "uprice decimal(9,2) NOT NULL, ";
   $str .= "price decimal(8,2) NOT NULL, ";
   $str .= "qty_issued int(6) NOT NULL, ";
   $str .= "batch varchar(160), ";
   $str .= "user varchar(16) NOT NULL ";
   $str .= ") ENGINE=INNODB;";
   echo "<br/>Executing query: $str<br/>";
   if($result = mysql_query($str, $link))
   {
      echo 'Table titem created successfully<br/>';
   }
   else
   {
      echo 'Failed to create table title!<br/>';
   }
   //
   // Create Table: titem
   $str = "CREATE TABLE users ( ";
   $str .= "username varchar(10) NOT NULL, ";
   $str .= "password varchar(16) NOT NULL ";
   $str .= ") ENGINE=INNODB;";
   echo "<br/>Executing query: $str<br/>";
   if($result = mysql_query($str, $link))
   {
      echo 'Table users created successfully<br/>';
   }
   else
   {
      echo 'Failed to create table users!<br/>';
   }
   //
   // END OF CREATING TABLE
   echo '<br/><br/><br/>Code reached end.<br/>';
   print date("m/d/y G.i:s<br>", time());
