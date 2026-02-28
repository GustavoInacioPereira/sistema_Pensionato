package application;

import java.util.List;
import java.util.Scanner;

import entities.Rents;

public class Option {

    public static void viewOption(Scanner sc, List<Rents> room) {

        int escolhaOpcao = 0;
        do {
            System.out.printf(
                    "Opções disponiveis: %n1 - Ver Todas as reservas %n2 - Adicionar mais reservas %n3- Excluir uma reserva%n4 - Sair%n");
            escolhaOpcao = sc.nextInt();

            while (escolhaOpcao < 0 || escolhaOpcao > 4) {
                System.out.println("Opção invalida");
                System.out.printf(
                        "Opções disponiveis: %n1 - Ver Todas as reservas %n2 - Adicionar mais reservas %n3- Excluir uma reserva%n4 - Sair%n");
                escolhaOpcao = sc.nextInt();
            }

            switch (escolhaOpcao) {
                case 1:
                    ViewReserve.viewReserve(room);
                    break;
                case 2:
                    RentRoom.alugaQuarto(sc, room);
                    break;
                case 3:
                    RemoveRent.removeRent(sc, room);
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (escolhaOpcao != 4);

    }
}
