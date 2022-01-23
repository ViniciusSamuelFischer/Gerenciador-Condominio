# Gerenciador de Condominio

**INTRODUÇÃO**

Esse sistema auxilia no cadastro e gestão dos inquilinos e unidades de um condomínio.

**TECNOLOGIAS UTILIZADAS**

A linguagem de programação utilizada foi Java.

Eu modelei o banco de dados utilizando PostgreSQL, abaixo mais informações.
Infelizmente não consegui implementar a tempo a conexão do sistema com o banco de dados.
Implementei o que eu consegui estudando Java nessas duas semanas, onde tive o meu primeiro contato com programação.

As classes do sistema estão distribuídas em pastas que atendem ao padrão MVC (model,view,controller).

A criação das entidades no sistema foi feita com base no padrão de orientação a objetos.

Todos os métodos foram documentados.

**MODELAGEM DO BANCO DE DADOS**

*PESSOA*
<br>id Integer
<br>nome String
<br>idade Integer
<br>sexo String
<br>telefone String
<br>email String

*CONDOMINIO*
<br>id Integer
<br>nome String
<br>endereco String
<br>proprietario_id Pessoa

*UNIDADE*
<br>id Integer
<br>identificacao String
<br>condominio_id Condominio
<br>inquilino_id Pessoa

*DESPESAS_UNIDADE*
<br>id Integer
<br>unidade_id Unidade
<br>descricao String
<br>tipo_despesa String
<br>valor Double
<br>vencimento_fatura Date
<br>status_pagamento String

**COMO EXECUTAR O SISTEMA**

O sistema pode ser executado utilizando a IDE IntelliJ.
<br>Precisa ter instalado o Maven e Java, incluindo configurações de variáveis de ambiente.

Após abrir o sistema com o IntelliJ, localizar a classe Console e executá-la.

Obs.: a classe se encontra em src>main>java>br.com.condominio>view>Console.java



