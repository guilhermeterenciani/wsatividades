package br.edu.ifms.atividades.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.atividades.model.Atividade;
import br.edu.ifms.atividades.repository.RepositoryAtividade;

import java.util.List;

@RestController
@RequestMapping(path="/")
public class ControllerAtividade {
	
	@Autowired
	private RepositoryAtividade repositoryAtividade;
	
	@GetMapping(path="/atividades")
	public List<Atividade> buscarTodasAtividades(){
		return repositoryAtividade.findAll();
	}
	
	@PostMapping("/atividades")
	public Atividade novaAtividade(@RequestBody Atividade novaAtividade) {
		return repositoryAtividade.save(novaAtividade);
	}
	
	
}
