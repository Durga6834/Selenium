package WritedataExcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteEXceldata {

	public static void main(String[] args) throws IOException {
		// to create and specify file location
		FileOutputStream fo = new FileOutputStream("D:\\Validatedata.xlsx");
		// to create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		// to create sheet
		XSSFSheet sheet = workbook.createSheet("Student Details");
		// to create rows in a sheet
		XSSFRow row1 = sheet.createRow(0);
		//enter data into rows
		row1.createCell(0).setCellValue("Student name");
		row1.createCell(1).setCellValue("subject");
		row1.createCell(2).setCellValue("Fee");
		row1.createCell(3).setCellValue("Duration");
		//Enter 2nd row value
	    XSSFRow row2 = sheet.createRow(1);
	    row2.createCell(0).setCellValue("Durgarao");
	    row2.createCell(1).setCellValue("SAP");
	    row2.createCell(2).setCellValue("10000");
	    row2.createCell(3).setCellValue("90 days");
	  //Enter 3rd row value
	    XSSFRow row3 = sheet.createRow(2);
	    row3.createCell(0).setCellValue("7hills");
	    row3.createCell(1).setCellValue("Selenium");
	    row3.createCell(2).setCellValue("10000");
	    row3.createCell(3).setCellValue("60 days");
		
	  //Enter 4th row value
	    XSSFRow row4 = sheet.createRow(3);
	    row4.createCell(0).setCellValue("Mohan");
	    row4.createCell(1).setCellValue("TOSCA");
	    row4.createCell(2).setCellValue("10000");
	    row4.createCell(3).setCellValue("30 days");
	    XSSFRow row5 = sheet.createRow(4);
	    row5.createCell(0).setCellValue("Krishna");
	    row5.createCell(1).setCellValue("SALESFORCE");
	    row5.createCell(2).setCellValue("10000");
	    row5.createCell(3).setCellValue("80 days");
	    // to write wotkbook
	    workbook.write(fo);
	    System.out.println("Excel completed");
	
		
		
	}

}

