package br.pucgoias.viagem.entidade;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Entidade de persistência de Viagem
 */
@Entity
@Table(name = "viagem")
public class Viagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idViagem;

    private Timestamp diaPartida;

    private Timestamp diaChegada;

    private String origem;

    private String destino;

    private BigDecimal valor;

    public Integer getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(Integer idViagem) {
        this.idViagem = idViagem;
    }

    public Timestamp getDiaPartida() {
        return diaPartida;
    }

    public void setDiaPartida(Timestamp diaPartida) {
        this.diaPartida = diaPartida;
    }

    public Timestamp getDiaChegada() {
        return diaChegada;
    }

    public void setDiaChegada(Timestamp diaChegada) {
        this.diaChegada = diaChegada;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public BigDecimal getValor() {
        if(valor == null)
            valor = BigDecimal.ZERO;
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
