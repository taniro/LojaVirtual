package tads.eaj.ufrn.loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import tads.eaj.ufrn.loja.model.Cliente;
import tads.eaj.ufrn.loja.model.Endereco;
import tads.eaj.ufrn.loja.model.Pedido;
import tads.eaj.ufrn.loja.model.Produto;
import tads.eaj.ufrn.loja.repository.ClienteRepository;
import tads.eaj.ufrn.loja.repository.EnderecoRepositoty;
import tads.eaj.ufrn.loja.repository.PedidoRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
@Transactional
public class RunMyCode implements ApplicationRunner {


	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	EnderecoRepositoty enderecoRepositoty;
    @Autowired
    private PedidoRepository pedidoRepository;
	//@Autowired
	//PedidoRepository pedidoRepository;



	@Override
	public void run(ApplicationArguments args) throws Exception {


		Cliente cliente = clienteRepository.getOne(1l);
		System.out.println(cliente);

		/*
		Cliente cliente = new Cliente();
		cliente.setNome("José");

		Endereco endereco = new Endereco();
		endereco.setRua("Rua 1");
		cliente.setEndereco(endereco);

		Pedido pedido1 = new Pedido();
		pedido1.setDataPedido("01/01/2020");
		pedido1.setCliente(cliente);

		Pedido pedido2 = new Pedido();
		pedido2.setDataPedido("01/01/2020");
		pedido2.setCliente(cliente);

		Pedido pedido3 = new Pedido();
		pedido3.setDataPedido("01/01/2020");
		pedido3.setCliente(cliente);

		List<Pedido> pedidos = new ArrayList<>();
		pedidos.add(pedido1);
		pedidos.add(pedido2);
		pedidos.add(pedido3);


		pedidoRepository.save(pedido1);
		pedidoRepository.save(pedido2);
		pedidoRepository.save(pedido3);

		clienteRepository.save(cliente);
		*/

		/*
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro");

		Endereco endereco = new Endereco();
		endereco.setRua("Rua 3");

		cliente.setEndereco(endereco);

		clienteRepository.save(cliente);
		enderecoRepositoty.save(endereco);

		List<Cliente> clientes = clienteRepository.findAll();
		for (Cliente c : clientes){
			System.out.println(c.toString());
		}

		List<Endereco> enderecos = enderecoRepositoty.findAll();
		for (Endereco c : enderecos){
			System.out.println(c.toString());
		}

		 */


		/*
		Cliente c1 = clienteRepository.getOne(1L);
		System.out.println(c1.getNome());

		List<Pedido> pedidos = c1.getPedidos();

		for (Pedido p:pedidos) {
			System.out.println(p.getDataPedido());
			System.out.println(p.getCliente().getNome());
		}

		 */

		/*
		Pedido p1 = new Pedido();
		p1.setDataPedido("data1");

		Pedido p2 = new Pedido();
		p2.setDataPedido("data2");

		Pedido p3 = new Pedido();
		p3.setDataPedido("data3");

		Cliente c1 = new Cliente();
		c1.setNome("teste");
		Endereco e1 = new Endereco();
		e1.setRua("rua de teste");
		c1.setEndereco(e1);

		clienteRepository.save(c1);

		p1.setCliente(c1);
		p2.setCliente(c1);
		p3.setCliente(c1);

		ArrayList<Pedido> pedidos = new ArrayList<>();
		pedidos.add(p1);
		pedidos.add(p2);
		pedidos.add(p3);

		pedidoRepository.save(p1);
		pedidoRepository.save(p2);
		pedidoRepository.save(p3);

		c1.setPedidos(pedidos);

		clienteRepository.save(c1);

		 */



		/*
		Cliente c1 = clienteRepository.getOne(2L);
		System.out.println(c1.getNome());
		System.out.println(c1.getEndereco().getRua());

		 */

		/*
		Endereco e1 = new Endereco();
		e1.setRua("Nova rua");

		Cliente c1 = new Cliente();
		c1.setNome("Teste");

		c1.setEndereco(e1);
		e1.setCliente(c1);

		//enderecoRepositoty.save(e1);
		clienteRepository.save(c1);
		*/


/*
		Cliente c1 = new Cliente();
		Endereco e1 = new Endereco();

		c1.setNome("teste");
		e1.setRua("rua teste");

		c1.setEndereco(e1);
		e1.setCliente(c1);

		//clienteRepository.save(c1);
		enderecoRepositoty.save(e1);

 */

		/*
		Cliente c1 = new Cliente();
		Endereco e1 = new Endereco();

		c1 = clienteRepository.findById(1L).get();

		System.out.println(c1.getNome());
		System.out.println(c1.getEndereco().getRua());

		 */

		//Exemplo slide 1
		//c1.setNome("Taniro");
		//e1.setRua("Natal");

		//e1.setCliente(c1);
		//c1.setEndereco(e1);
		//enderecoRepositoty.save(e1);
		//clienteRepository.save(c1);
		//enderecoRepositoty.save(e1);

		/*
		//Exemplo slide 2
		c1.setNome("Taniro");
		e1.setRua("Natal");

		e1.setCliente(c1);
		c1.setEndereco(e1);

		enderecoRepositoty.save(e1);

		 */



		/*
		//Exemplo slide 3
		c1.setNome("Taniro");
		e1.setRua("Natal");

		e1.setCliente(c1);
		c1.setEndereco(e1);

		clienteRepository.save(c1);/*


		/*
		//Exemplo slide 4
		c1.setNome("Taniro");
		e1.setRua("Natal");

		e1.setCliente(c1);
		c1.setEndereco(e1);

		enderecoRepositoty.save(e1);
		clienteRepository.save(c1);
		 */

		/*
		//Exemplo slide 5
		c1.setNome("Taniro");
		e1.setRua("Natal");

		e1.setCliente(c1);
		c1.setEndereco(e1);

		enderecoRepositoty.save(e1);
		clienteRepository.save(c1);

		clienteRepository.delete(c1);
		*/


		/*
		//Exemplo slide 3 Após cascade
		c1.setNome("Taniro");
		e1.setRua("Natal");

		e1.setCliente(c1);
		c1.setEndereco(e1);

		clienteRepository.save(c1);
		 */

		/*
		//Exemplo problema de integridade
		c1.setNome("Taniro");
		e1.setRua("Natal");

		e1.setCliente(c1);
		c1.setEndereco(e1);

		clienteRepository.save(c1);
		clienteRepository.delete(c1);
		 */

		/*
		//Exemplo problema de integridade
		c1.setNome("Taniro");
		e1.setRua("Natal");

		e1.setCliente(c1);
		c1.setEndereco(e1);

		clienteRepository.save(c1);
		enderecoRepositoty.delete(e1);
		 */


		/*
		//Exemplo problema de integridade
		c1.setNome("Taniro");
		e1.setRua("Natal");

		e1.setCliente(c1);
		c1.setEndereco(e1);

		clienteRepository.save(c1);
		c1.setEndereco(null);
		clienteRepository.save(c1);

		 */

		/*c1.setNome("Taniro");
		e1.setRua("Natal");

		c1.setEndereco(e1);
		e1.setCliente(c1);

		clienteRepository.save(c1);
		c1.setEndereco(null);
		clienteRepository.save(c1);*/



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



		/*
		//Cliente e Pedidos
		Cliente c1 = new Cliente();
		c1.setNome("João");
		Endereco e1 = new Endereco();
		e1.setRua("Lagoa");
		c1.setEndereco(e1);
		e1.setCliente(c1);

		Pedido p1 = new Pedido();
		Pedido p2 = new Pedido();
		Pedido p3 = new Pedido();

		p1.setDataPedido("pedido1");
		p2.setDataPedido("pedido2");
		p3.setDataPedido("pedido3");

		List<Pedido> pedidos = new ArrayList<>();
		pedidos.add(p1);
		pedidos.add(p2);
		pedidos.add(p3);

		c1.setPedidos(pedidos);

		clienteRepository.save(c1);

		p1.setCliente(c1);
		p2.setCliente(c1);
		p3.setCliente(c1);


		clienteRepository.save(c1);
		*/
		//pedidoRepository.save(p2);
		//pedidoRepository.save(p3);


		//c1.setPedidos(pedidos);



		/*
		//fetch tests
		Cliente c1 = clienteRepository.getOne((long) 1);
		System.out.println(c1.getNome());
		System.out.println(c1.getEndereco().getRua());
		System.out.println(c1.getPedidos().get(1).toString());

		 */


	/*
		//Many to Many
		Cliente c1 = new Cliente();
		c1.setNome("pedro");

		Endereco e1 = new Endereco();
		e1.setRua("jundiai");

		c1.setEndereco(e1);
		e1.setCliente(c1);

		Pedido o = new Pedido();
		o.setDataPedido("hoje");

		List<Pedido> pedidoList = new ArrayList<>();
		pedidoList.add(o);

		o.setCliente(c1);
		c1.setPedidos(pedidoList);

		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();

		p1.setDescricao("produto 1");
		p2.setDescricao("produto 2");
		p3.setDescricao("produto 3");

		p1.setPedidos(pedidoList);
		p2.setPedidos(pedidoList);
		p3.setPedidos(pedidoList);

		List<Produto> produtoList = new ArrayList<>();
		produtoList.add(p1);
		produtoList.add(p2);
		produtoList.add(p3);

		o.setProdutos(produtoList);

		clienteRepository.save(c1);

	 */

	}
}
