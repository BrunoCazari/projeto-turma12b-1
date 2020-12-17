package pipelinesurfers.projetofinal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pipelinesurfers.projetofinal.model.AgenteFinanceiro;

public interface AgenteDAO extends CrudRepository<AgenteFinanceiro, Integer> {
   /*  public AgenteFinanceiro findByNomeAgenteFinanceiro(String nomeAgente, double volumeTransacional);

    @Query(value = "Select nome_agente,volume_transacional from mtb310_ag_financeiro where id_agente = :cod", nativeQuery = true)
    public Object buscarAgentesPorId(@Param("cod") Integer codigo); */

}