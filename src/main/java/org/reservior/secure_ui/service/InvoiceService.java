package org.reservior.secure_ui.service;

import com.itextpdf.html2pdf.HtmlConverter;
import org.springframework.stereotype.Service;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class InvoiceService {
    public static void pdf_exporter(HttpServletRequest request, HttpServletResponse response){
        try {
            response.setContentType("application/pdf");
            DateFormat date = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
            String time = date.format(new Date());

            String key = "Content-Disposition";
            String value = "attachment; filename=invoice_"+time +".pdf";
            response.setHeader(key,value);

            HtmlConverter.convertToPdf(request.getInputStream(),response.getOutputStream());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
             ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
            resolver.setSuffix(".html");
            resolver.setTemplateMode("HTML");

            TemplateEngine templateEngine = new TemplateEngine();
            templateEngine.setTemplateResolver(resolver);

            SampleTableInfo info_wishlist = new SampleTableInfo();
            String pdflink = "";
            String pdflinkv= "visibility:collapse;";

            Context context = new Context();
            context.setVariable("list3",info_wishlist.getList3());
            context.setVariable("pdflink",pdflink);
            context.setVariable("pdflinkv",pdflinkv);

            String parsed_html = templateEngine.process("resources/templates/pdf/wishlist",context);
            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocument(parsed_html);
            renderer.layout();
            renderer.createPDF(response.getOutputStream());
            renderer.finishPDF();

    */
}
