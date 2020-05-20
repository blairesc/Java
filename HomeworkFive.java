import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;


public class HomeworkFive {

	public static void main(String[] args) throws DocumentException, IOException {
				//Document
		Document document = new Document();
		
		//Create pdf
		PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("helloworld.pdf"));
		document.open();
		
		FileReader fileReader = new FileReader("homework.csv");
		Scanner fileIn = new Scanner(fileReader);	
		while (fileIn.hasNext()) {
			document.add(new Paragraph(fileIn.nextLine()));
		}
		
		fileReader.close();
		document.close();
		pdfWriter.close();
			
	}

}
