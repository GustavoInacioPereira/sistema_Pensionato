package application;
import entities.Rents;
import java.util.List;

public class ViewReserve {
    public static void viewReserve (List<Rents> room) {
        for (int i = 0; i < room.size(); i++) {
            if (room.get(i) != null) {
                System.out.printf("Quarto %d alugado por: %s , Email: %s, Alugado em: %s%n", i, room.get(i).getName(),
                room.get(i).getEmail(), room.get(i).getDataLocacao());
                boolean foraData = room.get(i).isOutOfDate();
                if(foraData == true) {
                     System.out.printf("!! Locação do Quarto %d Expirada !! %n", i);
                }
            }
        }
    }
}
