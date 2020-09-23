<?php
require('pdfpath.php');
require('db.inc.php');
class PDF extends FPDF
{
}
$pdf = new FPDF('P', 'mm', 'A4');
$pdf->AddPage();
$order = $_GET['ordno'];
//$pdf->Image('uoklogo.png',20,10,0);
//$pdf->Line(20,20,20,100)
$y = 20;
$pdf->SetFont('Arial','B',14);
$pdf->SetY($y);
$pdf->SetX(70);
$pdf->multiCell(200,1,'I N V O I C E - Mr.Cricket','','L');
//******************printing headings********************************/
$pdf->SetFont('Arial','B',10);
$y = $y+20;
$pdf->SetY($y);
$pdf->SetX(25);
$pdf->Cell(50,1,'Item','','L');
$pdf->SetX(100);
$pdf->Cell(50,1,'Unit Price(Rs.)','','L');
$pdf->SetX(120);
$pdf->Cell(50,1,'','','L');
$pdf->SetX(160);
$pdf->Cell(50,1,'Qty.','','L');

$getdata = "SELECT * FROM `itemtransaction`,`items` WHERE `itemtransaction`.`itemno`=`items`.`itemno` and `ordno`=$order ";
$resbook = mysql_query($getdata) or die("Mysql error");
$cnt = 0;
$total = 0;
$gtotal = 0;
while ($rowbook = mysql_fetch_array($resbook)){
	$cnt +=1;
	$refno = $rowbook['itemno'];
	$title = $rowbook['item'];
	$qtyrec = '';
	$qtyiss = $rowbook['qty_issued'];
	$price = $rowbook['uprice'];
	
	$total += $rowbook['price']*$qtyiss;
	$gtotal += $rowbook['uprice']*$qtyiss;
	
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