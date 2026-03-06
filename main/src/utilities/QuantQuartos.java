package utilities;
import java.util.Scanner;

public class QuantQuartos {
       
    public static int quantQuartos(int maxQuartosinHotel, Scanner sc) {
            int quantQuartos = 0;
          do {
            System.out.printf("Quantos quartos deseja alugar? %n");
            quantQuartos = VerifyType.verifyInt(sc);

            if(quantQuartos > maxQuartosinHotel) {
                System.out.printf("Quantidade Acima da disponivel %n");
            }
        } while (quantQuartos > maxQuartosinHotel);

        
        return quantQuartos;
    }
}
