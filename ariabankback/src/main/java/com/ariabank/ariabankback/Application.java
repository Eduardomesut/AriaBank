package com.ariabank.ariabankback;

import com.ariabank.ariabankback.upload.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner init(StorageService storageService) {
		return args -> {
			// Inicializamos el servicio de ficheros
			storageService.deleteAll();
			storageService.init();

		};

	}

}