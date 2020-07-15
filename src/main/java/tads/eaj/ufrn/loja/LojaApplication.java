package tads.eaj.ufrn.loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tads.eaj.ufrn.loja.model.Cliente;
import tads.eaj.ufrn.loja.model.Endereco;
import tads.eaj.ufrn.loja.repository.ClienteRepository;

@SpringBootApplication
public class LojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}

}
