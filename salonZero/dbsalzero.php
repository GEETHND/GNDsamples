<?php
   $hostname = '127.0.0.1';
   $username = 'root';
   $password = '';
   $dbname = 'dbsalzero';

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
   $str = "CREATE TABLE employee ( ";
   $str .= "empno varchar(4) NOT NULL, ";
   $str .= "name varchar(400) NOT NULL, ";
   $str .= "designation varchar(100) NOT NULL, ";
   $str .= "basic_sal varchar(100) ";
   $str .= ") ENGINE=INNODB;";
   echo "<br/>Executing query: $str<br/>";
   if($result = mysql_query($str, $link))
   {
      echo 'Table employee created successfully<br/>';
   }
   else
   {
      echo 'Failed to create table employee!<br/>';
   }
   //
   
    // Create Table: itemsitemtransaction
   $str = "CREATE TABLE customer ( ";
   $str .= "custno INT (4), ";
   $str .= "name varchar(400) NOT NULL, ";
   $str .= "mobile int(10) NOT NULL, ";
   $str .= "email varchar(100) NOT NULL, ";
   $str .= "dob date ";
   $str .= ") ENGINE=INNODB;";
   echo "<br/>Executing query: $str<br/>";
   if($result = mysql_query($str, $link))
   {
      echo 'Table customer created successfully<br/>';
   }
   else
   {
      echo 'Failed to create table customer!<br/>';
   }
   //
   // Create Table: titem
   $str = "CREATE TABLE salary ( ";
   $str .= "empno varchar(4) NOT NULL, ";
   $str .= "year int(4) NOT NULL, ";
   $str .= "month int(4) NOT NULL, ";
   $str .= "salary int(6) NOT NULL, ";
   $str .= "date_add date NOT NULL ";
   $str .= ") ENGINE=INNODB;";
   echo "<br/>Executing query: $str<br/>";
   if($result = mysql_query($str, $link))
   {
      echo 'Table salary created successfully<br/>';
   }
   else
   {
      echo 'Failed to create table salary!<br/>';
   }
   //
   // Create Table: titem
   $str = "CREATE TABLE jobs ( ";
   $str .= "jobno varchar(4) NOT NULL, ";
   $str .= "empno1 varchar(4) NOT NULL, ";
   $str .= "empno2 varchar(4), ";
   $str .= "custno int(11) NOT NULL, ";
   $str .= "type varchar(16) NOT NULL, ";
   $str .= "payment decimal(16,2) NOT NULL, ";
   $str .= "commission1 int(16) NOT NULL, ";
   $str .= "commission2 int(16), ";
   $str .= "date_add date NOT NULL ";
   $str .= ") ENGINE=INNODB;";
   echo "<br/>Executing query: $str<br/>";
   if($result = mysql_query($str, $link))
   {
      echo 'Table jobs created successfully<br/>';
   }
   else
   {
      echo 'Failed to create table jobs!<br/>';
   }
   //
   // END OF CREATING TABLE
   echo '<br/><br/><br/>Code reached end.<br/>';
   print date("m/d/y G.i:s<br>", time());
