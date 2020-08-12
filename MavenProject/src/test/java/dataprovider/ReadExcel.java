package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	
	
	public void readExcelFile(String filepath, String filename, String sheetname) throws IOException {
		
	File file = new File(filepath + filename ); //Open File

	FileInputStream fis = new FileInputStream(file); // Read File
	
	Workbook wb = null;
	
	String filextension = filename.substring(filename.indexOf("."));
	
	if(filextension.equals(".xls")) {
		
		wb = new HSSFWorkbook(fis);
	
	} else if(filextension.equals(".xlsx")){
		
		wb = new XSSFWorkbook(fis);
	}
	
	
	org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetname);
	
	int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
	
	for(int i=0; i <= rowcount; i++) {
		
		Row r = sheet.getRow(i);
		
		for(int j=0; j<= r.getLastCellNum(); j++) {
			
			String cellvalue = r.getCell(j).getStringCellValue();
			System.out.println(cellvalue + " || ");
		}
		
		System.out.println();
	}
	
	
	
	}
}
