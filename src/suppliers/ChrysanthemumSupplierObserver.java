package suppliers;

import Enums.FlowerColour;
import Enums.FlowerType;
import Flowers.Astrometry;
import Flowers.Chrysanthemum;
import Main.Order;

import java.util.LinkedList;

/**
 * Created by Pankiv on 25.11.2016.
 */
public class ChrysanthemumSupplierObserver extends Observer {
    public Order sub;

    public ChrysanthemumSupplierObserver(Order sub) {
        this.sub = sub;
    }

    @Override
    public void update(LinkedList flower) {
        System.out.println("We have "+  sub.amount_of(new Chrysanthemum(FlowerColour.BLUE,45,true,55, FlowerType.CHRYSANTHEMUM)) + " of astromeries");


    }
}
