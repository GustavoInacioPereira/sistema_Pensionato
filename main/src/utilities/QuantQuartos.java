package utilities;
import java.util.Scanner;

public class QuantQuartos {
       
    public static int quantQuartos(int maxQuartosinHotel, Scanner sc) {
            int quantQuartos = 0;
          do {
            System.out.println("Quantos quartos deseja alugar? ");
            quantQuartos = VerifyType.verifyInt(sc);

            if(quantQuartos > maxQuartosinHotel) {
                System.out.printf("Quantidade Acima da disponivel %nDigite quantos quartos deseja alugar:  ");
            }
        } while (quantQuartos > maxQuartosinHotel);

        
        return quantQuartos;
    }
}
