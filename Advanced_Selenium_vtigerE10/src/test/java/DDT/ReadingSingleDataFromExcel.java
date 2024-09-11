package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingSingleDataFromExcel {
	public static void main(String[]args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData7.xlsx");
		
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		Row row=sheet.getRow(0);
		
		Cell cell=row.getCell(0);
		
		String excelData=cell.getStringCellValue();
		System.out.println(excelData);
		
		
	}

}
