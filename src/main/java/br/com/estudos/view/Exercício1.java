package br.com.estudos.view;

public class Exercício1 {
    public static void main(String[] args) {
        Integer idade = 25;
        if (idade < 19) {
            System.out.println("infantil");
        } else if (idade < 56) {
            System.out.println("adulto");
        } else {
            System.out.println("idoso");
        }
        //crie uma variável dinheiro e dê um valor para ela
        //com if else, faça o seguinte:
        //se o dinheiro for menor que 50, imprimir no console "notas de dez"
        //se o dinheiro for menor que 100, imprimir "nota de cem"
        //se não, imprimir "muitas notas de cem"
        Integer dinheiro = 100;
        if (dinheiro < 50) {
            System.out.println("notas de dez");
        } else if (dinheiro < 100) {
            System.out.println("nota de cem");
        } else {
            System.out.println("muitas notas de cem");

        }
    }
}
