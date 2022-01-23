package br.com.estudos.controller;

import br.com.estudos.model.DespesaUnidade;

import java.util.Scanner;

import static br.com.estudos.model.dao.Database.despesasUnidades;

public class DespesaController {
    static Scanner ler = new Scanner(System.in);

    public static void imprimirDespesas() {
        System.out.println("\nDESPESAS DAS UNIDADES");
        for (DespesaUnidade p : despesasUnidades) {
            imprimirDespesa(p);
        }
    }

    private static void imprimirDespesa(DespesaUnidade p) {
        System.out.println("\nDespesa: " + p.getId());
        System.out.println("Descricão: " + p.getDescricao());
        System.out.println("Tipo de despesa: " + p.getTipoDespesa());
        System.out.println("Valor: " + p.getValor());
        System.out.println("Vencimento da fatura: " + p.getVencimentoFatura().toString());
        System.out.println("Status do pagamento: " + p.getStatusPagamento());
        System.out.println("Unidade id: " + p.getUnidadeId());
    }

    public static void imprimirDespesaPorUnidade() {
        System.out.print("\nDigite o código da unidade: ");
        int idUnidade = ler.nextInt();
        boolean despesaEncontrada = false;
        for (DespesaUnidade d : despesasUnidades) {
            if (d.getUnidadeId() == idUnidade) {
                despesaEncontrada = true;
                imprimirDespesa(d);
            }
        }
            if (!despesaEncontrada) {
                System.out.println("\nNão encontrei nenhuma despesa para esta unidade, tente novamente");
                imprimirDespesaPorUnidade();
            }
    }
    public static void imprimirDespesaComFaturaVencida() {
        System.out.print("\nDespesas vencidas: ");
        boolean despesaEncontrada = false;
        for (DespesaUnidade d : despesasUnidades) {
            if (d.getStatusPagamento().equals("Vencida")) {
                despesaEncontrada = true;
                imprimirDespesa(d);
            }
        }
        if (!despesaEncontrada) {
            System.out.println("\nNão existem despesas com fatura vencida");
        }
    }
}
