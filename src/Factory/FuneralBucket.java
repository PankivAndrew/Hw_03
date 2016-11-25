package Factory;
import Enums.FlowerColour;
import Enums.FlowerType;
import Flowers.*;

/**
 * Created by Pankiv on 21.11.2016.
 */
public class FuneralBucket extends FlowerBucket {
    public FuneralBucket() {
        Flower chrysanthemum = new Chrysanthemum(FlowerColour.BLACK,35,true,50, FlowerType.CHRYSANTHEMUM);
        Flower mayweed = new Mayweed(FlowerColour.BLACK,25,true,15.50,FlowerType.MAYWEED);
        addFlower(chrysanthemum);
        addFlower(chrysanthemum);
        addFlower(chrysanthemum);
        addFlower(chrysanthemum);
        addFlower(chrysanthemum);
        addFlower(chrysanthemum);
        addFlower(mayweed);
        addFlower(mayweed);
        addFlower(mayweed);
        addFlower(mayweed);
        addFlower(mayweed);
    }




}
