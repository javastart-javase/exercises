package main.pl.pawtel.cabrio;

public class CabioApp {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("Volvo", "v40");
        cabrio.setRoofOpen(false);
        cabrio.setMoving(false);
        cabrio.roofOpener();
    }
}
