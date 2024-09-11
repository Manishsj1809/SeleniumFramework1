package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	/**
	 * this method is used to read from excel file
	 * 
	 * @param SheetName
	 * @param rowNum
	 * @param celNum
	 * @return
	 * @throws Throwable
	 * @author manish
	 */
	public String getExcelData(String SheetName, int rowNum, int celNum) throws Throwable {
		FileInputStream fes = new FileInputStream("C:\\Users\\admin\\Documents\\selenium excel\\Book1.xlsx");

		Workbook book = WorkbookFactory.create(fes);

		Sheet sheet = book.getSheet(SheetName);

		Row row = sheet.getRow(rowNum);

		Cell cell = row.getCell(celNum);

		String Exceldata = cell.getStringCellValue();
		return Exceldata;
	}

	public String getExcelDataUsingFormatter(String SheetName, int rowNum, int celNum) throws Throwable {
		FileInputStream fis1 = new FileInputStream("C:\\\\Users\\\\admin\\\\Documents\\\\selenium excel\\\\Book1.xlsx");

		Workbook book = WorkbookFactory.create(fis1);

		Sheet sheet = book.getSheet(SheetName);

		Row row = sheet.getRow(rowNum);

		Cell cel = row.getCell(celNum);

		DataFormatter format = new DataFormatter();
		String ExcelData = format.formatCellValue(cel);
		System.out.println(ExcelData);
		return ExcelData;
	}
	
	public String getDataProviderData(String sheetName) throws Throwable
	{
		FileInputStream fis2 = new FileInputStream("C:\\\\Users\\\\admin\\\\Documents\\\\selenium excel\\\\Book1.xlsx");
		Workbook book2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = book2.getSheet(sheetName);
		int lastRow = sheet2.getLastRowNum();
		int lastCell = sheet2.getRow(0).getLastCellNum();
		
		Object[][] objArr = new Object[lastRow][lastCell];
		
		
		
		return null;
		
	}

}
