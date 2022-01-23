package br.com.condominio.controller;

import br.com.condominio.model.Unidade;

import java.util.Scanner;

import static br.com.condominio.model.dao.Database.unidades;

public class UnidadeController {
   static Scanner ler = new Scanner(System.in);

    /**
     * Imprime todas as unidades da lista unidades.
     */
    public static void imprimirUnidades() {
        System.out.println("\nUNIDADES");
        for (Unidade p : unidades) {
            System.out.println("\nUnidade: " + p.getId());
            System.out.println("Endereço: " + p.getEndereco());
            System.out.println("Complemento: " + p.getComplemento());
            System.out.println("Condomínio: " + p.getCondominio());
            System.out.println("Proprietário: " + p.getProprietario());
        }
    }

    /**
     * Cadastra uma unidade preenchendo as informações: endereço, complemento, condomínio e proprietário.
     */
    public static void cadastrarUnidade() {
        System.out.println("\nINICIANDO CADASTRO DE UNIDADE");
        System.out.println("Preencha as informações.");

        Unidade unidade = new Unidade();

        System.out.print("\nEndereço: ");
        ler = new Scanner(System.in);
        unidade.setEndereco(ler.nextLine());

        System.out.print("\nComplemento: ");
        ler = new Scanner(System.in);
        unidade.setComplemento(ler.nextLine());

        System.out.print("\nCondomínio: ");
        ler = new Scanner(System.in);
        unidade.setCondominio(ler.nextLine());

        System.out.print("\nProprietário: ");
        ler = new Scanner(System.in);
        unidade.setProprietario(ler.nextLine());

        unidade.setId(unidades.size()+1);
        unidades.add(unidade);

        System.out.println("\nUnidade salva com sucesso!");
    }
}
