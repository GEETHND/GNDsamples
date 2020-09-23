var str;
var empNoStr = employeeStr = "";
var msg = "";
var numberOfRecords, clientInterface, errorMsg;
var employeeLength = qualificationsLength = empDesignationLength = designationLength = universityLength = facultyLength = departmentLength = 0;

var hrms = new Array();
var employeeNoArr = new Array();
var employeeCodeArr = new Array();
var employeeTitleArr = new Array();
var employeeInstituteArr = new Array();
var employeeFacultyArr = new Array();
var employeeDepartmentArr = new Array();
var employeeCatArr = new Array();
var employeeNicNoArr = new Array();
var employeeSurnameArr = new Array();
var employeeOtherArr = new Array();
var employeeInitialsArr = new Array();
var employeePAddressArr = new Array();
var employeeTempAddressArr = new Array();
var employeeTPArr = new Array();
var employeeEmailArr = new Array();
var dateofappYYYYArr = new Array();
var dateofappMMArr = new Array();
var dateofappDDArr = new Array();
var bdayYYYYArr = new Array();
var bdayMMArr = new Array();
var bdayDDArr = new Array();
var dateofincreYYYYArr = new Array();
var dateofincreMMArr = new Array();
var dateofincreDDArr = new Array();
var birthcertificateArr = new Array();
var birthcertrefArr = new Array();
var medicalcertificateArr = new Array();
var medcertrefArr = new Array();
var appointmentrefArr = new Array();
var incrementrefArr = new Array();
var epfnoArr = new Array();
var epfrefArr = new Array();
var etfnoArr = new Array();
var etfrefArr = new Array();

var qualificationIdArr = new Array();
var employeeNoArr = new Array();
var universityArr = new Array();
var durationArr = new Array();
var degreeArr = new Array();
var specializationArr = new Array();

var employeeNoDesigArr = new Array();
var empDesignationArr = new Array();
var dateappointedYYYYArr = new Array();
var dateappointedMMArr = new Array();
var dateappointedDDArr = new Array();

var designationCodeArr = new Array();
var designationTitleArr = new Array();

var universityCodeArr = new Array();
var universityTitleArr = new Array ();

var facultyCodeArr = new Array ();
var facultyTitleArr = new Array();
var facultyUniversityCodeArr = new Array();

var deptCodeArr = new Array ();
var deptTitleArr = new Array();

hrms["universityCode"] = hrms["universityTitle"] = hrms["selectedUniversity"] = hrms["facultySelectedUniversity"] = "";
hrms["facultyCode"] = hrms["facultyTitle"] = "";
hrms["deptCode"] = hrms["deptTitle"]  ="";

hrms["selectedEmployee"] = "This is a testing file";
hrms["selectedDesignation"] = hrms["selectedEmployeeNo"] = "";
hrms["designatedEmpNo"] = "";

hrms["designationCode"] = hrms["designationTitle"] = "";

hrms["employeeInstitute"] = "UOK";
hrms["employeeFaculty"] = "Science";
hrms["employeeDepartment"] = "Chemistry";
//hrms["employeeCat"] = "Cat1";
hrms["employeeNo"] = "E001";
hrms["employeePersonalFile"] = "PersonalFile";
hrms["employeeNicNo"] = "888888888V";
hrms["employeeNicNoPNo"] = "02";
hrms["employeeSurname"]="Dissanayake";
hrms["employeeSurnamePNo"]="02";
hrms["employeeOther"]="Geethmi";
hrms["employeeOtherPNo"]="02";
hrms["employeeInitials"]="D.M.G.N.";
hrms["employeeInitialsPNo"]="02";
hrms["employeePAddress"]="Yakkala";
hrms["employeePAddressPNo"]="02";
hrms["employeeTempAddress"]="Kelaniya";
hrms["employeeTempAddressPNo"]="02";
hrms["employeeTP"]="0777777777";
hrms["employeeEmail"]="geeth@123";
hrms['dateofappYYYY']=2013;
hrms['dateofappMM']=3;
hrms['dateofappDD']=10;
hrms['dateappointedYYYY']=2013;
hrms['dateappointedMM']=3;
hrms['dateappointedDD']=10;
hrms['bdayYYYY']=1989;
hrms['bdayMM']=1;
hrms['bdayDD']=31;
hrms['dateofincreYYYY']=2013;
hrms['dateofincreMM']=6;
hrms['dateofincreDD']=30;
hrms['birthcertificate'] = "no";
hrms['birthref'] = "03";
hrms['medicalcertificate'] = "yes";
hrms['medref'] = "03";
hrms["appointmentref"] = "01";
hrms["incrementref"] = "02";
hrms["epfno"]='02';
hrms["epfref"] = '02';
hrms["etfno"] = '01';
hrms["etfref"] = '02';
hrms["employeeQualification"] = "BSc";
hrms["empDesignation"]="Developer";

hrms["university"]="Kelaniya";
hrms["duration"]="4 years";
hrms["degree"]="BSc in IT";
hrms["specialization"]="Chemistry";

//these are to be created on db tables
hrms['hiringUniversity'] = new Array("University of Kelaniya","University of Colombo");
hrms['hiringFaculty'] = new Array("Science","Commerce");
hrms['hiringDept'] = new Array("Chemistry","Maths");

hrms['sepecifiedDegree'] = new Array("BSc","BIT","BCom","BA","MSc","Phd");

var employeeNumberArr = new Array("E001","E002","E003","E004");
var universityTitle = new Array("Kelaniya","Colombo","Moratuwa");
var universityTitleCode = new Array("1","2","3");
var institutes = new Array("UOK", "UOM", "SLIIT");
var instituteCode = new Array("K", "M", "T");
var faculty = new Array("Science", "Arts", "IT");
var facultyCode = new Array("01", "02", "03");
var deptCode = deptName=  new Array("DIM","DOC","DOM");
var Designation = new Array("Lecturer Probationary","Lecturer","Senior Lecturer 2","Senior Lecturer 1","Professor","Senior Professor");


function loadjsfile(filename){

 			 var fileref=document.createElement('script');
			  fileref.setAttribute("type","text/javascript");
			  fileref.setAttribute("src", filename);
			  document.getElementsByTagName("head")[0].appendChild(fileref)

	 }
	loadjsfile("isrDBHandler.js");

function userLogin() {

		var user = document.loginForm.username.value;
		var password = document.loginForm.password.value;

		if( !(password && user)){
			document.getElementById("formArea").innerHTML += "<center>User Name and Password are required</center>" ;
			return;
		} else {

			isrHandle = new isrDBHandler();
			dataStr = "action=get&interface=getInitial";
			isrHandle.getDataFromDB(eval("clientController"), "serverController.php", dataStr);
		}
	}	
	
