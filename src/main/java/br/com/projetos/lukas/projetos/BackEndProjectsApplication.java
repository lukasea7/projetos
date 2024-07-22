package br.com.projetos.lukas.projetos;

import br.com.projetos.lukas.projetos.model.DadosSerie;
import br.com.projetos.lukas.projetos.service.ConsumoApi;
import br.com.projetos.lukas.projetos.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackEndProjectsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackEndProjectsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=79991ecc");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
