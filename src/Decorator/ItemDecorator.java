package Decorator;

import Flowers.Flower;
import Flowers.FlowerBucket;

/**
 * Created by Pankiv on 17.11.2016.
 */
public abstract class ItemDecorator implements Item {
    Item itm;

    public ItemDecorator(Item itm) {
        this.itm = itm;
    }
    public abstract String getDescription();
    public int size(){
        return itm.size();
    }

    public Flower getFlower(int index){
        return itm.getFlower(index);
    }
}
