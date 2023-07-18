package restfull.restfull.repository;

import org.springframework.data.repository.CrudRepository;

import restfull.restfull.entity.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{ }