function clientController(xmlDocument) {

		initialization(xmlDocument);
		showMenu(clientInterface);
	}
	
function initialization(xml) {
		var qualificationsLength = empDesignationLength = designationLength = 0;
		var numberOfRecords = xml.getElementsByTagName("record").length;
		for(i=0; i<numberOfRecords; i++){
		
			if(xml.getElementsByTagName("record")[i].getAttribute("error") != null){
				errorMsg = xml.getElementsByTagName("record")[i].getAttribute("error");
				alert(errorMsg);
				exit;
			}

			if(xml.getElementsByTagName("record")[i].getAttribute("employeeNo") != null){
	
				employeeNoArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeNo");
				employeeInstituteArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeInstitute");
				employeeFacultyArr [employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeFaculty");
				employeeDepartmentArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeDepartment");
				employeeCatArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeCats");
				//employeeNicNoArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeNicNo");
				employeeSurnameArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeSurname");
				employeeOtherArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeOther");
				employeeInitialsArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeInitials");
				employeePAddressArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeePAddress");
				employeeTempAddressArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeTempAddress");
				employeeTPArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeTP");
				employeeEmailArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeEmail");
				dateofappYYYYArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("dateofappYYYY"); 
				dateofappMMArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("dateofappMM"); 
				dateofappDDArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("dateofappDD"); 
				bdayYYYYArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("bdayYYYY");
				bdayMMArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("bdayMM");
				bdayDDArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("bdayDD");
				dateofincreMMArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("dateofincreMM");
				dateofincreDDArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("dateofincreDD");
				birthcertificateArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("birthcertificate");
				birthcertrefArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("birthref");
				medicalcertificateArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("medicalcertificate");
				medcertrefArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("medref");
				appointmentrefArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("appointmentref");
				incrementrefArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("incrementref");
				epfnoArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("epfno");
				epfrefArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("epfref");
				etfnoArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("etfno");
				etfrefArr[employeeLength] = xml.getElementsByTagName("record")[i].getAttribute("etfref");
			
				employeeLength++;
			}
			
			if(xml.getElementsByTagName("record")[i].getAttribute("qualificationId") != null){
			
				qualificationIdArr[qualificationsLength] = xml.getElementsByTagName("record")[i].getAttribute("qualificationId");
				employeeNoArr[qualificationsLength] = xml.getElementsByTagName("record")[i].getAttribute("employeeNo");
				universityArr[qualificationsLength] = xml.getElementsByTagName("record")[i].getAttribute("university");
				durationArr [qualificationsLength] = xml.getElementsByTagName("record")[i].getAttribute("duration");
				degreeArr [qualificationsLength] = xml.getElementsByTagName("record")[i].getAttribute("degree");
				specializationArr [qualificationsLength] = xml.getElementsByTagName("record")[i].getAttribute("specialization");
				dateofappYYYYArr [qualificationsLength] = xml.getElementsByTagName("record")[i].getAttribute("dateofappYYYY");
				dateofappMMArr[qualificationsLength] = xml.getElementsByTagName("record")[i].getAttribute("dateofappMM");
				dateofappDDArr [qualificationsLength] = xml.getElementsByTagName("record")[i].getAttribute("dateofappDD");
				qualificationsLength++;
			}
			
			if(xml.getElementsByTagName("record")[i].getAttribute("empDesignation") != null){
				employeeNoDesigArr[empDesignationLength] = xml.getElementsByTagName("record")[i].getAttribute("designatedEmpNo");
				empDesignationArr[empDesignationLength] = xml.getElementsByTagName("record")[i].getAttribute("empDesignation");
				dateappointedYYYYArr[empDesignationLength] = xml.getElementsByTagName("record")[i].getAttribute("dateappointedYYYY");
				dateappointedMMArr[empDesignationLength] = xml.getElementsByTagName("record")[i].getAttribute("dateappointedMM");
				dateappointedDDArr[empDesignationLength] = xml.getElementsByTagName("record")[i].getAttribute("dateappointedDD");
				empDesignationLength++;
			}
			
			if(xml.getElementsByTagName("record")[i].getAttribute("designationCode") != null){
				designationCodeArr[designationLength] = xml.getElementsByTagName("record")[i].getAttribute("designationCode");
				designationTitleArr[designationLength] = xml.getElementsByTagName("record")[i].getAttribute("designationTitle");
				designationLength++;
			}
			
			if(xml.getElementsByTagName("record")[i].getAttribute("universityCode") != null){
				universityCodeArr[universityLength] = xml.getElementsByTagName("record")[i].getAttribute("universityCode");
				universityTitleArr[universityLength] = xml.getElementsByTagName("record")[i].getAttribute("universityTitle");
				universityLength++;
			}
			
			if(xml.getElementsByTagName("record")[i].getAttribute("facultyCode") != null){
				alert(xml.getElementsByTagName("record")[i].getAttribute("facultyUniversityCode").String);
				facultyCodeArr[facultyLength] = xml.getElementsByTagName("record")[i].getAttribute("facultyCode");
				facultyUniversityCodeArr[facultyLength] = xml.getElementsByTagName("record")[i].getAttribute("facultyUniversityCode");
				facultyTitleArr[facultyLength] = xml.getElementsByTagName("record")[i].getAttribute("facultyTitle");
				facultyLength++;
			}
			
			if(xml.getElementsByTagName("record")[i].getAttribute("deptCode") != null){
				deptCodeArr[departmentLength] = xml.getElementsByTagName("record")[i].getAttribute("deptCode");
				facultyCodeArr[departmentLength] = xml.getElementsByTagName("record")[i].getAttribute("facultyCode");
				universityCodeArr[departmentLength] = xml.getElementsByTagName("record")[i].getAttribute("universityCode");
				deptTitleArr[departmentLength] = xml.getElementsByTagName("record")[i].getAttribute("deptTitle");
				departmentLength++;
			}
			
			if(xml.getElementsByTagName("record")[i].getAttribute("userName") != null){
				userName = xml.getElementsByTagName("record")[i].getAttribute("userName");
			}

			if(xml.getElementsByTagName("record")[i].getAttribute("interface") != null){
				clientInterface = xml.getElementsByTagName("record")[i].getAttribute("interface");
			}
			
			}
	}


function showMenu(dsp) {

		str = menuMain(dsp);
		str += menuEmployee(dsp);
		str += menuAdmin(dsp);


		if(str != ""){
			document.getElementById("menuArea").innerHTML = str;
			document.getElementById("msgArea").innerHTML = "";
		}

		str = formEmployee(dsp);
		str += formViewEmployee(dsp);
		str += formQualification(dsp);
		str += formDesignations(dsp);
		str += formViewDesignations(dsp);
		str += formAddDesignation(dsp);
		str += formSelectFaculty(dsp);
		str += formSelectDepartment(dsp);
		str += formSelectEmployee(dsp);
		
		str += "<br><br><center><b><font size='4'>";

		if(msg.length != 0 && msg.indexOf("not been") != -1){
			str += '<img src="images/wrong.jpg" width="30" height="30" align="middle">&nbsp;&nbsp;'+msg;
		} 

		if(msg.length != 0 && (msg.indexOf("not been") == -1) && msg.indexOf("been") != -1){
			str += '<img src="images/right.jpg" width="30" height="30" align="middle">&nbsp;&nbsp;'+msg;
		}

		str += "</font></b></center>";
		msg = "";
		document.getElementById("formArea").innerHTML = str;

		return;

	}
	
/*************************  Menu definition area starts here *****************************************/
function menuMain(dsp) {

		str = "";
		if(dsp == "main") {

		str  = '<div id="main">';
		str += '<fieldset><legend style="font-weight:bolder; color:#4182a0">Main Menu</legend>';
		str += '<button onclick="showMenu('+"'administration'"+')"><b>Administration</b></button>';
		str += '<button onclick="showMenu('+"'maintainemployee'"+')"><b>Employees</b></button>';
		str += '</fieldset></div>';
		}
		return str;

	}

function menuAdmin(dsp){
	str = "";
	if(dsp == "administration") {

	str  = '<div id="administration">';
	str += '<fieldset><legend style="font-weight:bolder; color:#4182a0">Administration Menu</legend>';
	str += '<button onclick="sendForm('+"'data4ViewDesignation'"+');"><b>View Designations</b></button>';
	str += '<button onclick="sendForm('+"'data4AddNewDesignation'"+');"><b>Add New Designation</b></button>';
	str += '<button onclick="showMenu('+"'main'"+')"><b>Back</b></button>';
	str += '</fieldset></div>';
	}
  	return str;	
		
}

function menuEmployee(dsp){
	
	str = "";
	if(dsp == "maintainemployee") {

	str  = '<div id="maintainemployee">';
	str += '<fieldset><legend style="font-weight:bolder; color:#4182a0">Employee Registration Menu</legend>';
	//str += '<button onclick="sendForm('+"'data4ViewEmp'"+');sendForm('+"'data4ViewUniversities'"+');sendForm('+"'data4ViewFaculties'"+');sendForm('+"'data4ViewDepts'"+');"><b>View Employee</b></button>';
	str += '<button onclick="sendForm('+"'data4ViewEmp'"+');sendForm('+"'data4ViewFaculties'"+');"><b>View Employee</b></button>';
	str += '<button onclick="sendForm('+"'data4AddNewEmp'"+'); showMenu('+"'addemployee'"+')"><b>New Employee Registration</b></button>';
	str += '<button onclick="showMenu('+"'addQualification'"+')"><b>Qualifications</b></button>';
	str += '<button onclick="sendForm('+"'data4AddDesignation'"+');"><b>Designations</b></button>';
	str += '<button onclick="showMenu('+"'main'"+')"><b>Back</b></button>';
	str += '</fieldset></div>';
	}
  	return str;	
		
	}
/*************************  Menu definition area ends here *****************************************/

/*************************  Form definition area starts here *****************************************/
function formViewDesignations(dsp){
	str = "";
	if(dsp == "formViewDesignations") {
	alert(designationLength+"designationLength");
			str  = "<div id='viewDesignation'>";
			str += "<table align='center' border='1' ><tr><td>"
			str += '<h2 align="center">View Current Designations</h2><hr>';
			str += '<form name="viewdesignation" method="POST">';
			
			var desStr="<option>--Select--</option>";
			for(i = 0; i<designationLength; i++) {
				desStr += "<option>"+designationCodeArr[i]+"-"+designationTitleArr[i]+"</option>";
			}
			str += "<br><center><select name='selectedDesignation' onchange='hrms[this.name]=this.value;'>";
			str += desStr;
			str += "</select></center><br><br><br><br>";
			str += '<button onclick=showMenu("updateThisDesignation")>Update designation</button>';
			str += '<button onclick=showMenu("deleteThisDesignation")>Delete</button>';
			str += '<input type="button" value = "Back" onclick = showMenu("administration")>'
			str += '</form>';
			str += '</td></tr></table>';
			str += "</div>";
		}

		return str;
}

function formAddDesignation(dsp) {

    str = "";
	
    var title="New Designation";
    var keyDisabled = fieldDisabled = birthcetificateyes = birthcetificateno = medicalcetificateno = medicalcetificateyes = "";

    if(dsp == "addNewDesignation" || dsp == "updateThisDesignation" || dsp == "deleteThisDesignation") {

        if(dsp == "updateThisDesignation" || dsp == "deleteThisDesignation"){
            title = "Update Designation";
				
            if(dsp == "deleteThisDesignation"){
                title = "Delete Designation";
                fieldDisabled = "Disabled";
            }

            keyDisabled = "Disabled";

            if(hrms["selectedDesignation"] != ""){
                hrms["designationCode"] = hrms["selectedDesignation"].substring(0,10);
                hrms["designationTitle"] = hrms["selectedDesignation"].substring(11,(hrms["selectedDesignation"].length));
            }
        }
        str  = "<div id='addNewDesignation'>";
        str += '<form name="maintainDesignations" method="POST">';
        str += "<table align='center' border='1' ><tr><td>"
		str += '<h2 align="center">'+title+'</h2><hr>';

	//begining of the form
		str += "Code:&nbsp;";
		str += "<input type='text' name='designationCode' value= '"+hrms["designationCode"].trim()+"' style='width:80px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'>&nbsp;&nbsp;";
        str += "Title :<input type='text' name='designationTitle' value= '"+hrms["designationTitle"].trim()+"' style='width:180px; height:20px;' maxlength='100' "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";

        if(dsp == "addNewDesignation"){
            str += '<br><br><br><center><input type="submit" value="Save" onclick=validate("addNewDesignation");>';
        } else if(dsp == "updateThisDesignation") {
            str += '<input type="submit" value="Update" onclick=validate("updateThisDesignation")>';
        } else {
            str += '<input type="submit" value="Delete" onclick=sendForm("deleteThisDesignation")>';
        }
		str += '<input type="button" value = "Back" onclick = showMenu("maintainemployee")></center><br><br>';
        str += '</td></tr></table>';
		
		str += '</form>';
        str += "</div>";
					
    }
    str += "<div id='msgEmployee'></div>";
		
    //to be removed
    document.getElementById("formArea").innerHTML=str;
    return str;
}

function formViewEmployee(dsp){
	str = "";
	var hiringUniversityStr,hiringFacultyStr,hiringDeptStr;
	if(dsp == "formViewEmployee") {

			str  = "<div id='viewEmployee'>";
			str += "<table align='center' border='1' ><tr><td>"
			str += '<h2 align="center">View Employee Details</h2><hr>';
			str += '<form name="viewemployee" method="POST">';
     
	for(i = 0; i<universityLength; i++) {
			hiringUniversityStr += "<option>"+universityCodeArr[i]+"-"+universityTitleArr[i]+"</option>";
			}
			str += "<div style='width:260px; float:left;'>Select university/institute :</div><select name='selectedUniversity' style='width:160px' onchange='hrms[this.name]=this.value;'>";
			str += hiringUniversityStr;
			str += "</select><br/><br/>";
			
    //hrms["facultySelectedUniversity"] = hrms["selectedUniversity"].substring(0,4);
	
	/*for(j = 0; j<facultyLength; j++) {
			//if(hrms["facultySelectedUniversity"] = universityCodeArr[j]){
			//alert(universityCodeArr[j].value);
			hiringFacultyStr += "<option>"+facultyTitleArr[j]+"</option>";
			//}
			}
			str += "<div style='width:260px; float:left;'>Select faculty/institute(WU)/campus :</div><select name='facultyTitle' style='width:160px' onchange='hrms[this.name]=this.value);'>";
			str += hiringFacultyStr;
			str += "</select><br/><br/>";
	
	for(k = 0; k<departmentLength; k++) {
			hiringDeptStr += "<option>"+deptTitleArr[k]+"</option>";
			}
			str += "<div style='width:260px; float:left;'>Select department :</div><select name='deptTitle' style='width:160px' onchange='hrms[this.name]=this.value;'>";
			str += hiringDeptStr;
			str += "</select><br/><br/>";
			
			var employeeStr="<option>--Select--</option>";
	for(i = 0; i<employeeLength; i++) {
			//employeeStr += "<option>"+employeeNoArr[i]+"-"+employeeInitialsArr[i]+"&nbsp;"+employeeSurnameArr[i]+"-"+employeeInstituteArr[i]+":"+employeeFacultyArr[i]+":"+employeeDepartmentArr[i]+"</option>";
			employeeStr += "<option>"+employeeNoArr[i]+"</option>";
			}
			str += "<br><b><div style='width:260px; float:left;'>Employee No: </b></div><select name='selectedEmployeeNo' onchange='hrms[this.name]=this.value;'>";
			str += employeeStr;
			str += "</select><br><br><br><br>";
			str += '<button onclick=showMenu("updateemployee")>Update personal data</button>';
			str += '<button onclick=showMenu("addQualification")>Add a qualification</button>';
			str += '<button onclick=sendForm('+"'data4AddDesignation'"+');showMenu("addDesignation")>Update designation</button>';
			str += '<br><center><button onclick=showMenu("deleteemployee")>Delete employee</button>';*/
			str += '<input type="button" value = "Submit" onclick = showMenu("formSelectFaculty")></center>';
			str += '<input type="button" value = "Back" onclick = showMenu("main")></center>';
			
			str += '</form>';
			str += '</td></tr></table>';
			str += "</div>";
		}
	
		return str;
}

function formSelectFaculty(dsp){
	str = "";
	var hiringUniversityStr,hiringFacultyStr,hiringDeptStr;
	if(dsp == "formSelectFaculty") {

			str  = "<div id='viewEmployee'>";
			str += "<table align='center' border='1' ><tr><td>"
			str += '<h2 align="center">View Employee Details</h2><hr>';
			str += '<form name="viewemployee" method="POST">';
			
	if(hrms["selectedUniversity"] != ""){
				alert(hrms["selectedUniversity"]);
					hrms["facultySelectedUniversity"] = hrms["selectedUniversity"].substring(0,4);
					}
    
	for(j = 0; j<facultyLength; j++) {
			if(hrms["facultySelectedUniversity"] = facultyUniversityCodeArr[j]){
			alert(facultyUniversityCodeArr[j].value);
			//hiringFacultyStr += "<option>"+facultyTitleArr[j]+"</option>";
			}
			}
			str += "<div style='width:260px; float:left;'>Select faculty/institute(WU)/campus :</div><select name='facultyTitle' style='width:160px' onchange='hrms[this.name]=this.value);'>";
			str += hiringFacultyStr;
			str += "</select><br/><br/>";
			
 			str += '<input type="button" value = "Submit" onclick = showMenu("formSelectDepartment")></center>';
			str += '<input type="button" value = "Back" onclick = showMenu("main")></center>';
			
			str += '</form>';
			str += '</td></tr></table>';
			str += "</div>";
		}
	
		return str;
}

function formSelectDepartment(dsp){
	str = "";
	var hiringUniversityStr,hiringFacultyStr,hiringDeptStr;
	if(dsp == "formSelectDepartment") {

			str  = "<div id='viewEmployee'>";
			str += "<table align='center' border='1' ><tr><td>"
			str += '<h2 align="center">View Employee Details</h2><hr>';
			str += '<form name="viewemployee" method="POST">';
     
	for(k = 0; k<departmentLength; k++) {
			hiringDeptStr += "<option>"+deptTitleArr[k]+"</option>";
			}
			str += "<div style='width:260px; float:left;'>Select department :</div><select name='deptTitle' style='width:160px' onchange='hrms[this.name]=this.value;'>";
			str += hiringDeptStr;
			str += "</select><br/><br/>";
			
 			str += '<input type="button" value = "Submit" onclick = showMenu("formSelectEmployee")></center>';
			str += '<input type="button" value = "Back" onclick = showMenu("main")></center>';
			
			str += '</form>';
			str += '</td></tr></table>';
			str += "</div>";
		}
	
		return str;
}

function formSelectEmployee(dsp){
	str = "";
	var hiringUniversityStr,hiringFacultyStr,hiringDeptStr;
	if(dsp == "formSelectEmployee") {

			str  = "<div id='viewEmployee'>";
			str += "<table align='center' border='1' ><tr><td>"
			str += '<h2 align="center">View Employee Details</h2><hr>';
			str += '<form name="viewemployee" method="POST">';
     
	for(k = 0; k<departmentLength; k++) {
			hiringDeptStr += "<option>"+deptTitleArr[k]+"</option>";
			}
			str += "<div style='width:260px; float:left;'>Select department :</div><select name='deptTitle' style='width:160px' onchange='hrms[this.name]=this.value;'>";
			str += hiringDeptStr;
			str += "</select><br/><br/>";
			
 			str += '<input type="button" value = "Submit" onclick = showMenu("formSelectEmployee")></center>';
			str += '<input type="button" value = "Back" onclick = showMenu("main")></center>';
			
			str += '</form>';
			str += '</td></tr></table>';
			str += "</div>";
		}
	
		return str;
}

function formEmployee(dsp) {

    str = "";
	
    var title="New Employee";
    var keyDisabled = fieldDisabled = birthcetificateyes = birthcetificateno = medicalcetificateno = medicalcetificateyes = "";

    if(dsp == "addemployee" || dsp == "updateemployee" || dsp == "deleteemployee") {

        if(dsp == "updateemployee" || dsp == "deleteemployee"){
            title = "Update Employee";
				
            if(dsp == "deleteemployee"){
                title = "Delete Employee";
                fieldDisabled = "Disabled";
            }

            keyDisabled = "Disabled";

            if(hrms["selectedEmployee"] != ""){
//                hrms["employeeCode"] = hrms["selectedEmployee"].substring(0,10);
  //              hrms["employeeTitle"] = hrms["selectedEmployee"].substring(11,(hrms["selectedEmployee"].length));
            }
        }
        str  = "<div id='addemployee'>";
        str += '<form name="maintainEmployee" method="POST">';
        str += "<table align='left' border='1' ><tr><td>"
		str += '<h2 align="center">'+title+'</h2><hr>';

	//begining of the form
var hiringUniversityStr,hiringFacultyStr,hiringDeptStr;
     
	for(i = 0; i<hrms['hiringUniversity'].length; i++) {
			hiringUniversityStr += "<option>"+hrms['hiringUniversity'][i]+"</option>";
			}
			str += "Select a university :&nbsp;&nbsp;&nbsp;<select name='employeeInstitute' style='width:160px' onchange='hrms[this.name]=this.value;'>";
			str += hiringUniversityStr;
			str += "</select><br/><br/>";
     
	for(i = 0; i<hrms['hiringFaculty'].length; i++) {
			hiringFacultyStr += "<option>"+hrms['hiringFaculty'][i]+"</option>";
			}
			str += "Select a faculty :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name='employeeFaculty' style='width:160px' onchange='hrms[this.name]=this.value;'>";
			str += hiringFacultyStr;
			str += "</select><br/><br/>";
	
	for(i = 0; i<hrms['hiringDept'].length; i++) {
			hiringDeptStr += "<option>"+hrms['hiringDept'][i]+"</option>";
			}
			str += "Select a department :&nbsp;<select name='employeeDepartment' style='width:160px' onchange='hrms[this.name]=this.value;'>";
			str += hiringDeptStr;
			str += "</select><br/><br/>";

	str += "Employee No :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='text' name='employeeNo' value= '"+hrms["selectedEmployeeNo"].trim()+"' style='width:160px; height:20px;' maxlength='10' "+keyDisabled+" onchange='hrms[this.name]=this.value'><br><br>";  

	//Changefrom here
		str += "Surname:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		str += "<input type='text' name='employeeSurname' value= '"+hrms["employeeSurname"].trim()+"' style='width:160px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'>&nbsp;&nbsp;";
        str += "Page No :<input type='text' name='employeeSurnamePNo' value= '"+hrms["employeeSurnamePNo"].trim()+"' style='width:80px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";
        str += "Other Names :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='text' name='employeeOther' value= '"+hrms["employeeOther"].trim()+"' style='width:160px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'>&nbsp;&nbsp;";
        str += "Page No :<input type='text' name='employeeOtherPNo' value= '"+hrms["employeeOtherPNo"].trim()+"' style='width:80px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";
        str += "Initial :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='text' name='employeeInitials' value= '"+hrms["employeeInitials"].trim()+"' style='width:160px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'>&nbsp;&nbsp;";
        str += "Page No :<input type='text' name='employeeInitialsPNo' value= '"+hrms["employeeInitialsPNo"].trim()+"' style='width:80px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";
        str += "Permenant Address :&nbsp;<input type='text' name='employeePAddress' value= '"+hrms["employeePAddress"].trim()+"' style='width:160px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'>&nbsp;&nbsp;";
        str += "Page No :</label><input type='text' name='employeePAddressPNo' value= '"+hrms["employeePAddressPNo"].trim()+"' style='width:80px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";
        str += "Temporary Address :&nbsp;<input type='text' name='employeeTempAddress' value= '"+hrms["employeeTempAddress"].trim()+"' style='width:160px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'>&nbsp;&nbsp;";
        str += "Page No :<input type='text' name='employeeTempAddressPNo' value= '"+hrms["employeeTempAddressPNo"].trim()+"' style='width:80px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";
        str += "Telephone :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='text' name='employeeTP' value= '"+hrms["employeeTP"].trim()+"' style='width:160px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";
        str += "E-Mail :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='text' name='employeeEmail' value= '"+hrms["employeeEmail"].trim()+"' style='width:160px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br>";
				
        str += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
        str += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
         str += '</td></tr></table>';
		
		str += "<table align='right' border='1'><tr><td>"
        str += '<h2 align="center">'+title+'</h2><hr>';
        //begining of the form
		str += "<div id='dateofapp' style='width:200px;float:left;'><b>Date of Appoinment:</div></b>";
        str += "<select name='dateofappYYYY' value='dateofappYYYY' style=' width:60px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1980, 2020, 4, hrms['dateofappYYYY']);
        str += "</select>&nbsp;/&nbsp;";
        str += "<select name='dateofappMM' value='dateofappMM' style=' width:40px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1, 12, 2, hrms['dateofappMM']);
        str += "</select>&nbsp;/&nbsp;";
        str += "<select name='dateofappDD' value='dateofappDD' style=' width:45px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1, 31, 2, hrms['dateofappDD']);
        str += "</select></div>";
		str+="&nbsp;&nbsp;&nbsp;&nbsp;Page No:<input type='text' name='appointmentref' value= '"+hrms["appointmentref"].trim()+"' size='10px' onchange='hrms[this.name]=this.value'>";
        str += "<br><br>";
        str+="<div id='bday' style='width:200px;float:left;'><b>Date of Birth:</div></b>";
        str += "<select name='bdayYYYY' value='YYYY' style=' width:60px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1980, 2020, 4, hrms['YYYY']);
        str += "</select>&nbsp;/&nbsp;";
        str += "<select name='bdayMM' value='MM' style=' width:40px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1, 12, 2, hrms['MM']);
        str += "</select>&nbsp;/&nbsp;";
        str += "<select name='bdayDD' value='DD' style=' width:45px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1, 31, 2, hrms['DD']);
        str += "</select></div><br>";
        str += "<br><br>";
        if(hrms['birthcertificate']=='yes'){
            birthcetificateyes = 'checked';
        } else if(hrms['birthcertificate']=='no'){
            birthcetificateno = 'checked';
        }
        str += "Availability of Birth Certificate &nbsp;&nbsp;&nbsp;&nbsp;<input type='radio' name='birthcertificate' "+birthcetificateyes+" value='yes' onchange='hrms[this.name]=this.value'>Yes ";
        str += "<input type='radio' name='birthcertificate' "+birthcetificateno+" value='no' onchange='hrms[this.name]=this.value'>No";
        str += " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		str += "Page No:<input type='text' name='birthref' value= '"+hrms["birthref"].trim()+"' size='10px' onchange='hrms[this.name]=this.value'>";
        str += "<br><br>";
        medicalcetificateyes = '';
        medicalcetificateno = '';
        if(hrms['medicalcertificate']=='yes'){
            medicalcetificateyes = 'checked';
        } else if(hrms['medicalcertificate']=='no'){
            medicalcetificateno = 'checked';
        }
        str += "Availability of Medical Certificate&nbsp;<input type='radio' name='medicalcertificate' "+medicalcetificateyes+" value='yes' onchange='hrms[this.name]=this.value'>Yes";
        str += "<input type='radio' name='medicalcertificate' "+medicalcetificateno+" value='no' onchange='hrms[this.name]=this.value'>No";
        str += " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		str += "Page No:<input type='text' name='medref' value= '"+hrms["medref"].trim()+"' size='10px' onchange='hrms[this.name]=this.value'>";
        str += "<br><br>";
        str += "<div id='dateofincre' style='width:200px;float:left;'><b>Date of Increment</div></b>";
        str += "<select name='dateofincreYYYY' value='dateofincreYYYY' style=' width:60px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1980, 2020, 4, hrms['dateofincreYYYY']);
        str += "</select>&nbsp;/&nbsp;";
        str += "<select name='dateofincreMM' value='dateofincreMM' style=' width:40px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1, 12, 2, hrms['dateofincreMM']);
        str += "</select>&nbsp;/&nbsp;";
        str += "<select name='dateofincreDD' value='dateofincreDD' style=' width:45px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1, 31, 2, hrms['dateofincreDD']);
        str += "</select></div>&nbsp;&nbsp;&nbsp;&nbsp;Page No:<input type='text' name='incrementref' value= '"+hrms["incrementref"].trim()+"' size='10px' onchange='hrms[this.name]=this.value'>";
        str += "<br><br><br><br>";
        str += "E.P.F. No &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		str += "<input type='text' name='epfno' value= '"+hrms["epfno"].trim()+"' size='10px' onchange='hrms[this.name]=this.value'>";
		str += " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		str += "Page No:<input type='text' name='epfref' value= '"+hrms["epfref"].trim()+"' size='10px' onchange='hrms[this.name]=this.value'>";
        str += "<br><br>";
        str += "E.T.F. No &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ";
		str += "<input type='text' name='etfno' value= '"+hrms["etfno"].trim()+"' size='10px' onchange='hrms[this.name]=this.value'>";
		str += " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		str += "Page No:<input type='text' name='etfref' value= '"+hrms["etfref"].trim()+"' size='10px' onchange='hrms[this.name]=this.value'>";
        if(dsp == "addemployee"){
            str += '<br><br><br><center><input type="submit" value="Save" onclick=validate("addemployee");>';
        } else if(dsp == "updateemployee") {
            str += '<input type="submit" value="Update" onclick=validate("updateEmployee")>';
        } else {
            str += '<input type="submit" value="Delete" onclick=sendForm("deleteEmployee")>';
        }

        str += '<input type="button" value = "Back" onclick = showMenu("maintainemployee")></center><br><br>';
        str += '</td></tr></table>';
		
		str += '</form>';
        str += "</div>";
					
    }
    str += "<div id='msgEmployee'></div>";
		
    //to be removed
    document.getElementById("formArea").innerHTML=str;
    return str;
}
	
function formDesignations(dsp) {

    str = "";
	empNoStr = "";
    var title="Insert a designation of an employee";
    var keyDisabled = fieldDisabled = "";

    if(dsp == "addDesignation" || dsp == "updateDesignation" || dsp == "deleteDesignation") {

        if(dsp == "updateDesignation" || dsp == "deleteDesignation"){
            title = "Update Designation";
				
            if(dsp == "deleteDesignation"){
                title = "Delete Designation";
                fieldDisabled = "Disabled";
            }

            keyDisabled = "Disabled";

            if(hrms["selectedEmployee"] != ""){
                hrms["employeeCode"] = hrms["selectedEmployee"].substring(0,10);
                hrms["employeeTitle"] = hrms["selectedEmployee"].substring(11,(hrms["selectedEmployee"].length));
            }
        }
        str  = "<div id='addDesignation'>";
        str += "<table align='center' border='1' ><tr><td>"
        str += '<h2 align="center">'+title+'</h2><hr>';
        str += '<form name="maintainEmpDesignations" method="POST">';
        //begining of the form
        
		str += "<div style='width:150px;float:left;'><b>Employee No:</div></b><input type='text' name='selectedEmployeeNo' value= '"+hrms["selectedEmployeeNo"].trim()+"' style='width:100px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";

		var desStr="<option>--Select--</option>";
			for(i = 0; i<designationLength; i++) {
				desStr += "<option>"+designationTitleArr[i]+"</option>";
			}
			str += "<br><div style='width:150px;float:left;'><b>Designation:</div></b><select name='empDesignation' onchange='hrms[this.name]=this.value;'>";
			str += desStr;
			str += "</select><br><br><br><br>";

        //Changefrom here
        		
		str += "<div style='width:150px;float:left;'><b>Date of Appoinment:</div></b>";
        str += "<select name='dateappointedYYYY' value='dateappointedYYYY' style=' width:60px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1980, 2020, 4, hrms['dateappointedYYYY']);
        str += "</select>&nbsp;/&nbsp;";
        str += "<select name='dateappointedMM' value='dateappointedMM' style=' width:40px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1, 12, 2, hrms['dateappointedMM']);
        str += "</select>&nbsp;/&nbsp;";
        str += "<select name='dateappointedDD' value='dateappointedDD' style=' width:45px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1, 31, 2, hrms['dateappointedDD']);
        str += "</select></div><br><br>";
				
		if(dsp == "addDesignation"){
            str += '<input type="submit" value="Save" onclick=validate("addDesignation")>';
        } else if(dsp == "updateDesignation") {
            str += '<input type="submit" value="Update" onclick=validate("updateDesignation")>';
        } else {
            str += '<input type="submit" value="Delete" onclick=sendForm("deleteDesignation")>';
        }

        str += '<input type="button" value = "Back" onclick = showMenu("maintainemployee")>'
        str += '</form>';
        str += '</td></tr></table>';
        str += "</div>";
			
			
    }
    str += "<div id='msgEmployee'></div>";
		
    //to be removed
    document.getElementById("formArea").innerHTML=str;
    return str;
}

function formQualification(dsp) {

    str = "";
    var title="Record a qualification of an employee";
    var keyDisabled = fieldDisabled = "";
	var sepecifiedDegreeStr;
    if(dsp == "addQualification" || dsp == "updateQualification" || dsp == "deleteQualification") {

        if(dsp == "updateQualification" || dsp == "deleteQualification"){
            title = "Update Qualification";
    
            if(dsp == "deleteQualification"){
                title = "Delete Qualification";
                fieldDisabled = "Disabled";
            }

            keyDisabled = "Disabled";

            if(hrms["selectedEmployee"] != ""){
                hrms["employeeCode"] = hrms["selectedEmployee"].substring(0,10);
                hrms["employeeTitle"] = hrms["selectedEmployee"].substring(11,(hrms["selectedEmployee"].length));
            }
        }
        str  = "<div id='addQualification'>";
  str += '<form name="maintainEmployeeQ" method="POST">';
        str += "<table align='center' border='1' ><tr><td>"
        str += '<h2 align="center">'+title+'</h2><hr>';
        //begining of the form

  str += "<b><div style='width:200px; float:left;'>Employee No:</b></div><input type='text' name='selectedEmployeeNo' value= '"+hrms["selectedEmployeeNo"].trim()+"' style='width:100px; height:20px;' maxlength='10' "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";

 str += "<b><div style='width:200px; float:left;'>Degree awarding institute:</b></div><select name='university' id='university' value= '"+hrms["university"].trim()+"' '+fieldDisabled+' onchange='hrms[this.name]=this.value' >";
   for(var i = 0; i<universityTitle.length; i++){
    str+= "<option value='"+universityTitle[i]+"'>"+universityTitle[i]+"</option>";
   }
   str += '</select><br/><br/>';

 str += "<b><div style='width:200px; float:left;'>Duration:</b></div><input type='text' name='duration' value= '"+hrms["duration"].trim()+"' style='width:100px; height:20px;'  "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";

 for(i = 0; i<hrms['sepecifiedDegree'].length; i++) {
			sepecifiedDegreeStr += "<option>"+hrms['sepecifiedDegree'][i]+"</option>";
			}
			str += "<b><div style='width:200px; float:left;'>Degree :</b></div><select name='sepecifiedDegree' style='width:160px' onchange='hrms[this.name]=this.value;'>";
			str += sepecifiedDegreeStr;
			str += "</select><br/><br/>";

 str += "<b><div style='width:200px; float:left;'>Specialized area if in:</b></div><input type='text' name='specialization' value= '"+hrms["specialization"].trim()+"' style='width:80px; height:20px;'  "+fieldDisabled+" onchange='hrms[this.name]=this.value'><br><br>";
 
          
 str += "<div id='dateofapp' style='width:200px;float:left;'><b>Effective Date:</div></b>";
        str += "<select name='dateofappYYYY' value='dateofappYYYY' style=' width:60px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1980, 2020, 4, hrms['dateofappYYYY']);
        str += "</select>&nbsp;/&nbsp;";
        str += "<select name='dateofappMM' value='dateofappMM' style=' width:40px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1, 12, 2, hrms['dateofappMM']);
        str += "</select>&nbsp;/&nbsp;";
        str += "<select name='dateofappDD' value='dateofappDD' style=' width:45px' onchange='hrms[this.name]=this.value;'>";
        str += generateNumberOptions(1, 31, 2, hrms['dateofappDD']);
        str += "</select></div><br><br>";
  
  
  if(dsp == "addQualification"){
            str += '<center><input type="submit" value="Save" onclick=validate("addQualification")>';
        } else if(dsp == "updateQualification") {
            str += '<input type="submit" value="Update" onclick=validate("updateQualification")>';
        } else {
            str += '<input type="submit" value="Delete" onclick=sendForm("deleteQualification")>';
        }

        str += '<input type="button" value = "Back" onclick = showMenu("maintainemployee")></center>'
        str += '</form>';
        str += '</td></tr></table>';
        str += "</form></div>";
   
   
    }
    str += "<div id='msgEmployee'></div>";
  
    //to be removed
    document.getElementById("formArea").innerHTML=str;
    return str;
}
	
function generateNumberOptions(from, to, length, selectedValue){
 
    var str="";

    for(i=from; i<= to; i++){

        if(i == selectedValue) {
            str += "<option selected>";
        } else {
            str += "<option>";
        }

        if(i.toString().length<length){
            for(j=1; j<length;j++){
                str += "0";
            }
        }
        str += i;
        str += "</option>";
    }
  
    return str;
}
/*************************  Form definition area ends here *****************************************/

function selectFaculty(university){
		hrms['facultySelectedUniversity'] = university.substring(0,4);
		for(i = 0; i<facultyLength; i++) {
			if(facultyUniversityCodeArr[i]==hrms['facultySelectedUniversity']){
			//hiringUniversityStr += "<option>"+universityCodeArr[i]+"-"+universityTitleArr[i]+"</option>";
			
		alert(facultyUniversityCodeArr[i]+"sel");
		}}
		return hrms['facultySelectedUniversity'];
	}

	function validate(frm){

		var error = 0;

		if(frm == "addemployee" || frm == "updateemployee"){

			if(frm == "addemployee"){
				dsp = "addemployee";
			} 
			else if(frm == "updateemployee") {
				dsp = "updateemployee";alert(frm);

			}
			doc = document.maintainEmployee;
			document.getElementById("msgArea").innerHTML = "";

			if(hrms["employeeNo"].length != 4){
				
				if((document.getElementById("msgArea").innerHTML).indexOf("Error001") == -1){
					document.getElementById("msgArea").innerHTML += "<table align='center' border='0' ><tr><td>Error001 : Employee number with less than 4 non-blank alpha numeric characters is not acceptable.</td></tr></table>";
					error++;
				}
			}
					} 

		//designation function
		if(frm == "addDesignation" || frm == "updateDesignation"){

			if(frm == "addDesignation"){
				dsp = "addDesignation";
			} 
			else if(frm == "updateDesignation") {
				dsp = "updateDesignation";

			}
			doc = document.maintainEmpDesignations;
			document.getElementById("msgArea").innerHTML = "";
			
			if(hrms["selectedEmployeeNo"].length != 4){
					if((document.getElementById("msgArea").innerHTML).indexOf("Error001") == -1){
					document.getElementById("msgArea").innerHTML += "<table align='center' border='0' ><tr><td>Error001 : Employee number with less than 4 non-blank alpha numeric characters is not acceptable.</td></tr></table>";
					error++;
				}
			}
			}
		// qualification function
		
		if(frm == "addQualification" || frm == "updateQualification"){

			if(frm == "addQualification"){
				dsp = "addQualification";alert(frm+"frm");
			} 
			else if(frm == "updateQualification") {
				dsp = "updateQualification";

			}
			doc = document.maintainEmployeeQ;
			document.getElementById("msgArea").innerHTML = "";
			
			if(hrms["employeeNo"].length != 4){
				alert(hrms["employeeNo"]);
				if((document.getElementById("msgArea").innerHTML).indexOf("Error001") == -1){
					document.getElementById("msgArea").innerHTML += "<table align='center' border='0' ><tr><td>Error001 : Employee number with less than 4 non-blank alpha numeric characters is not acceptable.</td></tr></table>";
					error++;
				}
			}
			
			if(hrms['university'].length == 0){
			
				if((document.getElementById("msgArea").innerHTML).indexOf("Error002") == -1){
					document.getElementById("msgArea").innerHTML += "<table align='center' border='0' ><tr><td>Error002 : University cannot be blank.</td></tr></table>";
					error++;
				} 
			}

		} 

		//designationadmin function
		if(frm == "addNewDesignation" || frm == "updateThisDesignation"){

			if(frm == "addNewDesignation"){
				dsp = "addNewDesignation";
			} 
			else if(frm == "updateThisDesignation") {
				dsp = "updateThisDesignation";

			}
			doc = document.maintainDesignations;
			document.getElementById("msgArea").innerHTML = "";

			if(hrms["designationCode"].length != 10){
					if((document.getElementById("msgArea").innerHTML).indexOf("Error003") == -1){
					document.getElementById("msgArea").innerHTML += "<table align='center' border='0' ><tr><td>Error003 : Designation Code with less than 10 non-blank alpha numeric characters is not acceptable.</td></tr></table>";
					error++;
				}
			}
			}
		
		 
		if(error > 0){
			showMenu(dsp);
		} else {
			sendForm(frm);
		}

	}

/********************** sendForm function uses Ajax's send (POST) to communicate with the server.
                        This is the formal data communication interface from client to server
*************************************************************************************************************/

	function sendForm(frm){

		var doc, dataStr;

		if(frm.substring(0,3)=="add"){ 
			dataStr = "action=add";
		} else if(frm.substring(0,6)=="update"){
				dataStr = "action=update";
		} else if(frm.substring(0,6)=="delete"){
				dataStr = "action=delete";
		}

	if(frm == "addemployee" || frm == "updateemployee" ){
 
	   doc = document.maintainEmployee;
	   dataStr += "&interface="+frm;alert(frm.innerHTML+"inner");
	   dataStr += "&employeeNo="+doc.employeeNo.value;alert(dataStr);
	   dataStr += "&employeeInstitute="+doc.employeeInstitute.value;
	   dataStr += "&employeeFaculty="+doc.employeeFaculty.value;
	   dataStr += "&employeeDepartment="+doc.employeeDepartment.value;
	   dataStr += "&employeeSurname="+doc.employeeSurname.value;
	   dataStr += "&employeeSurnamePNo="+doc.employeeSurnamePNo.value;
	   dataStr += "&employeeOther="+doc.employeeOther.value;
	   dataStr += "&employeeOtherPNo="+doc.employeeOtherPNo.value;
	   dataStr += "&employeeInitials="+doc.employeeInitials.value;
	   dataStr += "&employeeInitialsPNo="+doc.employeeInitialsPNo.value;
	   dataStr += "&employeePAddress="+doc.employeePAddress.value;
	   dataStr += "&employeePAddressPNo="+doc.employeePAddressPNo.value;
	   dataStr += "&employeeTempAddress="+doc.employeeTempAddress.value;
	   dataStr += "&employeeTempAddressPNo="+doc.employeeTempAddressPNo.value;
	   dataStr += "&employeeTP="+doc.employeeTP.value;
	   dataStr += "&employeeEmail="+doc.employeeEmail.value;
	    dataStr += "&dateofappYYYY="+doc.dateofappYYYY.value;
		dataStr += "&dateofappMM="+doc.dateofappMM.value;
		dataStr += "&dateofappDD="+doc.dateofappDD.value;
		dataStr += "&appointmentref="+doc.appointmentref.value;
		dataStr += "&bdayYYYY="+doc.bdayYYYY.value;
		dataStr += "&bdayMM="+doc.bdayMM.value;
		dataStr += "&bdayDD="+doc.bdayDD.value;
		dataStr += "&birthcertificate="+hrms["birthcertificate"];
		dataStr += "&birthref="+hrms["birthref"];
		dataStr += "&medicalcertificate="+hrms["medicalcertificate"];
		dataStr += "&medref="+hrms["medref"];
		dataStr += "&dateofincreYYYY="+doc.dateofincreYYYY.value;
		dataStr += "&dateofincreMM="+doc.dateofincreMM.value;
		dataStr += "&dateofincreDD="+doc.dateofincreDD.value;
		dataStr += "&epfno="+doc.epfno.value;
		dataStr += "&epfref="+doc.epfref.value;
		dataStr += "&etfno="+doc.etfno.value;
		dataStr += "&etfref="+doc.etfref.value;alert(dataStr+"  dataStr");
   
  }
  
	else if(frm == "addDesignation" || frm == "updateDesignation" ){
 	   doc = document.maintainEmpDesignations;
	   dataStr += "&interface="+frm;
	   dataStr += "&designatedEmpNo="+doc.selectedEmployeeNo.value;
	   dataStr += "&empDesignation="+doc.empDesignation.value;
	   dataStr += "&dateappointedYYYY="+doc.dateappointedYYYY.value;
	   dataStr += "&dateappointedMM="+doc.dateappointedMM.value;
	   dataStr += "&dateappointedDD="+doc.dateappointedDD.value;
	   
  }
	else if(frm == "addQualification" || frm == "updateQualification" ){

			doc = document.maintainEmployeeQ;
			dataStr += "&interface="+frm;
			dataStr += "&employeeNo="+doc.selectedEmployeeNo.value;alert(dataStr);
			dataStr += "&university="+doc.university.value;alert(dataStr);
			dataStr += "&duration="+doc.duration.value;alert(dataStr);
			dataStr += "&degree="+doc.sepecifiedDegree.value;alert(dataStr);
			dataStr += "&specialization="+doc.specialization.value;alert(dataStr);
			dataStr += "&dateofappYYYY="+doc.dateofappYYYY.value;
			dataStr += "&dateofappMM="+doc.dateofappMM.value;
			dataStr += "&dateofappDD="+doc.dateofappDD.value;
		}
	else if(frm == "addNewDesignation" || frm == "updateThisDesignation" || frm == "deleteThisDesignation" ){
 	   doc = document.maintainDesignations;
	   dataStr += "&interface="+frm;
	   dataStr += "&designationCode="+doc.designationCode.value;
	   dataStr += "&designationTitle="+doc.designationTitle.value;
	   
  }
		else if(frm.substring(0,5) == 'data4') {

				dataStr = "action=get&interface="+frm;
		}

		isrHandle.getDataFromDB(eval("clientController"), "serverController.php", dataStr);

		return 0;
	
	}
	