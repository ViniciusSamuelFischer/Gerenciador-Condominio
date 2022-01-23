package br.com.condominio.controller;

import br.com.condominio.model.Inquilino;

import static br.com.condominio.model.dao.Database.inquilinos;

public class InquilinoController {
    public static void imprimirInquilinos() {
        System.out.println("\nINQUILINOS");
        // para cada pessoa dentro da lista de pessoas
        for (Inquilino p : inquilinos) {
            System.out.println("\nInquilino: " + p.getNome());
            System.out.println("Código: " + p.getId());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Sexo: " + p.getSexo());
            System.out.println("Telefone: " + p.getTelefone());
            System.out.println("Email: " + p.getEmail());
        }
    }
}
