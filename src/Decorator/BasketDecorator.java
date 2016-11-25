package Decorator;

import Flowers.Flower;

/**
 * Created by Pankiv on 17.11.2016.
 */
public class BasketDecorator extends ItemDecorator{
    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public Flower getFlower(Integer index) {
        return itm.getFlower(index);
    }

    public BasketDecorator(Item itm) {
        super(itm);
    }
    public double getPrice(){
        return 4 + itm.price();
    }

    @Override
    public String getDescription() {
        return "Price with basket" + " " + getPrice() + "\n";
    }

}
