<h1> 🏨 Sistema de Pensionato - Java </h1>
<p> Este projeto é uma aplicação de console desenvolvida em Java para gerenciar a locação de quartos em um pensionato. O desafio principal foi aplicar conceitos de Vetores de Objetos e Composição entre Classes. </p>
<h1> 🎯 Objetivo do Desafio </h1>
<p> O sistema deve registrar o aluguel de até 10 quartos (identificados de 0 a 9). O usuário informa a quantidade de estudantes, seus respectivos nomes, e-mails e o número do quarto escolhido. Ao final, o sistema deve gerar um relatório de ocupação ordenado por número de quarto. </p>

<h2>📌 Versões e Evolução</h2>

<details>
    <summary><b>Versão 1.0 - Estrutura de Vetores </b></summary>
    <ul>
        <li>Implementação de entrada de dados via <code>Scanner</code> e armazenamento em Arrays estáticos de tamanho fixo.</li>
        <li>Modelagem de dados baseada em <b>Relação de Composição</b> entre as entidades <code>Rooms</code> e <code>Rents</code>.</li>
        <li>Fluxo de execução linear (Entrada/Processamento/Saída) com vinculação direta entre índice do vetor e ID do quarto.</li>
        <li>Introdução de tratamento de erros com <code>do-while</code> para validar ocupação e evitar índices negativos.</li>
        <li><b>Conceitos:</b> Arrays Estáticos, Composição de Objetos, Null Check e Lógica Linear.</li>
    </ul>
</details>

<details>
    <summary><b>Versão 2.0 - Sistema Modularizado </b></summary>
    <ul>
        <li>Migração para Arquitetura Multicamadas, separando responsabilidades em classes distintas para facilitar a manutenção.</li>
        <li>Evolução para ArrayList dinâmica, permitindo flexibilidade no tamanho do inventário (ex: 30 quartos).</li>
        <li>Implementação de Menu Interativo Persistente com laço <code>do-while</code> global.</li>
        <li>Modularização do CRUD através de Métodos Estáticos Especializados com passagem de lista por referência.</li>
        <li><b>Conceitos:</b> Modularização, Collections (List) e Validação Defensiva de Índices.</li>
    </ul>
</details>

<details open>
    <summary><b>Versão 3.0 - Inteligência Temporal e Regras de Negócio (Atual) :</b></summary>
    <ul>
        <li>Integração da API <code>java.time</code> (<code>LocalDateTime</code>) para registro preciso de momentos de locação.</li>
        <li>Implementação de Regra de Negócio Encapsulada: Criação do método <code>isOutOfDate()</code> dentro da classe <code>Rents</code>.</li>
        <li>Uso de Manipulação de Datas: Aplicação do método <code>plusDays()</code> para definir prazos de estadia dinâmicos.</li>
        <li><b>Delegação de Responsabilidade (Clean Code):</b> A classe <code>App</code> foi totalmente limpa, delegando o controle de fluxo e o menu interativo para a classe <code>Option</code>.</li>
        <li>Evolução da Interface (CLI): Suporte para entrada de datas personalizadas via <code>DateTimeFormatter</code> e alertas de expiração em tempo real.</li>
        <li><b>Conceitos:</b> Manipulação de Datas, Encapsulamento Avançado e Parsing de Strings para Objetos Temporais.</li>
    </ul>
</details>