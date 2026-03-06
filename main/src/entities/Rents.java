package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import services.VerifyOutOfDate;

public class Rents {
    private String name, email;
    private LocalDateTime dataLocacao; 

    public Rents(String name, String email, LocalDateTime datalocacao) {
        this.name = name;
        this.email = email;
        this.dataLocacao = datalocacao;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDataLocacao() {
        return dataLocacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public boolean isOutOfDate () {
        return VerifyOutOfDate.isOutOfDate(dataLocacao);
    }

    
}
