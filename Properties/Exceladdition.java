package Properties;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceladdition 
{
		public static void main(String[] args) throws IOException {
			// to create and specify file location
			FileOutputStream fo = new FileOutputStream("D:\\Validatedata1.xlsx");
			// to create workbook
			XSSFWorkbook workbook = new XSSFWorkbook();
			// to create sheet
			XSSFSheet sheet = workbook.createSheet("Student Details");
			// to create rows in a sheet
			XSSFRow row1 = sheet.createRow(0);
			//enter data into rows
			row1.createCell(0).setCellValue(10);
			row1.createCell(1).setCellValue(20);
			row1.createCell(2).setCellFormula("10+20");
		    workbook.write(fo);
			row1.createCell(2).setCellValue("Fee");
			row1.createCell(3).setCellValue("Duration");
			//Enter 2nd row value
		    XSSFRow row2 = sheet.createRow(1);
		    row2.createCell(0).setCellValue("Durgarao");
		    row2.createCell(1).setCellValue("SAP");
		    row2.createCell(2).setCellValue("10000");
		    row2.createCell(3).setCellValue("90 days");
	}

}
