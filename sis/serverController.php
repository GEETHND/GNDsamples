<?php

	$hostName = "127.0.0.1";
	//$hostName = "localhost";
	$userName = "root";
	$passWord = "earth";
	$dbName = "hrmstest";

	$msg2Client = "";

/***********************************************************************************************
The following session varibles should be set by the client program and using Ajax send function.
These are used in the insert method of the dbOperation class.
************************************************************************************************/


	//$_POST["action"]="add";
	//$_POST["interface"] = 'addEmp';
	$_POST["dbError"]="No Error";
	$_POST['empCode']="2";
	$_POST['empName']="GaminiW";
	$_POST['studentID']="4";
	$_POST['studentName']="Shantha";
	
/*****************************************************************************************************
There should be $InterfaceTbls array element for each interface used for adding and updating database.
******************************************************************************************************/

	$interfaceTbls["data4NextEmpNo"]= array("employee");

	$interfaceTbls["data4AddNewEmp"]= array("employee");
	$interfaceTbls["data4ViewEmp"]= array("employee"); 
	$interfaceTbls["data4ViewUniversities"]= array("university");
	$interfaceTbls["data4ViewFaculties"]= array("faculty");
	$interfaceTbls["data4ViewDepts"]= array("department");
	$interfaceTbls["addemployee"]= array("employee");
	$interfaceTbls["updateemployee"]= array("employee");
	$interfaceTbls["deleteemployee"]= array("employee");
	
	$interfaceTbls["addDesignation"]= array("designation");
	$interfaceTbls["data4AddDesignation"]= array("designationadmin"); 
	$interfaceTbls["data4AddEmpDesig"]= array("designation","employee"); 
	$interfaceTbls["updateDesignation"]= array("designation");
	$interfaceTbls["deleteDesignation"]= array("designation");
	$interfaceTbls["addQualification"]= array("qualification");
	$interfaceTbls["data4AddQualification"]= array("qualification"); 
	$interfaceTbls["updateQualification"]= array("qualification");
	$interfaceTbls["deleteQualification"]= array("qualification");
	
	$interfaceTbls["data4ViewDesignation"]= array("designationadmin");
	$interfaceTbls["data4AddNewDesignation"]= array("designationadmin");
	$interfaceTbls["addNewDesignation"]= array("designationadmin");
	$interfaceTbls["updateThisDesignation"]= array("designationadmin");
	$interfaceTbls["deleteThisDesignation"]= array("designationadmin");

	$interfaceTbls["getInitial"]= array("user");

/*****************************************************************************************************
This section specifies next client interface to be called.
******************************************************************************************************/

	$nextClientInterface["getInitial"] = "main";
	$nextClientInterface["data4NextEmpNo"]= "formViewEmployee";
	
	$nextClientInterface["data4ViewEmp"] = "formViewEmployee";
	$nextClientInterface["data4ViewUniversities"] = "formViewEmployee";
	$nextClientInterface["data4ViewFaculties"] = "formViewEmployee";
	$nextClientInterface["data4ViewDepts"] = "formViewEmployee";
	$nextClientInterface["data4AddNewEmp"] = "addemployee";
	$nextClientInterface["updateemployee"] = "formViewEmployee";
	$nextClientInterface["deleteemployee"] = "formViewEmployee";
	
	$nextClientInterface["data4AddDesignation"] = "addDesignation";
	$nextClientInterface["data4AddEmpDesig"] = "addDesignation";
//	$nextClientInterface["addDesignation"] = "maintainemployee";
//	$nextClientInterface["updateDesignation"] = "addDesignation";
//	$nextClientInterface["deleteDesignation"] = "addDesignation";
	$nextClientInterface["data4AddQualification"] = "maintainemployee";
	$nextClientInterface["addQualification"] = "maintainemployee";
	$nextClientInterface["updateQualification"] = "addQualification";
	$nextClientInterface["deleteQualification"] = "addQualification";
	
	$nextClientInterface["data4ViewDesignation"] = "formViewDesignations";
	$nextClientInterface["data4AddNewDesignation"] = "addNewDesignation";
	$nextClientInterface["addNewDesignation"] = "administration";
	$nextClientInterface["updateThisDesignation"] = "administration";
	$nextClientInterface["deleteThisDesignation"] = "administration";
	

