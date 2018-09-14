package br.edu.ifms.atividades.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.atividades.model.Atividade;

@Repository
public interface RepositoryAtividade extends JpaRepository<Atividade, Long>{

}
	

