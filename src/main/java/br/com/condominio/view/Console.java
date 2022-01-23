package br.com.condominio.view;

import br.com.condominio.controller.DespesaController;
import br.com.condominio.model.dao.Database;

import java.util.Scanner;

import static br.com.condominio.controller.InquilinoController.*;
import static br.com.condominio.controller.UnidadeController.imprimirUnidades;

public class Console {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        Database.popularListas();
        System.out.println("MENU PRINCIPAL");
        System.out.println("\nSelecione a opção desejada:\n");
        System.out.println("1- Consultar inquilinos");
        System.out.println("2- Consultar unidades");
        System.out.println("3- Consultar despesas das unidades");
        System.out.println("4- Consultar despesa por unidade");
        System.out.println("5- Consultar despesa com fatura vencida");
        System.out.println("0- Sair");

        int opcao = ler.nextInt();
        if (opcao == 1) {
            imprimirInquilinos();
        } else if (opcao == 2) {
            imprimirUnidades();
        } else if (opcao == 3) {
            DespesaController.imprimirDespesas();
        } else if (opcao == 4) {
            DespesaController.imprimirDespesaPorUnidade();
        } else if (opcao == 5) {
            DespesaController.imprimirDespesaComFaturaVencida();
        }
    }


}


