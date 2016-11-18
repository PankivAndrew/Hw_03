package Delivery;

import Decorator.Item;

import java.util.LinkedList;

/**
 * Created by Pankiv on 14.11.2016.
 */
public interface IDelivery {
        void deliver(LinkedList<Item> items);
}
