package Flowers;

import Enums.FlowerColour;
import Enums.FlowerType;

/**
 * Created by Pankiv on 18.11.2016.
 */
public class FlowerSpec {
    protected FlowerColour colour;
    protected double length;
    protected FlowerType type;

    public FlowerSpec(FlowerColour colour, double length, FlowerType type){
        this.colour = colour;
        this.length = length;
        this.type = type;
    }
    public FlowerType getType(){
        return type;
    }
    public double getLength(){
        return length;
    }
    public FlowerColour getColour(){
        return colour;
    }
}
