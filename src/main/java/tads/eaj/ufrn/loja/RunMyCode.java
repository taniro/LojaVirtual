package tads.eaj.ufrn.loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import tads.eaj.ufrn.loja.model.Cliente;
import tads.eaj.ufrn.loja.model.Endereco;
import tads.eaj.ufrn.loja.repository.ClienteRepository;
import tads.eaj.ufrn.loja.repository.EnderecoRepositoty;

@Component
public class RunMyCode implements ApplicationRunner {

	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	EnderecoRepositoty enderecoRepositoty;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Cliente c1 = new Cliente();
		Endereco e1 = new Endereco();

		c1.setNome("Antonio");
		e1.setRua("Parelhas");

		c1.setEndereco(e1);
		e1.setCliente(c1);

		//enderecoRepositoty.save(e1);
		clienteRepository.save(c1);
		c1.setEndereco(null);
		clienteRepository.save(c1);
		//enderecoRepositoty.save(e1);


		/*
		clienteRepository.save(c1);
		c1.setEndereco(null);
		clienteRepository.save(c1);
		 */


		/*
		//Caso 1
		c1.setEndereco(e1);
		e1.setCliente(c1);
		enderecoRepositoty.save(e1);
		 */

		/*
		//Caso 2
		enderecoRepositoty.save(e1);
		c1.setEndereco(e1);
		e1.setCliente(c1);
		clienteRepository.save(c1);
		 */

		/*
		//Caso 3
		enderecoRepositoty.save(e1);
		c1.setEndereco(e1);
		e1.setCliente(c1);
		clienteRepository.save(c1);
		 */

		/*
		//Caso 4
		enderecoRepositoty.save(e1);
		c1.setEndereco(e1);
		e1.setCliente(c1);
		clienteRepository.save(c1);
		 */
	}
}
