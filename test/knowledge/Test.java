package knowledge;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class Test {
	public static final String HTML = "i://a.html";
	public static final String DEST = "i://hero.pdf";

	/**
	 * Creates a PDF with the words "Hello World"
	 * 
	 * @param file
	 * @throws IOException
	 * @throws DocumentException
	 */
	public void createPdf(String file) throws IOException, DocumentException {
		// step 1
		Document document = new Document();
		// step 2
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
		// step 3
		document.open();
		// step 4
		XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream(HTML), Charset.forName("UTF-8"));
		// step 5
		document.close();
	}

	/**
	 * Main method
	 */
	public static void main(String[] args) throws IOException, DocumentException {
		String i = "<img src='resources/ueditor/upload/image/20160511/1462949082489009081.jpg' title='1462949082489009081.jpg' alt='c1.jpg'/>	";
		String a = i.substring(i.indexOf("<img src='"));
		
	}
}
