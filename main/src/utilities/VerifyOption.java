package utilities;


import java.util.List;
import java.util.Scanner;

import entities.Rents;


public class VerifyOption {
    public static int verify (Scanner sc, int primeiroParametro, int segundoParametro) {
        int option = VerifyType.verifyInt(sc);
        do {
            if(option < primeiroParametro || option > segundoParametro) {
                System.out.printf("Opção Inexistente %n Digite a Opção: %n");
                option = VerifyType.verifyInt(sc);
            }
        } while (option < primeiroParametro || option > segundoParametro);
        return option;
    }

    public static int verifyRent (Scanner sc, int primeiroParametro, int segundoParametro) {
        int option = VerifyType.verifyInt(sc);
        do {
            if(option < primeiroParametro || option > segundoParametro) {
                System.out.printf("Quarto Invalido %nDigite outro Quarto:");
                option = VerifyType.verifyInt(sc);
            }
            return option;
        } while (option < primeiroParametro || option > segundoParametro);
    }

    public static int verifyRoom (Scanner sc, List<Rents> room) {
        int quarto = VerifyType.verifyInt(sc);
        while (true) {          
            if (quarto < 0 || quarto >= room.size()) {
                System.out.printf("Quarto Inexistente! O hotel só vai até %d.%nDigite outro quarto: ", room.size() - 1);
                quarto = VerifyType.verifyInt(sc);
            }
            else if (room.get(quarto) != null) {
                System.out.printf("Quarto ja reservado %nDigite outro quarto: ");
                quarto = VerifyType.verifyInt(sc);
            } else {
                return quarto;
            }
        }
        
    }
}
