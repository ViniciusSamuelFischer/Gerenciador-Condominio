package br.com.estudos.model.dao;

import br.com.estudos.model.DespesaUnidade;
import br.com.estudos.model.Inquilino;
import br.com.estudos.model.Unidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Inquilino> inquilinos = new ArrayList<>();
    public static List<Unidade> unidades = new ArrayList<>();
    public static List<DespesaUnidade> despesasUnidades = new ArrayList<>();

    public static void popularListas() {
        //Populando inquilinos
        Inquilino inquilino1 = new Inquilino();
        inquilino1.setNome("Vinícius");
        inquilino1.setIdade(25);
        inquilino1.setSexo("Masculino");
        inquilino1.setTelefone("4733330839");
        inquilino1.setEmail("vinicius@gmail.com");
        inquilino1.setId(1);
        inquilino1.setUnidades(new ArrayList<>());

        Inquilino inquilino2 = new Inquilino();
        inquilino2.setNome("Samuel");
        inquilino2.setIdade(26);
        inquilino2.setSexo("Masculino");
        inquilino2.setTelefone("4733338039");
        inquilino2.setEmail("samuel@gmail.com");
        inquilino2.setId(2);
        inquilino2.setUnidades(new ArrayList<>());

        inquilinos.add(inquilino1);
        inquilinos.add(inquilino2);

        //Populando unidades
        Unidade unidade1 = new Unidade();
        unidade1.setId(5);
        unidade1.setEndereco("Rua Dr Blumenau, 2992, Encano");
        unidade1.setComplemento("Ap 1");
        unidade1.setCondominio("Raiz");
        unidade1.setProprietario("Matheus");
        unidade1.setDespesas(new ArrayList<>());

        Unidade unidade2 = new Unidade();
        unidade2.setId(6);
        unidade2.setEndereco("Rua Dr Timbó, 3993, Industrial");
        unidade2.setComplemento("Ap 1");
        unidade2.setCondominio("Tronco");
        unidade2.setProprietario("Ricardo");
        unidade2.setDespesas(new ArrayList<>());

        unidades.add(unidade1);
        unidades.add(unidade2);

        inquilino1.getUnidades().add(unidade1);
        inquilino2.getUnidades().add(unidade2);

        //Populando despesas das unidades
        DespesaUnidade despesa1 = new DespesaUnidade();
        despesa1.setId(7);
        despesa1.setDescricao("Janeiro");
        despesa1.setTipoDespesa("Água");
        despesa1.setValor(60D);
        despesa1.setVencimentoFatura(LocalDate.of(2022,1,23));
        despesa1.setStatusPagamento("Vencida");
        despesa1.setUnidadeId(5);

        DespesaUnidade despesa2 = new DespesaUnidade();
        despesa2.setId(7);
        despesa2.setDescricao("Fevereiro");
        despesa2.setTipoDespesa("Telefone");
        despesa2.setValor(90D);
        despesa2.setVencimentoFatura(LocalDate.of(2022,2,24));
        despesa2.setStatusPagamento("Pago");
        despesa2.setUnidadeId(6);

        despesasUnidades.add(despesa1);
        despesasUnidades.add(despesa2);

        unidade1.getDespesas().add(despesa1);
        unidade2.getDespesas().add(despesa2);
    }
}
