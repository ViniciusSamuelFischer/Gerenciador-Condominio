package br.com.condominio.view;

import br.com.condominio.controller.DespesaController;
import br.com.condominio.controller.InquilinoController;
import br.com.condominio.controller.UnidadeController;
import br.com.condominio.model.dao.Database;

import java.util.Scanner;

import static br.com.condominio.controller.InquilinoController.*;
import static br.com.condominio.controller.UnidadeController.imprimirUnidades;

public class Console {
    static Scanner ler = new Scanner(System.in);
    public static boolean imprimirMenu = true;

    public static void main(String[] args) {
        Database.popularListas();
        while (imprimirMenu) {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("\nInforme o número que corresponde a opção desejada:\n");
            System.out.println("1- Consultar inquilinos");
            System.out.println("2- Consultar unidades");
            System.out.println("3- Consultar despesas das unidades");
            System.out.println("4- Consultar despesa por unidade");
            System.out.println("5- Consultar despesa com fatura vencida");

            System.out.println("6- Cadastrar inquilino");
            System.out.println("7- Cadastrar unidade");
            System.out.println("8- Cadastrar despesa");
            System.out.println("9- Editar despesa");

            System.out.println("0- Sair");

            System.out.print("\nOpção: ");

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
            } else if (opcao == 6) {
                InquilinoController.cadastrarInquilino();
            } else if (opcao == 7) {
                UnidadeController.cadastrarUnidade();
            } else if (opcao == 8) {
                DespesaController.cadastrarDespesa();
            } else if (opcao == 9) {
                DespesaController.editarDespesa();
            } else if (opcao == 0) {
                imprimirMenu = false;
            } else {
                System.out.println("\nOpção invalida!");
            }
        }
    }
}


