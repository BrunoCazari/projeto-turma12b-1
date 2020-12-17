package pipelinesurfers.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import pipelinesurfers.projetofinal.model.AgenteFinanceiro;

public interface AgenteDAO extends CrudRepository<AgenteFinanceiro, Integer> {
    public AgenteFinanceiro findBy(String email);

}