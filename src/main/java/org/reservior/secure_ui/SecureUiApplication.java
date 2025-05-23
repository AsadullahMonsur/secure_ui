package org.reservior.secure_ui;

import org.javaEOX.utility.DebugUtility;
import org.reservior.secure_ui.model.invoice.InvoicePlainFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SecureUiApplication {
    // in the Name of Allah
	public static void main(String[] args) {

		DebugUtility.enable_debugging(true);

		SpringApplication.run(SecureUiApplication.class, args);

		System.out.println();
		System.out.println("in the Name of Allah");
		System.out.println();
		System.out.println("application has started: main");

	}
}
