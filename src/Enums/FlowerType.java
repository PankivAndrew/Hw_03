package Enums;

/**
 * Created by Pankiv on 18.11.2016.
 */
public enum FlowerType {
    ASTROMETRY, MAYWEED, CHRYSANTHEMUM;
    public String toString(){
        switch (this){
            case ASTROMETRY:
                return "ASTROMETRY";
            case MAYWEED:
                return "MAYWEED";
            case CHRYSANTHEMUM:
                return "CHRYSANTHEMUM";
            default:
                return "no type";
        }
    }
}