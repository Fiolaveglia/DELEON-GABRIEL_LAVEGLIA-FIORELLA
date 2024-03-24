package com.backend.consultorioOdintologico;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsultorioOdintologicoApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ConsultorioOdintologicoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ConsultorioOdintologicoApplication.class, args);
		LOGGER.info("Consultorio Odontológico esta corriendo...");
	}

}
