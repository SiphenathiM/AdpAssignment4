package za.ac.cput.AdpAssignment4.Inheritance;

public class Pants extends Product{

    private String colour;
    private int waist;

    public Pants(String name, double price,String colour,int waist) {
        super(name, price);
        this.colour =colour;
        this.waist = waist;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    @Override
    public String getType(){
        return "Pants";
    }
}
