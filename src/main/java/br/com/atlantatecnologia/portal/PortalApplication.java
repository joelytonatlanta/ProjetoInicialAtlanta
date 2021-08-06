package br.com.atlantatecnologia.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200")
@ComponentScan(basePackages = "br.com.atlantatecnologia.portal")
public class PortalApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}
}
