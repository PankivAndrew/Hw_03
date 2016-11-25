package Decorator;


import Flowers.Flower;

/**
 * Created by Pankiv on 17.11.2016.
 */
public class RibbonDecorator extends ItemDecorator {
    @Override
    public double price() {
        return getPrice();
    }

    public RibbonDecorator(Item itm) {
        super(itm);
    }

    public double getPrice(){
        return 40 + itm.price();
    }

    @Override
    public String getDescription() {
        return "Price with ribbon" + " " + getPrice() + "\n";
    }
    @Override
    public Flower getFlower(Integer index) {
        return itm.getFlower(index);
    }
}
