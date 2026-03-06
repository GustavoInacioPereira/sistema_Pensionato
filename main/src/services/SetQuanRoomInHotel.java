package services;

import java.util.List;
import java.util.Scanner;

import entities.Rents;
import utilities.QuantQuartos;

public class SetQuanRoomInHotel {
     public static int set (List<Rents> room, Scanner sc) {
         int maxQuartosinHotel = 30;
        for (int i = 0; i < maxQuartosinHotel; i++) {
            room.add(null);
        }
        int quantQuartos = QuantQuartos.quantQuartos(maxQuartosinHotel, sc);
        return quantQuartos;
     }

     
}
