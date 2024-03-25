package com.backend.consultorioOdintologico;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsultorioOdintologicoApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ConsultorioOdintologicoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsultorioOdintologicoApplication.class, args);
		LOGGER.info("ClinicaOdontologica is now running...");
	}


	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}


}
