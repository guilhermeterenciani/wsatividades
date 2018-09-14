package br.edu.ifms.atividades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages= {"br.edu.ifms.atividades.Controller"})
public class WsatividadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsatividadesApplication.class, args);
	}
}
