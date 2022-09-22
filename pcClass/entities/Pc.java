package pcClass.entities;

public class Pc {

    private String brand;
    private String model;
    private int ram;
    private int hd;

    // Constructor
    public Pc(String brand, String model, int ram, int hd) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.hd = hd;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {

    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {

    }
}
