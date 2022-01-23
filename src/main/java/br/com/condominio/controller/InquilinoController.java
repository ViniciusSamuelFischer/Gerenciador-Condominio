package br.com.condominio.controller;

import br.com.condominio.model.Inquilino;
import br.com.condominio.model.dao.Database;

import java.util.Scanner;

import static br.com.condominio.model.dao.Database.inquilinos;

public class InquilinoController {
    static Scanner ler = new Scanner(System.in);

    /**
     * Imprime todos os inquilinos na lista inquilinos.
     */
    public static void imprimirInquilinos() {
        System.out.println("\nINQUILINOS");

        for (Inquilino p : inquilinos) {
            System.out.println("\nInquilino: " + p.getNome());
            System.out.println("Código: " + p.getId());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Sexo: " + p.getSexo());
            System.out.println("Telefone: " + p.getTelefone());
            System.out.println("Email: " + p.getEmail());
        }
    }

    /**
     * Cadastra um inquilino preenchendo as informações: nome, idade, sexo, telefone e email.
     */
    public static void cadastrarInquilino() {
        System.out.println("\nINICIANDO CADASTRO DE INQUILINO");
        System.out.println("Preencha as informações.");

        Inquilino inquilino = new Inquilino();

        System.out.print("\nNome: ");
        ler = new Scanner(System.in);
        inquilino.setNome(ler.nextLine());

        System.out.print("\nIdade: ");
        inquilino.setIdade(ler.nextInt());

        System.out.print("\nSexo: ");
        ler = new Scanner(System.in);
        inquilino.setSexo(ler.nextLine());

        System.out.print("\nTelefone: ");
        ler = new Scanner(System.in);
        inquilino.setTelefone(ler.nextLine());

        System.out.print("\nEmail: ");
        ler = new Scanner(System.in);
        inquilino.setEmail(ler.nextLine());

        inquilino.setId(inquilinos.size()+1);
        inquilinos.add(inquilino);

        System.out.println("\nInquilino salvo com sucesso!");
    }
}
