package application;

import entities.Rents;
import services.RentRoom;
import services.SetQuanRoomInHotel;
import views.ViewOption;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Rents> room = new ArrayList<>();
        int quantQuartos = SetQuanRoomInHotel.set(room, sc);
        RentRoom.alugaQuarto(sc, room, quantQuartos);  
        ViewOption.viewOption(sc, room);
    }

}
