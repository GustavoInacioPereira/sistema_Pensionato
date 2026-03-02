package application;

import entities.Rents;
import services.RentRoom;
import utilities.QuantQuartos;
import views.ViewOption;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Rents> room = new ArrayList<>();
        int maxQuartosinHotel = 30;


        for (int i = 0; i < maxQuartosinHotel; i++) {
            room.add(null);
        }
        int quantQuartos = QuantQuartos.quantQuartos(maxQuartosinHotel, sc);
        RentRoom.alugaQuarto(sc, room, quantQuartos);  
        ViewOption.viewOption(sc, room);
    }

}
