package suppliers;

import Enums.FlowerColour;
import Enums.FlowerType;
import Flowers.Astrometry;
import Flowers.Mayweed;
import Main.Order;

import java.util.LinkedList;

/**
 * Created by Pankiv on 25.11.2016.
 */
public class MayweedSupplierObserver extends Observer {
    public Order sub;

    public MayweedSupplierObserver(Order sub) {
        this.sub = sub;
    }

    @Override
    public void update(LinkedList flower) {
        System.out.println("We have "+  sub.amount_of(new Mayweed(FlowerColour.BLUE,45,true,55, FlowerType.MAYWEED)) + " of astromeries");
    }
}
