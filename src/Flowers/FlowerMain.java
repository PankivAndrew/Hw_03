package Flowers;


import Enums.FlowerColour;
import Enums.FlowerType;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        Flower mayweed = new Flower(FlowerColour.GREEN, 12, true, 12.5, FlowerType.MAYWEED);
        Flower astrometry = new Flower(FlowerColour.GREEN, 12, true, 12.5, FlowerType.ASTROMETRY);

        Flower findFlower = new Flower(FlowerColour.GREEN, 12, true, 0, FlowerType.MAYWEED);

        bucket.addFlower(mayweed);
        bucket.addFlower(astrometry);

        System.out.println(bucket.getFlower("poppy"));
        System.out.println(bucket.searchFlower(findFlower));

    }
}
