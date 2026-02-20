import java.util.Scanner;
import entities.Rents;
import entities.Rooms;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Rooms[] rooms = new Rooms[10];
        int quantQuartos = 0;

        do {
            System.out.println("Quantos quartos deseja Alugar? ");
            quantQuartos = sc.nextInt();
            if (quantQuartos < 0) {
                System.out.println("Quantidade Minima Atingida ");
            }
        } while (quantQuartos < 0);

        

        for (int i = 0; i < quantQuartos; i++) {
            sc.nextLine(); // Consumir a quebra de linha
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Numero do Quarto");
            int numRoom = sc.nextInt();
            if (rooms[numRoom] != null) {
                do {
                    System.out.printf("Quarto ja reservado %nDigite outro quarto: ");
                    numRoom = sc.nextInt();
                } while (rooms[numRoom] != null);
            } 

                Rents rents = new Rents(name, email);
                rooms[numRoom] = new Rooms(rents);
                
        }

            

        
        System.out.println("Quartos alugados: ");
        for (int i = 0; i < rooms.length; i++) {  
            if(rooms[i] != null) {
                System.out.println(i + " " + rooms[i].getRent().getName() + " " + rooms[i].getRent().getEmail());
            }
        }
        sc.close();
    }
}