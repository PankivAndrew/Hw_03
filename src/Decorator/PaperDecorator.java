package Decorator;

import Flowers.Flower;

/**
 * Created by Pankiv on 17.11.2016.
 */
public class PaperDecorator extends ItemDecorator{
    @Override
    public double price() {
        return getPrice();
    }

    public PaperDecorator(Item itm) {
        super(itm);
    }

    public double getPrice(){
        return (13 + itm.price());
    }
    public String getDescription(){
        return "Price with paper" + " " + getPrice() + "\n";

    }
    @Override
    public Flower getFlower(Integer index) {
        return itm.getFlower(index);
    }
}
