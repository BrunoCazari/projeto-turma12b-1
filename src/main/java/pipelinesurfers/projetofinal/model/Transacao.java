package pipelinesurfers.projetofinal.model;

import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "mtb310_transaction")
@Getter @Setter
public class Transacao {
    private int idTransacao;
    private String dataHora;
    private int dispositivo;
    private double  valorSolic;
    private double valorAut;
    private int status;
}
