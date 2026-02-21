<h1> 🏨 Sistema de Pensionato - Java </h1>
<p> Este projeto é uma aplicação de console desenvolvida em Java para gerenciar a locação de quartos em um pensionato. O desafio principal foi aplicar conceitos de Vetores de Objetos e Composição entre Classes. </p>
<h1> 🎯 Objetivo do Desafio </h1>
<p> O sistema deve registrar o aluguel de até 10 quartos (identificados de 0 a 9). O usuário informa a quantidade de estudantes, seus respectivos nomes, e-mails e o número do quarto escolhido. Ao final, o sistema deve gerar um relatório de ocupação ordenado por número de quarto. </p>

<h2>📌 Versões e Evolução</h2>
<h3>Versão 1.0 - Vetor : </h3>
<ul>
    <li>
        Estrutura de Armazenamento: Uso de Arrays estáticos com tamanho fixo (10 posições).
    </li>
     <li>
        Modelagem de Dados: Relação de Composição entre as classes Rooms e Rents
    </li>
    <li>
        Lógica de Acesso: Vinculação direta entre o número do quarto e o índice do vetor.
    </li>
    <li>
        Fluxo de Execução: Processamento linear (Entrada -> Processamento -> Saída -> Encerramento).
    </li>
     <li>
        Validação de Entrada: Uso de do-while para impedir quantidades negativas e quartos ocupados.
    </li>
      <li>
        Gestão de Memória: Filtro manual de referências nulas (null check) para exibição do relatório.
    </li>
</ul>
<h3>Versão 2.0 - Sistema Modularizado e Persistente</h3>
<ul>
    <li>
        Arquitetura de Software: Migração para o modelo Multicamadas (Separação de responsabilidades em classes distintas).
    </li>
     <li>
        Estrutura de Armazenamento: Uso de ArrayList dinâmica, permitindo flexibilidade no tamanho do hotel (30 quartos).
    </li>
    <li>
        Interface de Usuário: Implementação de Menu Interativo Persistente com laço de repetição global.
    </li>
    <li>
        Modularização (CRUD): Criação de Métodos Estáticos Especializados
    </li>
     <li>
        Comunicação entre Métodos: Uso de Passagem por Referência, enviando a lista como parâmetro para manipulação externa.
    </li>
      <li>
        Validação Defensiva: Proteção contra índices inexistentes (IndexOutOfBounds) e lógica de repetição para erros de entrad
    </li>
</ul>