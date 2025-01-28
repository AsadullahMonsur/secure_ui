package org.reservior.secure_ui.service;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

import org.reservior.secure_ui.model.invoice.InvoicePlainFormat;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

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

            PdfWriter writer = new PdfWriter(response.getOutputStream());
            PdfDocument pdf_document = new PdfDocument(writer);
            Document document = new Document(pdf_document);

            String location = "decoration.png";
            Resource resource = new ClassPathResource("images/" +location);
            //Files.readAllBytes(resource.getFile().toPath()
            byte[] byte_data = FileCopyUtils.copyToByteArray(resource.getInputStream());
            ImageData image_data = ImageDataFactory.create(byte_data);
            Image image = new Image(image_data);

            float watermark_x = (pdf_document.getDefaultPageSize().getWidth() - 200)/2;
            float watermark_y = (pdf_document.getDefaultPageSize().getHeight() - 200)/2;

            image.scaleToFit(200,200);
            image.setOpacity(0.1f);
            image.setFixedPosition(watermark_x,watermark_y);
            document.add(image);

            document.add(new Paragraph(InvoicePlainFormat.header()));
            document.add(new Paragraph(InvoicePlainFormat.dots()));
            document.add(new Paragraph(InvoicePlainFormat.payment_information()));
            document.add(new Paragraph(InvoicePlainFormat.dots()));
            document.add(new Paragraph(InvoicePlainFormat.terms_information()));
            document.flush();
            document.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*

            //this part is direct convert without pdf writer
            //HtmlConverter.convertToPdf(request.getInputStream(),output_stream);

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

 ***********

        Context context = new Context();
        context.setVariable("name", model.getAttribute("pdflink"));

        TemplateEngine engine = new SpringTemplateEngine();
        // Render HTML as a String
        String htmlContent = engine.process("template.html",context);

        byte[] pdfBytes = PdfService.generatePdf(htmlContent);

        // Set response properties
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=generated.pdf");
        response.setContentLength(pdfBytes.length);

        try {
            response.getOutputStream().write(pdfBytes);
            response.getOutputStream().flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    */
}
