package application;

import java.util.Scanner;

public class Option {


    public static int viewOption(Scanner sc) {
            System.out.printf("Opções disponiveis: %n1 - Ver Todas as reservas %n2 - Adicionar mais reservas %n3- Excluir uma reserva%n4 - Sair%n");
            int escolhaOpcao = sc.nextInt();
            
                while (escolhaOpcao < 0 || escolhaOpcao > 4) {
                    System.out.println("Opção invalida");
                    System.out.printf("Opções disponiveis: %n1 - Ver Todas as reservas %n2 - Adicionar mais reservas %n3- Excluir uma reserva%n4 - Sair%n");
                    escolhaOpcao = sc.nextInt();
                }
           
                return escolhaOpcao;
     }
}
