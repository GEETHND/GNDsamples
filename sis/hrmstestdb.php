//Defines designation table.

$str = "CREATE TABLE designation (";
$str .= "desigNo varchar(4) NOT NULL,";
$str .= "designatedEmpNo varchar(4) NOT NULL,";
$str .= "empDesignation varchar(50) NOT NULL,";
$str .= "dateappointedYYYY int(4) DEFAULT NULL,";
$str .= "dateappointedMM int(2) DEFAULT NULL,";
$str .= "dateappointedDD int(2) DEFAULT NULL,";
$str .= "PRIMARY KEY (desigNo)) ENGINE=INNODB;";

//Defines qualification table.

$str = "CREATE TABLE qualification (";
$str .= "qualificationId int(2) NOT NULL AUTO_INCREMENT,";
$str .= "employeeNo varchar(4) NOT NULL,";
$str .= "university varchar(100) DEFAULT NULL,";
$str .= "duration varchar(50) NOT NULL,";
$str .= "degree varchar(100) DEFAULT NULL,";
$str .= "dateofappYYYY int(4) NOT NULL,";
$str .= "dateofappMM int(2) NOT NULL,";
$str .= "dateofappDD int(2) NOT NULL,";
$str .= "PRIMARY KEY (qualificationId)) ENGINE=INNODB;";

//Defines user table.

$str = "CREATE TABLE user (";
$str .= "userId varchar(10) NOT NULL,";
$str .= "passWd varchar(32) NOT NULL,";
$str .= "empId varchar(20) NOT NULL,";
$str .= "userName varchar(50) DEFAULT NULL,";
$str .= "PRIMARY KEY (userId)) ENGINE=INNODB;";

//Defines employee table.

$str = "CREATE TABLE employee (";
$str .= "employeeNo varchar(10) NOT NULL,";
$str .= "employeeCode varchar(10) DEFAULT NULL,";
$str .= "employeeTitle varchar(100) DEFAULT NULL,";
$str .= "employeeInstitute varchar(50) DEFAULT NULL,";
$str .= "employeeFaculty varchar(50) DEFAULT NULL,";
$str .= "employeeDepartment varchar(50) DEFAULT NULL,";
$str .= "employeeCat varchar(50) DEFAULT NULL,";
$str .= "employeeNicNo varchar(10) DEFAULT NULL,";
$str .= "employeeSurname varchar(50) DEFAULT NULL,";
$str .= "employeeSurnamePNo varchar(10) DEFAULT NULL,";
$str .= "employeeOther varchar(50) DEFAULT NULL,";
$str .= "employeeOtherPNo varchar(10) DEFAULT NULL,";
$str .= "employeeInitials varchar(50) DEFAULT NULL,";
$str .= "employeeInitialsPNo varchar(10) DEFAULT NULL,";
$str .= "employeePAddress varchar(50) DEFAULT NULL,";
$str .= "employeePAddressPNo varchar(10) DEFAULT NULL";
$str .= "employeeTempAddress varchar(50) DEFAULT NULL,";
$str .= "employeeTempAddressPNo varchar(10) DEFAULT NULL,";
$str .= "employeeTP int(10) DEFAULT NULL,";
$str .= "employeeEmail varchar(50) DEFAULT NULL,";
$str .= "dateofappYYYY int(11) DEFAULT NULL,";
$str .= "dateofappMM int(11) DEFAULT NULL,";
$str .= "dateofappDD int(11) DEFAULT NULL,";
$str .= "bdayMM int(11) DEFAULT NULL,";
$str .= "bdayDD int(11) DEFAULT NULL,";
$str .= "dateofincreYYYY int(4) DEFAULT NULL,";
$str .= "dateofincreMM int(2) DEFAULT NULL,";
$str .= "dateofincreDD int(2) DEFAULT NULL,";
$str .= "birthcertificate varchar(3) DEFAULT NULL,";
$str .= "medicalcertificate varchar(3) DEFAULT NULL,";
$str .= "appointmentref int(2) DEFAULT NULL,";
$str .= "incrementref varchar(10) DEFAULT NULL,";
$str .= "epfno varchar(10) DEFAULT NULL,";
$str .= "epfref varchar(10) DEFAULT NULL,";
$str .= "etfno varchar(10) DEFAULT NULL,";
$str .= "etfref varchar(10) DEFAULT NULL,";
$str .= "PRIMARY KEY (employeeNo)) ENGINE=INNODB;";




