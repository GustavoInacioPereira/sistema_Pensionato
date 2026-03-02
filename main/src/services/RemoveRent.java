package services;
import java.util.List;
import java.util.Scanner;
import entities.Rents;
import utilities.VerifyOption;

public class RemoveRent {
    public static void removeRent(Scanner sc, List<Rents> room) {
        System.out.println("Digite o numero do quarto alugado para retirar:  ");
        int qRemover = VerifyOption.verifyRent(sc, 0, room.size());
    
        if (room.get(qRemover) != null) {
            room.set(qRemover, null); // Voltamos a ser null = quarto livre!
            System.out.println("Reserva removida!");
        } else {
            System.out.println("Este quarto já estava vazio.");
        }
    }
}
