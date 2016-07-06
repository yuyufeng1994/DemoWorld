package yyf.utils.office.itext;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

import javax.swing.text.rtf.RTFEditorKit;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class App {
	public static void main(String[] args) throws DocumentException, IOException {
		// step 1
		Document document = new Document();
		// step 2
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("i://a.pdf"));
		// step 3
		document.open();
//		document.
		// step 4
		String s = "<img width='500' src='http://localhost:8080/sok/doc/download-file/480/jpg'/><br><img width='500' src='http://localhost:8080/sok/doc/download-file/479/png'/><br>";
		InputStream in = new ByteArrayInputStream(s.getBytes());
//		in = new FileInputStream("i://a.html");
		XMLWorkerHelper.getInstance().parseXHtml(writer, document, in, Charset.forName("UTF-8"));
		// step 5
		document.close();
		System.out.println("success");
	}

	public static InputStream stringToInputStream(String str) {
		try {
			InputStream is = new ByteArrayInputStream(str.getBytes());

			int byteRead;
			while ((byteRead = is.read()) != -1) {
				System.out.print((char) byteRead);
			}
			is.close();
			return is;
		} catch (Exception e) {

			return null;
		}

	}
}