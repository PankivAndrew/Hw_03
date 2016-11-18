package Decorator;

/**
 * Created by Pankiv on 17.11.2016.
 */
public class BasketDecorator extends ItemDecorator{
    @Override
    public double price() {
        return getPrice();
    }

    public BasketDecorator(Item itm) {
        super(itm);
    }
    public double getPrice(){
        return 4 + itm.price();
    }

    @Override
    public String getDescription() {
        return "Price with basket" + " " + getPrice();
    }
}
