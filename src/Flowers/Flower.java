package Flowers;

import Enums.FlowerColour;
import Enums.FlowerType;

/**
 * Created by matt on 10/3/16.
 */
public class Flower {


    protected FlowerColour color;
    protected double length;
    protected boolean fresh;
    protected double price;
    protected FlowerType type;

    public Flower(FlowerColour color, double length, boolean fresh, double price, FlowerType type) {
        this.color = color;
        this.length = length;
        this.fresh = fresh;
        this.price = price;
        this.type = type;
    }

    public FlowerType getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public double getLength() {
        return length;
    }
    public FlowerColour getColor() {
        return color;
    }
    public boolean isFresh() {
        return fresh;
    }


    public String toString() {
        return "Type: " + getType() + " price is " + String.valueOf(getPrice()) + " its color is " + getColor() + " fresh leve is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLength());
    }


}
