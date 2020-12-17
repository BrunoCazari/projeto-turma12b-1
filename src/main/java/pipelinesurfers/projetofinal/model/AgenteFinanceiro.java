package pipelinesurfers.projetofinal.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "mtb310_ag_financeiro")
@Getter @Setter
public class AgenteFinanceiro {

    @Id // Indica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment 1,2,3
    @Column(name = "id_agente")
    private int idAgente;

    @Column(name = "nome_agente", length = 100, nullable = false)
    private String nomeAgente;

    @Column(name = "volume_transacional")
    private double volumeTransacional;

}