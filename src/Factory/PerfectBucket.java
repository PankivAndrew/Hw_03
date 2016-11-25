package Factory;
import Flowers.*;
import Enums.*;

/**
 * Created by Pankiv on 21.11.2016.
 */
public class PerfectBucket extends FlowerBucket {
    public  PerfectBucket(){
        Flower astrometry = new Astrometry(FlowerColour.RED, 30,true, 20.0,FlowerType.ASTROMETRY );
        Flower mayweed = new Mayweed(FlowerColour.RED,25,true,15.50,FlowerType.MAYWEED);
        addFlower(astrometry);
        addFlower(astrometry);
        addFlower(astrometry);
        addFlower(astrometry);
        addFlower(astrometry);
        addFlower(astrometry);
        addFlower(astrometry);
        addFlower(astrometry);
        addFlower(astrometry);
        addFlower(astrometry);
        addFlower(mayweed);
        addFlower(mayweed);
        addFlower(mayweed);
        addFlower(mayweed);

    }
}
