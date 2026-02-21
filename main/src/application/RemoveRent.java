package application;
import java.util.List;
import java.util.Scanner;
import entities.Rents;

public class RemoveRent {
    public static void removeRent(Scanner sc, List<Rents> room) {
        System.out.println("Digite o numero do quarto alugado para retirar:  ");
        int qRemover = sc.nextInt();
        sc.nextLine(); // LIMPEZA AQUI

        do {
            if(qRemover < 0 || qRemover >= room.size()) {
                System.out.printf("Quarto Invalido %nDigite outro Quarto: ");
                qRemover = sc.nextInt();
            }
        }while (qRemover < 0 || qRemover >= room.size());
        

        if (room.get(qRemover) != null) {
            room.set(qRemover, null); // Voltamos a ser null = quarto livre!
            System.out.println("Reserva removida!");
        } else {
            System.out.println("Este quarto já estava vazio.");
        }
    }
}
