package pipelinesurfers.projetofinal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pipelinesurfers.projetofinal.dto.ContagemStatus;
import pipelinesurfers.projetofinal.model.Transacao;

public interface TransacaoDAO extends CrudRepository<Transacao, Integer>{
    public Transacao findByStatus(int status);

    @Query("SELECT new pipelinesurfers.projetofinal.dto.ContagemStatus(t.agente.nomeAgente, t.status, COUNT(t.status)) FROM Transacao AS t WHERE t.agente.idAgente = ?1 GROUP BY t.agente.nomeAgente, t.status ORDER By t.status")
    List<ContagemStatus> countStatusByAgent(int idAgente);

    @Query(value="Select id_agente, nome_agente, volume_transacional from mtb310_ag_financeiro where id_agente = :cod", nativeQuery = true)
    public Object buscarAgFinanceirosPorId(@Param("cod") Integer codigo);
}
