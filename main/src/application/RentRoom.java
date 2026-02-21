package application;

import entities.Rents;
import java.util.List;

import java.util.Scanner;

public class RentRoom {
    public static void alugaQuarto (Scanner sc, List<Rents> room ) {
        
                    boolean Success = false;
                    sc.nextLine(); // comer a quebra de linha
                    System.out.println("Digite o nome: ");
                    String name = sc.nextLine();
                    System.out.println("Digite o email: ");
                    String email = sc.nextLine();
                    System.out.println("Digite o numero do quarto: ");
                    int quarto = sc.nextInt();
                    do {
                        Success = false; // a cada iteração ele retorna ao valor false para nova verificação
                        if (room.get(quarto) != null) {
                            System.out.printf("Quarto ja reservado %nDigite outro quarto: ");
                            quarto = sc.nextInt();
                        } else {
                            room.set(quarto, new Rents(name, email));
                            Success = true;
                        }
                    } while (Success != true);
        
    }
           
    }
        

 