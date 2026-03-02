package views;

import java.util.List;
import java.util.Scanner;

import entities.Rents;
import services.RemoveRent;
import services.RentRoom;
import utilities.VerifyOption;

public class ViewOption {

    public static void viewOption(Scanner sc, List<Rents> room) {

        int escolhaOpcao = 0;
        do {
            System.out.printf(
                    "Opções disponiveis: %n1 - Ver Todas as reservas %n2 - Adicionar mais reservas %n3- Excluir uma reserva%n4 - Sair%n");
            escolhaOpcao = VerifyOption.verify(sc, 0, 4);


            switch (escolhaOpcao) {
                case 1:
                    ViewReserve.viewReserve(room);
                    break;
                case 2:
                    RentRoom.alugaQuarto(sc, room, 1);
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
