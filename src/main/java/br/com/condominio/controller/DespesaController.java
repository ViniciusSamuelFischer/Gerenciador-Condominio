package br.com.condominio.controller;

import br.com.condominio.model.DespesaUnidade;
import br.com.condominio.model.enums.StatusPagamento;

import java.time.LocalDate;
import java.util.Scanner;

import static br.com.condominio.model.dao.Database.despesasUnidades;

public class DespesaController {
    static Scanner ler = new Scanner(System.in);

    /**
     * Imprime todas as depesas da lista despesasUnidades.
     */
    public static void imprimirDespesas() {
        System.out.println("\nDESPESAS DAS UNIDADES");
        for (DespesaUnidade p : despesasUnidades) {
            imprimirDespesa(p);
        }
    }

    /**
     * Imprime as características da despesa recebida no parametro.
     *
     * @param p DespesaUnidade
     */
    private static void imprimirDespesa(DespesaUnidade p) {
        System.out.println("\nDespesa: " + p.getId());
        System.out.println("Descricão: " + p.getDescricao());
        System.out.println("Tipo de despesa: " + p.getTipoDespesa());
        System.out.println("Valor: " + p.getValor());
        System.out.println("Vencimento da fatura: " + p.getVencimentoFatura().toString());
        System.out.println("Status do pagamento: " + p.getStatusPagamento());
        System.out.println("Unidade id: " + p.getUnidadeId());
    }

    /**
     * Pergunta ao usuário o id da unidade a qual deseja visualizar suas respectivas despesas.
     * Caso não encontre nenhuma despesa para a unidade, informa ao usuário e pergunta novamente o código da unidade.
     */
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

    /**
     * Imprime as despesas que possuem o status de pagamento igual a "vencida".
     * Caso não existir despesas com a fatura vencida informa ao usuário.
     */
    public static void imprimirDespesaComFaturaVencida() {
        System.out.print("\nDespesas vencidas: \n3");
        boolean despesaEncontrada = false;
        for (DespesaUnidade d : despesasUnidades) {
            if (d.getStatusPagamento().equals(StatusPagamento.VENCIDO)) {
                despesaEncontrada = true;
                imprimirDespesa(d);
            }
        }
        if (!despesaEncontrada) {
            System.out.println("\nNão existem despesas com fatura vencida");
        }
    }

    /**
     * Cadastra uma despesa preenchendo as informações: descrição, tipo da despesa, valor, vencimento da fatura,
     * número da opção para status do pagamento e código da unidade.
     */
    public static void cadastrarDespesa() {
        System.out.println("\nINICIANDO CADASTRO DE DESPESA");
        System.out.println("Preencha as informações.");

        DespesaUnidade despesa = new DespesaUnidade();

        perguntarDescricao(despesa);

        perguntarTipoDespesa(despesa);

        perguntarValor(despesa);

        perguntarVencimentoFatura(despesa);

        perguntarStatusPagamento(despesa);

        perguntarIdUnidade(despesa);

        despesa.setId(despesasUnidades.size() + 1);
        despesasUnidades.add(despesa);

        System.out.println("\nDespesa salva com sucesso!");
    }

    private static void perguntarIdUnidade(DespesaUnidade despesa) {
        System.out.print("\nCódigo da unidade: ");
        despesa.setUnidadeId(ler.nextInt());
    }

    private static void perguntarStatusPagamento(DespesaUnidade despesa) {
        System.out.println("\nDigite um número da opção para status do pagamento: ");
        System.out.println("1- Pendente");
        System.out.println("2- Pago");
        System.out.println("3- Vencido");
        System.out.print("\nOpção: ");
        int opcao = ler.nextInt();

        if (opcao == 1) {
            despesa.setStatusPagamento(StatusPagamento.PENDENTE);
        } else if (opcao == 2) {
            despesa.setStatusPagamento(StatusPagamento.PAGO);
        } else {
            despesa.setStatusPagamento(StatusPagamento.VENCIDO);
        }
    }

    private static void perguntarVencimentoFatura(DespesaUnidade despesa) {
        System.out.println("\nVencimento da fatura: ");
        System.out.print("Dia: ");
        int dia = ler.nextInt();
        System.out.print("Mês: ");
        int mes = ler.nextInt();
        System.out.print("Ano: ");
        int ano = ler.nextInt();

        despesa.setVencimentoFatura(LocalDate.of(ano, mes, dia));
    }

    private static void perguntarValor(DespesaUnidade despesa) {
        System.out.print("\nValor: ");
        despesa.setValor(ler.nextDouble());
    }

    private static void perguntarTipoDespesa(DespesaUnidade despesa) {
        System.out.print("\nTipo da despesa: ");
        ler = new Scanner(System.in);
        despesa.setTipoDespesa(ler.nextLine());
    }

    private static void perguntarDescricao(DespesaUnidade despesa) {
        System.out.print("\nDescrição: ");
        ler = new Scanner(System.in);
        despesa.setDescricao(ler.nextLine());
    }

    public static void editarDespesa() {
        System.out.println("\nEDIÇÃO DE DESPESA");

        System.out.print("\nDigite o id da despesa a ser editada: ");
        int idDespesa = ler.nextInt();
        DespesaUnidade despesa = new DespesaUnidade();
        for (DespesaUnidade d : despesasUnidades) {
            if (d.getId().equals(idDespesa)) {
                despesa = d;
                despesasUnidades.remove(d);
            } else {
                System.out.println("\nDespesa não encontrada.");
                return;
            }
        }

        System.out.println("\nDigite o número que corresponde a característica que deseja alterar: ");
        System.out.println("1- Descrição");
        System.out.println("2- Tipo de despesa");
        System.out.println("3- Valor");
        System.out.println("4- Vencimento da fatura");
        System.out.println("5- Status do pagamento");
        System.out.println("6- Id da unidade");
        System.out.println("7- Voltar ao menu");

        System.out.print("\nOpção: ");

        int opcao = ler.nextInt();
        if (opcao == 1) {
            perguntarDescricao(despesa);
        } else if (opcao == 2) {
            perguntarTipoDespesa(despesa);
        } else if (opcao == 3) {
            perguntarValor(despesa);
        } else if (opcao == 4) {
            perguntarVencimentoFatura(despesa);
        } else if (opcao == 5) {
            perguntarStatusPagamento(despesa);
        } else if (opcao == 6) {
            perguntarIdUnidade(despesa);
        } else {
            System.out.println("\nOpção não encontrada");
            return;
        }

        despesasUnidades.add(despesa);
        System.out.println("\nDespesa alterada.");
    }

}
