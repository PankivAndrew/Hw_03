package Decorator;

/**
 * Created by Pankiv on 17.11.2016.
 */
public abstract class ItemDecorator implements Item {
    Item itm;

    public ItemDecorator(Item itm) {
        this.itm = itm;
    }
    public abstract String getDescription();
}