/*****************************************************************************************************
The following section define all the SQLs required for the application.
*********************************************************************************************************/

	$getSQL["getInitial"]="select userId, userName from user;";
	$getSQL["data4NextEmpNo"]="SELECT max(employeeNo), employeeInstitute, employeeFaculty, employeeDepartment, employeeNicNo, e.`employeeSurname`, e.`employeeSurnamePNo`, e.`employeeOther`, e.`employeeOtherPNo`, e.`employeeInitials`, e.`employeeInitialsPNo`, e.`employeePAddress`, e.`employeePAddressPNo`, e.`employeeTempAddress`, e.`employeeTempAddressPNo`, e.`employeeTP`, e.`employeeEmail`, e.`dateofappYYYY`, e.`dateofappMM`, e.`dateofappDD`, e.`bdayYYYY`, e.`bdayMM`, e.`bdayDD`, e.`dateofincreYYYY`, e.`dateofincreMM`, e.`dateofincreDD`, e.`birthcertificate`, e.`medicalcertificate`, e.`appointmentref`, e.`incrementref`, e.`epfno`, e.`epfref`, e.`etfno`, e.`etfref` FROM hrmstest.employee e;";
	
	$getSQL["data4ViewEmp"]="select * from employee;";
	$getSQL["data4ViewUniversities"]="select * from university;";
	$getSQL["data4ViewFaculties"]="select * from faculty;";
	$getSQL["data4ViewDepts"]="select * from department;";
	
	$getSQL["data4AddQualification"]="select * from qualification;";
//	$getSQL["data4AddDesignation"]="SELECT d.`empDesignation`, d.`dateappointedYYYY`, d.`dateappointedMM`, d.`dateappointedDD`,e.`employeeNo` FROM hrmstest.designation d,hrmstest.employee e;";
	$getSQL["data4AddDesignation"]="select * from designationadmin;";
	$getSQL["data4AddEmpDesig"]="select * from employee;";
	
	$getSQL["data4ViewDesignation"]="select * from designationadmin;";
	$getSQL["data4AddNewDesignation"]="select * from designationadmin;";
/*****************************************************************************************************
The following section creats object from dbOperartion class and establishes the connection with database.
*********************************************************************************************************/

$dbClass = new dbOperations();

$dbCon = new mysqli($hostName, $userName, $passWord, $dbName, 3306);

if ($dbCon->connect_errno) {
    echo "Failed to connect to MySQL: " . $mysqli->connect_error;
}

/********************************************************************************************************
This area adds records to database tables.
********************************************************************************************************/

if($_POST["action"]=="add"){
	
	$dbClass->insert($dbCon, $interfaceTbls[$_POST["interface"]], $nextClientInterface[$_POST["interface"]]);

} else if($_POST["action"]=="get"){

	$dbClass->get($dbCon, $interfaceTbls[$_POST["interface"]], $getSQL[$_POST["interface"]], $nextClientInterface[$_POST["interface"]]);

} else if($_POST["action"]=="update"){
	
	$dbClass->update($dbCon, $interfaceTbls[$_POST["interface"]], $nextClientInterface[$_POST["interface"]]);

} else if($_POST["action"]=="delete"){
	
	$dbClass->delete($dbCon, $interfaceTbls[$_POST["interface"]], $nextClientInterface[$_POST["interface"]]);
}

$dbCon->close();


/**************** Database Operations class definition ***************************/

class dbOperations {
	

/********************************************************************************************************
This function adds new records to the database 
*********************************************************************************************************/
	function insert($con, $tblName, $interface){

		header("Content-type: text/xml");
		$xml = '<?xml version="1.0" encoding="utf-8"?>' . "\n";
		$xml .= '<data>';
		$xml .= '<record interface = "'.$interface.'" ></record>';

		$msg2Client = "Record has not been inserted.";
	
		$con->autocommit(FALSE); // This stops physical updates. Commit will make the changes to the database permenant.

		$tblName4locks="";

		for($loopCnt=0; $loopCnt < count($tblName); $loopCnt++){
			$tblName4locks .= $tblName[$loopCnt];
			if($loopCnt < count($tblName)-1){
				$tblName4locks .= " WRITE, ";
			}
		}


		$qryStat = 1;
		//$qryStat = $con->query("LOCK TABLES ".$tblName4locks. " WRITE;"); // This is not required for insert function.

		$loopCnt = 0;

		do{


			if($qryStat){


				$qry = "show columns from ".$tblName[$loopCnt]. ";"; //Gets all the field names of a given database table.
				$res = $con->query($qry);
				$_POST["dbError"]=$con->error;

				if(!$res){
					return $res;
				} else {
					$qry = "INSERT IGNORE INTO ".$tblName[$loopCnt]." SET ";

					for ($row_no = 0; $row_no < $res->num_rows; $row_no++) {
    						$res->data_seek($row_no);
    						$row = $res->fetch_assoc();
						if(!isset($_POST[$row["Field"]])){
							$_POST[$row["Field"]] = "";
						}
						$qry .= $row["Field"]." = '".$_POST[$row["Field"]];
						if($row_no < $res->num_rows - 1) {
    							$qry .= "', ";
						} else {
    							$qry .= "';";
						}	
					}

					$qryStat =  $con->query($qry);
					if($qryStat==1 && $con->affected_rows > 0){
						$msg2Client = "Record has been inserted successfully.";
					} 
					if(!$qryStat){
   			 			printf("Error message: %s\n", $con->error); // This error message should be sent to the client.
					}
				}
			}

		$loopCnt++;
		}while($qryStat && $loopCnt<count($tblName));	

		if(!$qryStat){
			$con->rollback(); //If something goes wrong, the database is rollbacked to the previous stable position.
		} else {
			$con->commit();   //Makes changes to the database permenant.
		}

		$qryStat = $con->query("UNLOCK TABLES;");
		$xml .= '<record msg = "'.$msg2Client.'" ></record>';
		$xml .= '</data>'."\n";
		echo $xml;
	}


/********************************************************************************************************
This function reads records from the database and send them to clinet as an XML document 
*********************************************************************************************************/

