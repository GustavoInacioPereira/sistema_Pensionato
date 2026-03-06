package services;

import java.time.LocalDateTime;

public class VerifyOutOfDate {
    public static boolean isOutOfDate (LocalDateTime dataLocacao) {
        int tempoMaximoEstadia = 3;
        LocalDateTime dataAtual = LocalDateTime.now();
        boolean foraData = false;
        if (dataAtual.isAfter(dataLocacao.plusDays(tempoMaximoEstadia))) {
            foraData = true;
        } else {
            foraData = false;
        }
        return foraData;
    } 
}
