package tads.eaj.ufrn.loja.service;


import org.springframework.stereotype.Service;
import tads.eaj.ufrn.loja.model.Endereco;
import tads.eaj.ufrn.loja.repository.EnderecoRepositoty;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

	private EnderecoRepositoty repository;

	public EnderecoService(EnderecoRepositoty repository) {
		this.repository = repository;
	}

	public Endereco insert(Endereco e){
		return repository.save(e);
	}

	public Optional<Endereco> findById(Long id){
		return repository.findById(id);
	}

	public Endereco update(Endereco e){
		return repository.save(e);
	}

	public void delete (Endereco e){
		repository.delete(e);
	}

	public Endereco getOne(Long id){
		return repository.getOne(id);
	}

	public List<Endereco> getAll (){
		return repository.findAll();
	}
}
