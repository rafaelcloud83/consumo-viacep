package edu.rafael.consumoviacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumoViacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoViacepApplication.class, args);
	}

}
