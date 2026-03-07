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

<details>
    <summary><b>Versão 3.0 - Inteligência Temporal e Regras de Negócio</b></summary>
    <ul>
        <li>Integração da API <code>java.time</code> (<code>LocalDateTime</code>) para registro preciso de momentos de locação.</li>
        <li>Implementação de Regra de Negócio Encapsulada: Criação do método <code>isOutOfDate()</code> dentro da classe <code>Rents</code>.</li>
        <li>Uso de Manipulação de Datas: Aplicação do método <code>plusDays()</code> para definir prazos de estadia dinâmicos.</li>
        <li><b>Delegação de Responsabilidade (Clean Code):</b> A classe <code>App</code> foi totalmente limpa, delegando o controle de fluxo e o menu interativo para a classe <code>Option</code>.</li>
        <li>Evolução da Interface (CLI): Suporte para entrada de datas personalizadas via <code>DateTimeFormatter</code> e alertas de expiração em tempo real.</li>
        <li><b>Conceitos:</b> Manipulação de Datas, Encapsulamento Avançado e Parsing de Strings para Objetos Temporais.</li>
    </ul>
</details>

<details>
    <summary><b>Versão 4.0 - Programação Defensiva e Blindagem de I/O</b></summary>
    <ul>
        <li><b>Sanitização de Entradas (Try/Catch):</b> Isolamento do motor de leitura (<code>Scanner</code>) em uma classe utilitária (<code>VerifyType</code>) para capturar e tratar <code>InputMismatchException</code>, impedindo falhas críticas por erros de digitação.</li>
        <li><b>Arquitetura Modular (Separação de Conceitos):</b> Reestruturação completa do projeto em pacotes especialistas para garantir escalabilidade e manutenção clara:
        <ul>
            <li><code>entities</code>: Modelos de domínio e regras puras do negócio (DNA do sistema).</li>
            <li><code>services</code>: Motores de processos operacionais isolados.</li>
            <li><code>views</code>: Interface de interação e exibição para o usuário final.</li>
            <li><code>utilities</code>: Ferramentas genéricas e reaproveitáveis de validação de dados.</li>
        </ul>
        </li>
        <li><b>Validação Avançada com RegEx:</b> Implementação de Expressões Regulares (<code>Pattern</code> e <code>Matcher</code>) para garantir a integridade absoluta do formato dos e-mails fornecidos.</li>
        <li><b>Prevenção de Falhas Nativas:</b> Construção de "Cercas Lógicas" estritas para bloquear o acesso a índices inexistentes (<code>IndexOutOfBoundsException</code>) antes da consulta à lista dinâmica.</li>
        <li><b>Micro-Loops de Integridade:</b> Refatoração do fluxo de validação (<code>VerifyOption</code>) para impossibilitar a sobrescrita acidental de quartos ocupados, retendo o usuário em um laço infinito até o fornecimento de um dado 100% válido e livre.</li>
        <li><b>Conceitos:</b> Tratamento de Exceções, Expressões Regulares (RegEx), Programação Defensiva, Sanitização de Input e Micro-loops Arquiteturais.</li>
    </ul>
</details>

<details>
    <summary><b>Versão 4.1 - Clean App e Desacoplamento</b></summary>
    <ul>
        <li><b>Bootstrapping Minimalista (Clean App):</b> Refatoração extrema da classe principal <code>App.java</code>, reduzindo-a a apenas 5 linhas de instrução. Ela agora atua exclusivamente como ponto de ignição (Bootstrapping), delegando toda a orquestração do programa para os módulos de <i>Services</i> e <i>Views</i>.</li>
        <li><b>Desacoplamento de Entidades:</b> Extração da lógica de verificação de expiração de datas (<code>VerifyOutOfDate</code>) para fora da Entidade <code>Rents</code>. A entidade voltou a ter responsabilidade única de guardar o estado (dados), enquanto a lógica de tempo limite foi isolada.</li>
        <li><b>Conceitos:</b> Bootstrapping, Desacoplamento de Lógica de Negócio e Single Responsibility Principle (SRP) aplicado a Entidades.</li>
    </ul>
</details>

<details open>
    <summary><b>Versão 4.1.1 - Tratamento de Erro com datas (Atual)</b></summary>
    <ul>
        <li><b>Verificador de Datas:</b> Implementação de um verificador <code>VerifyDateTime</code> como método da <code>VerifyType</code>, Adicionando mais uma camada de proteção ao codigo</li>
    </ul>
</details>

<hr>
<p><b>Conceitos Dominados ao Longo do Projeto:</b> Arrays vs Coleções Dinâmicas, Composição de Objetos, Arquitetura em Camadas (MVC-Like), Expressões Regulares (RegEx), Tratamento de Exceções (Try/Catch), Null Safety e Clean Architecture.</p>