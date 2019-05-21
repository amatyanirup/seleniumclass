package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelutils {
public static void main(String[]args) {
	getRowCount();
}
	public static void getRowCount() {
	 try {
		 
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\w19\\Book1.xlsx");
		 XSSFSheet sheet = workbook.getSheet("sheetName");
		 int rowcount=sheet.getPhysicalNumberOfRows();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	 
	 
 }	

}
