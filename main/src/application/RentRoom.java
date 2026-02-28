package application;

import entities.Rents;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import java.util.Scanner;

public class RentRoom {
    public static void alugaQuarto (Scanner sc, List<Rents> room ) {
        
                    boolean success = false;
                    LocalDateTime dataLocacao = LocalDateTime.now();
                    sc.nextLine(); // comer a quebra de linha
                    System.out.println("Digite o nome: ");
                    String name = sc.nextLine();
                    System.out.println("Digite o email: ");
                    String email = sc.nextLine();
                    System.out.printf("Digite a Opção: %n1 - Alugado no Dia de Hoje %n2 - Alugado em Outro dia %n");
                    int option = sc.nextInt();
                    sc.nextLine();
                    do {
                        if(option < 1 || option > 2) {
                            System.out.printf("Opção Inexistente %n Digite a Opção: %n");
                            option = sc.nextInt();
                            sc.nextLine();
                        }
                    } while (option < 1 || option > 2);
                    
                    switch (option) {
                        case 1:
                            dataLocacao = LocalDateTime.now();
                            break;

                        case 2:
                            System.out.printf("Data da locacao: (dd/MM/yyyy) hh:mm %n");
                            String dataLocacaoPersonalizada = sc.nextLine();
                            dataLocacao = LocalDateTime.parse(dataLocacaoPersonalizada,DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));         
                            break;
                        default:
                            break;
                    }
                    
                    System.out.println("Digite o numero do quarto: ");
                    int quarto = sc.nextInt();
                    do {
                        success = false; // a cada iteração ele retorna ao valor false para nova verificação
                        if (room.get(quarto) != null) {
                            System.out.printf("Quarto ja reservado %nDigite outro quarto: ");
                            quarto = sc.nextInt();
                        } else {
                            room.set(quarto, new Rents(name, email, dataLocacao));
                            success = true;
                        }
                    } while (success != true);
          
        
    }
           
    }
        

 