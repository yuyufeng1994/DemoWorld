package com.yyf.office.itext;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("i://test.pdf"));
		// step 3
		document.open();
		Charset charset = Charset.forName("iso-8859-1");
		System.out.println(charset);

		// step 4
		InputStreamReader isr = new InputStreamReader(new FileInputStream("i://a.html"), "UTF-8");
		XMLWorkerHelper.getInstance().parseXHtml(writer, document, isr);
		// step 5
		document.close();

		System.out.println("PDF Created!");
	}
}