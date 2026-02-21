package entities;

public class Rents {
    private String name, email;

    public Rents(String name, String email) {
        this.name = name;
        this.email = email;
    }

     public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
