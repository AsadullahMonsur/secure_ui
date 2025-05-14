package org.reservior.secure_ui.model.invoice;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class InvoicePlainFormat {
    private static long pay_slip_no = 100;

    public static void setPay_slip_no(long pay_slip_no) {
        InvoicePlainFormat.pay_slip_no = pay_slip_no;
    }

    public static String dots(){
        String line = "------------------------------------------------------------";

        return line;
    }

    public static String header(){
        String line = "In the Name of Allah, the Entirely Merciful, the Especially Merciful";

        return line;
    }

    public static String footer(){
        String line = "Company Info at @Team Olivight";
        return line;
    }

    public static String payment_information(){
        String line = "Payment Invoice";
        line = line + "\n Payment Slip No:  #"+ (++pay_slip_no);

        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
        String formatted_date = now.format(formatter);

        line = line + "\n Date & Time : "+ formatted_date;

        return line;
    }

    public static void customer_information(){

    }

    public static String terms_information(){
        String line = "Important Terms & Conditions";

        line = line + "\n * Once payment is done, products won’t be taken back. " +
                      "Therefore, please check the products and " +
                      "read descriptions before payment.";

        line = line + "\n * If any inconsistency or error calculation found," +
                      " immediately contact sales manager or cashier," +
                      " they will handle it.";

        return line;
    }

    public static void approval_information(){

    }

    public static void main_products_information(){

    }
}