	function get($con, $tblName, $qry, $interface){

	header("Content-type: text/xml");
	$xml = '<?xml version="1.0" encoding="utf-8"?>' . "\n";
	$xml .= '<data>';
	$xml .= '<record interface = "'.$interface.'" ></record>';

		$con->autocommit(FALSE); // This stops physical updates. Commit will make the changes to the database permenant.

		$tblName4locks="";

		for($loopCnt=0; $loopCnt < count($tblName); $loopCnt++){
			$tblName4locks .= $tblName[$loopCnt];
			if($loopCnt < count($tblName)-1){
				$tblName4locks .= " READ, ";
			}
		}


		$qryStat = $con->query("LOCK TABLES ".$tblName4locks. " READ;"); // This locks tables for reading.

		if(!$qryStat){
   			 //printf("Error message: %s\n", $con->error); // This error message should be sent to the client.
			$xml .= '<record error = "'.$con->error.'" ></record>';
		} else {

		$res =  $con->query($qry);

		$fieldNames = $res->fetch_fields();
		$res->field_count;

				if(!$res){
					return $res;
				} else {

					for ($row_no = 0; $row_no < $res->num_rows; $row_no++) {
    						$res->data_seek($row_no);
    						$row = $res->fetch_assoc();
						$xml .= '<record ';
						for($col_no = 0; $col_no < $res->field_count; $col_no++){

							$xml .= $fieldNames[$col_no]->name.'="'.$row[$fieldNames[$col_no]->name].'" ';

						}
						$xml .= '></record>';

					}


				}

			$fieldCount = $res->num_rows;

			$count=0;

		}

		$qryStat = $con->query("UNLOCK TABLES;");
		$xml .= '</data>'."\n";
		echo $xml; // SHOULD RETURN THIS TO CALLING CLIENT PROGRAM LATER. THIS SHOULD BE EHCO


	}

/********************************************************************************************************
This function updates exisitng records in the database. The primary key is used in the where clause to 
identify the record to be updated. 
*********************************************************************************************************/

	function update($con, $tblName, $interface){

		header("Content-type: text/xml");
		$xml = '<?xml version="1.0" encoding="utf-8"?>' . "\n";
		$xml .= '<data>';
		$xml .= '<record interface = "'.$interface.'" ></record>';

		$msg2Client = "Record has not been updated.";
	
		$con->autocommit(FALSE); // This stops physical updates. Commit will make the changes to the database permenant.

		$tblName4locks="";

		for($loopCnt=0; $loopCnt < count($tblName); $loopCnt++){
			$tblName4locks .= $tblName[$loopCnt];
			if($loopCnt < count($tblName)-1){
				$tblName4locks .= " WRITE, ";
			}
		}


		$qryStat = 1;
		$qryStat = $con->query("LOCK TABLES ".$tblName4locks. " WRITE;"); // This is required for update function.

		$loopCnt = 0;

		do{


			if($qryStat){


				$qry = "show columns from ".$tblName[$loopCnt]. ";"; //Gets all the field names of a given database table.
				$res = $con->query($qry);
				$_POST["dbError"]=$con->error;

				$condition = " where ";

				if(!$res){
					return $res;
				} else {

					$keyCounter = 0;
					$updateFieldCounter = 0;


					$qry = "update ".$tblName[$loopCnt]." SET ";

					for ($row_no = 0; $row_no < $res->num_rows; $row_no++) {
    						$res->data_seek($row_no);
    						$row = $res->fetch_assoc();

						if(isset($_POST[$row["Field"]])){		

							if($row["Key"]=="PRI"){
								if($keyCounter > 0){
									$condition .= "' and ";
								}

								$condition .= $row["Field"]." = '".$_POST[$row["Field"]];
								$keyCounter++;

							} else {

								if($updateFieldCounter > 0){
    									$qry .= "', ";
								}
								
								$qry .= $row["Field"]." = '".$_POST[$row["Field"]];
					
							}

						}	
					}

					$qry .= "'";
    					$condition .= "';";
					$qry .= $condition;
//echo $qry;
					$qryStat =  $con->query($qry);
					if($con->affected_rows > 0){
						$msg2Client = "Record has been updated successfully.";
					} 

					if(!$qryStat){
   			 			printf("Error message: %s\n", $con->error); // This error message should be sent to the client.
					}
				}
			}

		$loopCnt++;
		}while($qryStat && $loopCnt<count($tblName));	

		if(!$qryStat){
			$con->rollback(); //If something goes wrong, the database is rollbacked to the previous stable position.
		} else {
			$con->commit();   //Makes changes to the database permenant.
		}

		$qryStat = $con->query("UNLOCK TABLES;");
		$xml .= '<record msg = "'.$msg2Client.'" ></record>';
		$xml .= '</data>'."\n";
		echo $xml;
	}

/********************************************************************************************************
This function deletes exisiting records from the database.
The primary key has been used to idetify the records to be deleted. 
*********************************************************************************************************/

