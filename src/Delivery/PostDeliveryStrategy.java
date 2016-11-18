package Delivery;

import Decorator.Item;

import java.util.LinkedList;

/**
 * Created by Pankiv on 18.11.2016.
 */
public class PostDeliveryStrategy implements IDelivery {
    @Override
    public void deliver(LinkedList<Item> items) {
        String str = "";
        for (int i = 0; i < items.size(); i ++){
            str += items.get(i).getDescription();
        }
        System.out.print(str);
    }
}
