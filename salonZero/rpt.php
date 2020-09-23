<?php
require('pdfpath.php');
require('db.inc.php');
class PDF extends FPDF
{
}
$pdf = new FPDF('P', 'mm', 'A4');
$pdf->AddPage();
$empno = $_GET['empno'];
$pdf->Image('logo.jpg',20,10,0);
//$pdf->Line(20,20,20,100)
$y = 20;
$pdf->SetFont('Arial','B',14);
$pdf->SetY($y);
$pdf->SetX(70);
$pdf->multiCell(200,1,'P A Y   S L I P - SalonZERO','','L');
//******************printing headings********************************/
$pdf->SetFont('Arial','B',10);
$y = $y+20;
$pdf->SetY($y);
$pdf->SetX(25);
$pdf->Cell(50,1,'EID :','','L');
$y = $y+5;
$pdf->SetY($y);
$pdf->SetX(25);
$pdf->Cell(50,1,'Name :','','L');
$y = $y+5;
$pdf->SetY($y);
$pdf->SetX(25);
$pdf->Cell(50,1,'Basic :','','L');
$y = $y+5;
$pdf->SetY($y);
$pdf->SetX(25);
$pdf->Cell(50,1,'Commission :','','L');
$y = $y+5;
$pdf->SetY($y);
$pdf->SetX(25);
$pdf->Cell(50,1,'Incentive :','','L');
$y = $y+5;
$pdf->SetY($y);
$pdf->SetX(25);
$pdf->Cell(50,1,'Gross salary :','','L');
$pdf->SetX(100);
$pdf->Cell(50,1,'Unit Price(Rs.)','','L');
$pdf->SetX(120);
$pdf->Cell(50,1,'','','L');
$pdf->SetX(160);
$pdf->Cell(50,1,'Qty.','','L');

$getdata = "SELECT * FROM `employee` WHERE `empno`=$empno ";
$resbook = mysql_query($getdata) or die("Mysql error");
$cnt = 0;
$total = 0;
$gtotal = 0;
while ($rowbook = mysql_fetch_array($resbook)){
	$cnt +=1;
	$refno = $rowbook['empno'];
	$title = $rowbook['name'];
	$qtyrec = '';
	$qtyiss = $rowbook['designation'];
	$price = $rowbook['basic_sal'];
	
	$total += $rowbook['basic_sal']*$qtyiss;
	$gtotal += $rowbook['basic_sal']*$qtyiss;
	
	$pdf->SetFont('Arial','',9);
	$y = $y+6;
	$pdf->SetY($y);
	$pdf->SetX(20);
	$pdf->Cell(50,1,$order,'','L');
	$pdf->SetX(25);
	$pdf->SetFont('Arial','',9);
	$pdf->Cell(80,1,$title,'','L');
	$pdf->SetFont('Arial','',9);
	$pdf->SetX(100);
	$pdf->Cell(50,1,$price,'','L');
	$pdf->SetX(130);
	$pdf->Cell(50,1,$qtyrec,'','L');
	$pdf->SetX(170);
	$pdf->Cell(50,1,$qtyiss,'','L');
}
	$y = $y+16;
	$pdf->SetY($y);
	$pdf->SetX(130);
	$pdf->Cell(50,1,Total,'','L');
	$pdf->SetX(20);
	$pdf->Cell(50,1,Grand." ".Total,'','L');
	$pdf->SetX(80);
	$pdf->Cell(50,1,Discount,'','L');
	$y = $y+6;
	$pdf->SetY($y);
	$pdf->SetX(20);
	$pdf->Cell(50,1,$gtotal,'','L');
	$pdf->SetX(80);
	$pdf->Cell(50,1,$gtotal-$total,'','L');
	$pdf->SetX(130);
	$pdf->Cell(50,1,$total,'','L');
$pdf->Output();
?>