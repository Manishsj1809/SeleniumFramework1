package DDT;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadDataFromPDF {
	public static void main(String[] args) throws Throwable {
		
		
		File fis = new File("./src/test/resources/Basic Selenium_01&02.pdf");
		
		PDDocument doc = PDDocument.load(fis);
		
		int pages = doc.getNumberOfPages();// it will print no of pages prsent
		
		System.out.println(pages);
		
		PDFTextStripper pdfData = new PDFTextStripper();
		
		//to read full document
//		String read = pdfData.getText(doc);// reading all data present in pdf
//		System.out.println(read);
		
		//reading particular pages 
//		pdfData.setStartPage(10);
//		String read = pdfData.getText(doc);
//		System.out.println(read);
//		
		
		pdfData.setStartPage(3);
		pdfData.setEndPage(5);
		String read=pdfData.getText(doc);
		System.out.println(read);
		
		
		
		
	}

}
