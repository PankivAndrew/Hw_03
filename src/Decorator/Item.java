package Decorator;


import Flowers.Flower;

/**
 * Created by Pankiv on 16.11.2016.
 */
public interface Item {
     String getDescription();
     double price();
     int size();
     Flower getFlower(Integer index);
}
