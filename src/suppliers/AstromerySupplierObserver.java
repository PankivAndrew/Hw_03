package suppliers;
import Enums.FlowerColour;
import Enums.FlowerType;
import Flowers.Astrometry;
import Main.Order;

import java.util.LinkedList;

/**
 * Created by Pankiv on 21.11.2016.
 */
public class AstromerySupplierObserver extends Observer {
    public Order sub;

    public AstromerySupplierObserver(Order sub) {
        this.sub = sub;
        sub.addObserver(this);
    }

    @Override
    public void update(LinkedList items) {
        System.out.println("We have "+  sub.amount_of(new Astrometry(FlowerColour.BLUE,45,true,55,FlowerType.ASTROMETRY)) + " of astromeries");
    }


}
