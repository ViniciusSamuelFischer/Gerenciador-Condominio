package br.com.condominio.model;

import java.time.LocalDate;

public class DespesaUnidade {
    Integer id;
    String descricao;
    String tipoDespesa;
    Double valor;
    LocalDate vencimentoFatura;
    String statusPagamento;
    Integer unidadeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getVencimentoFatura() {
        return vencimentoFatura;
    }

    public void setVencimentoFatura(LocalDate vencimentoFatura) {
        this.vencimentoFatura = vencimentoFatura;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Integer getUnidadeId() {
        return unidadeId;
    }

    public void setUnidadeId(Integer unidadeId) {
        this.unidadeId = unidadeId;
    }
}
