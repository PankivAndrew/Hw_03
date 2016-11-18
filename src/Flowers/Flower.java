package Flowers;

/**
 * Created by matt on 10/3/16.
 */
public class Flower {


    protected String color;
    protected double length;
    protected boolean fresh;
    protected double price;
    protected String type;

    public Flower(String color, double length, boolean fresh, double price, String type) {
        this.color = color;
        this.length = length;
        this.fresh = fresh;
        this.price = price;
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public double getLength() {
        return length;
    }
    public String getColor() {
        return color;
    }
    public boolean isFresh() {
        return fresh;
    }


    public String toString() {
        return "Type: " + getType() + " price is " + String.valueOf(getPrice()) + " its color is " + getColor() + " fresh leve is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLength());
    }


}
