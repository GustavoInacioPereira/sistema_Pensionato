package application;
import entities.Rents;
import java.util.List;

public class ViewReserve {
    public static void viewReserve (List<Rents> room) {
        for (int i = 0; i < room.size(); i++) {
            if (room.get(i) != null) {
                System.out.printf("Quarto %d alugado por: %s , Email: %s%n", i, room.get(i).getName(),
                room.get(i).getEmail());
            }
        }
    }
}
