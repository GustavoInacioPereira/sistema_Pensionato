package application;

import entities.Rents;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Rents> room = new ArrayList<>();
        int maxQuartosinHotel = 30;
        int escolhaOpcao;

        for (int i = 0; i < maxQuartosinHotel; i++) {
            room.add(null);
        }
        int quantQuartos = QuantQuartos.quantQuartos(maxQuartosinHotel, sc);
        

        for (int i = 0; i < quantQuartos; i++) {
            RentRoom.alugaQuarto(sc, room);
        }

        System.out.println("Quartos Alugados com sucesso!!");
        do {
            escolhaOpcao = Option.viewOption(sc);
            
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
        } while(escolhaOpcao != 4);
     
    }

}
