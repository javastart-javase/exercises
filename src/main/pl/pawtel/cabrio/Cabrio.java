package main.pl.pawtel.cabrio;

public class Cabrio {

    private String brand;
    private String manufacturer;
    private boolean isMoving;
    private boolean isRoofOpen;

    public Cabrio(String brand, String manufacturer) {
        this.brand = brand;
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        isRoofOpen = roofOpen;
    }

    public void roofOpener() {
        if (isMoving == true) {
            System.out.println("Car is moving: you can't open/close roof");
        } else
            System.out.println("Openin/closing roof");
        {
            if (isRoofOpen == true) {
                isRoofOpen = false;
            } else
                isRoofOpen = true;
        }
    }
}
