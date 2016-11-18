package Flowers;


/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        Flower mak = new Flower("green", 12, true, 12.5, "poppy");
        Flower romashka = new Flower("green", 12, true, 12.5, "chamomile");

        Flower findFlower = new Flower("green", 12, true, 0, "Chamomile");

        bucket.addFlower(mak);
        bucket.addFlower(romashka);

        System.out.println(bucket.getFlower("poppy"));
        System.out.println(bucket.searchFlower(findFlower));

    }
}
