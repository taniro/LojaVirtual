package tads.eaj.ufrn.loja.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nome;

	/*
	//Caso 1
	@OneToOne(mappedBy = "cliente", cascade = {CascadeType.ALL})
	Endereco endereco;
	 */

	//Caso 2
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "endereco_id")
	Endereco endereco;

	/*
	//Caso 3
	@OneToOne(mappedBy = "cliente")
	Endereco endereco;
	 */

	/*
	//Caso 4
	@OneToOne
	@JoinColumn(name ="endereco_id")
	Endereco endereco;
	 */


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "cliente")
	List<Pedido> pedidos;
}
