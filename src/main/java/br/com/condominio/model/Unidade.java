package br.com.condominio.model;

import java.util.List;

public class Unidade {
    Integer id;
    String endereco;
    String complemento;
    String condominio;
    String proprietario;
    List<DespesaUnidade> despesas;

    public List<DespesaUnidade> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<DespesaUnidade> despesas) {
        this.despesas = despesas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCondominio() {
        return condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
