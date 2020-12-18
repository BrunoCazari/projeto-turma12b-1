package pipelinesurfers.projetofinal.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pipelinesurfers.projetofinal.model.AgenteFinanceiro;

public interface AgenteDAO extends CrudRepository<AgenteFinanceiro, Integer> {
    public List<AgenteFinanceiro> findTop10ByOrderByVolumeTransacionalDesc();

}