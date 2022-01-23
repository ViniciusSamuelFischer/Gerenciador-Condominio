package br.com.condominio.controller;

import br.com.condominio.model.Unidade;

import java.util.Scanner;

import static br.com.condominio.model.dao.Database.unidades;

public class UnidadeController {
    Scanner ler = new Scanner(System.in);

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
}