	function delete($con, $tblName, $interface){

		header("Content-type: text/xml");
		$xml = '<?xml version="1.0" encoding="utf-8"?>' . "\n";
		$xml .= '<data>';
		$xml .= '<record interface = "'.$interface.'" ></record>';

		$msg2Client = "Record has not been deleted.";
			
		$con->autocommit(FALSE); // This stops physical updates. Commit will make the changes to the database permenant.

		$tblName4locks="";

		for($loopCnt=0; $loopCnt < count($tblName); $loopCnt++){
			$tblName4locks .= $tblName[$loopCnt];
			if($loopCnt < count($tblName)-1){
				$tblName4locks .= " WRITE, ";
			}
		}


		$qryStat = $con->query("LOCK TABLES ".$tblName4locks. " WRITE;"); // This is required for delete function.

		$loopCnt = 0;

		do{


			if($qryStat){


				$qry = "show columns from ".$tblName[$loopCnt]. ";"; //Gets all the field names of a given database table.
				$res = $con->query($qry);
				$_POST["dbError"]=$con->error;

				$condition = " where ";

				if(!$res){
					return $res;
				} else {

					$keyCounter = 0;

					$qry = "delete from ".$tblName[$loopCnt];

					for ($row_no = 0; $row_no < $res->num_rows; $row_no++) {
    						$res->data_seek($row_no);
    						$row = $res->fetch_assoc();

						if(isset($_POST[$row["Field"]])){		

							if($keyCounter > 0){
								$condition .= "' and ";
							}
							$condition .= $row["Field"]." = '".$_POST[$row["Field"]];
							$keyCounter++;
						} 
					}

    					$condition .= "';";
					$qry .= $condition;
//echo $qry;

					$qryStat =  $con->query($qry);
					if($con->affected_rows > 0){
						$msg2Client = "Record has been deleted successfully.";

					}

					if(!$qryStat){
   			 			printf("Error message: %s\n", $con->error); // This error message should be sent to the client.
					}
				}
			}

		$loopCnt++;
		}while($qryStat && $loopCnt<count($tblName));	

		if(!$qryStat){
			$con->rollback(); //If something goes wrong, the database is rollbacked to the previous stable position.
		} else {
			$con->commit();   //Makes changes to the database permenant.
		}

		$qryStat = $con->query("UNLOCK TABLES;");
		$xml .= '<record msg = "'.$msg2Client.'" ></record>';
		$xml .= '</data>'."\n";
		echo $xml;
	}


/********************* All the functions should be written above this line ****************************/

}


/******************** End of Database Operations class definition ********************/


/*******************************************************************************************************
//require 'DBFunctions.php';


	header("Content-type: text/xml");
	$xml = '<?xml version="1.0" encoding="utf-8"?>' . "\n";
	$xml .= "<data>";
	
	//if($_POST["username"]) {

		//$xml .= "<login name=".$_POST["username"]."></login>" . "\n";

	//} else {


		//$xml .= "<login name='noName'></login>" . "\n";
	//}

	$xml .= "<department deptCode='pathology' deptName='Chemical Pathology'></department>";
	$xml .= "<department deptCode='biochemistry' deptName ='Clinical Biochemistry'></department>";
	$xml .= "<department deptCode='microbiology' deptName = 'Microbiology'></department>";
	$xml .= "<department deptCode='hematology' deptName = 'Hematology'></department>";

	$xml .= "</data>" . "\n";
	echo $xml;
***********************************************************************************************************/

?>
