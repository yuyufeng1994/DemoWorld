package com.yyf.office.itext;

import java.io.ByteArrayInputStream;
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
		String pdfFile = "i://test.pdf";
		String htmlFile = "i://a.html";

		Document document = new Document();
		PdfWriter pdfwriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile));
		pdfwriter.setViewerPreferences(PdfWriter.HideToolbar);
		document.open();
		String str = "<h1>hello你好 啊</h1>132";
		// html文件
		 XMLWorkerHelper.getInstance().parseXHtml(pdfwriter, document, new FileInputStream(htmlFile),Charset.forName("UTF-8"));
//		XMLWorkerHelper.getInstance().parseXHtml(pdfwriter, document, new ByteArrayInputStream(str.getBytes()),
//				Charset.forName("UTF-8"));
		document.close();

		System.out.println("PDF Created!");
	}
}