package ro.helator.einvoicer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "ro.helator")
@SpringBootApplication
public class EinvoicerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EinvoicerApplication.class, args);
	}
}
