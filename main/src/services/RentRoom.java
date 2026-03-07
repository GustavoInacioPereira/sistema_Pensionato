package services;

import entities.Rents;
import utilities.VerifyOption;
import utilities.VerifyType;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class RentRoom {
    public static void alugaQuarto(Scanner sc, List<Rents> room, int quantQuartos) {
        for (int i = 0; i < quantQuartos; i++) {
            LocalDateTime dataLocacao = null;
            System.out.println("Digite o nome: ");
            String name = sc.nextLine();
            System.out.println("Digite o email: ");
            String email = VerifyType.verifyEmail(sc);
            System.out.printf("Digite a Opção: %n1 - Alugado no Dia de Hoje %n2 - Alugado em Outro dia %n");
            int option = VerifyOption.verify(sc, 1, 2);

            switch (option) {
                case 1:
                    dataLocacao = LocalDateTime.now();
                    break;

                case 2:
                    System.out.printf("Data da locacao: (dd/MM/yyyy) hh:mm %n");
                    dataLocacao = VerifyType.verifyDateTime(sc);
                    break;
            }

            System.out.println("Digite o numero do Quarto: ");
            int quarto = VerifyOption.verifyRoom(sc, room);
            room.set(quarto, new Rents(name, email, dataLocacao));

            System.out.println("Quartos Alugados com sucesso!!");

        }
    }

}
