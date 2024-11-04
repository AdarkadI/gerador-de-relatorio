package br.uniara.gerador_de_relatorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;


@SpringBootApplication
@EnableJdbcRepositories
public class GeradorDeRelatorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeradorDeRelatorioApplication.class, args);
	}
	//https://www.baeldung.com/spring-boot-access-h2-database-multiple-apps

}
