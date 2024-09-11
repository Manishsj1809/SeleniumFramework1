package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelFile {
	
	public static void main(String[] args) throws Throwable {
		
		//Step1:-giving Connection between the physical file and testscript
		
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestDataa.xlsx");
		
		//step2:-keeping excel file in read mode
		Workbook book=WorkbookFactory.create(fis);
		
		//step3:-taking control of the excel sheet
		Sheet sheet=book.getSheet("Sheet1");
		
		//step4:-taking control of the row
		Row row=sheet.createRow(7);
		
		//step5:-taking control of the cell
		Cell cel=row.createCell(5);
		
		//step6:-insert data to the particular cell
		cel.setCellValue("Broad");
		
		
		//keeep exel book in write mode
		FileOutputStream fos=new FileOutputStream("./src/test/resources/TestDataa.xlsx");
		
		book.write(fos);
		
		book.close();
		
		
		
	}

}
