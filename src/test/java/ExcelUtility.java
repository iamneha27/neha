import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
public static Logger logger=Logger.getLogger("LoggerLogs"); //for logs
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* XSSFWorkbook Excelwbook;
	  XSSFSheet Excelwsheet;
		  XSSFRow Row;
		  XSSFCell Cell;
		  FileInputStream fin = new FileInputStream(new File("C:\\Selenium Advance\\Myexcel.xlsx"));
		  Excelwbook=new XSSFWorkbook(fin);
		  Excelwsheet = Excelwbook.getSheet("Sheet1");
		  Cell=Excelwsheet.getRow(1).getCell(0);
		  System.out.println("Data : "+Cell.getStringCellValue());
		  
		  
		//writing dATA TO excel
		  
		  Excelwsheet.createRow(2);
		  Row= Excelwsheet.getRow(2);
		  Cell=Row.createCell(1);
		  Cell.setCellValue("New Value");
		  FileOutputStream fileout = new FileOutputStream(new File("C:\\\\Selenium Advance\\\\Myexcel.xlsx"));
		  Excelwbook.write(fileout);
		  fileout.flush();*/
		
		
		  //for generating logs
		  
		try {
			FileReader fr;
		
			fr = new FileReader("C:\\temp\\Selenium Advance\\Myfile.txt");
					
			BufferedReader br = new BufferedReader(fr);
			int i;
			while((i=br.read())!=-1) {
				System.out.println((char)i);
				
			}
			br.close();
			fr.close();

	}
catch (FileNotFoundException fe) {
	logger.debug("Test Manual");
	logger.error("File not found",fe);
	logger.warn("warning");
	logger.trace("this msg will not be logged");
	
}catch(IOException e) {
	logger.error("IOexception occured ", e);
}

}
}
