package Main;

import Decorator.Item;
import Delivery.IDelivery;
import Enums.FlowerType;
import Flowers.Flower;
import Flowers.FlowerBucket;
import Payment.IPayment;
import suppliers.*;

import java.util.Arrays;
import java.util.LinkedList;


/**
 * Created by Pankiv on 14.11.2016.
 */
public class Order implements Observable{
    LinkedList<Item> items = new LinkedList();
    IPayment payment;
    IDelivery delivery;
    LinkedList<Observer> observers = new LinkedList<>();


    public void setPaymentStrategy(IPayment payment) {
        this.payment = payment;
    }
    public LinkedList<Item> toArray(){
        return items;
    }

    public void setDeliveryStrategy(IDelivery delivery) {
        this.delivery = delivery;
    }
    public void addItem(Item itm){
        items.add(itm);
    }
    public void removeItem(Item itm){
        items.remove(itm);
    }
    public double calculateTotalPrice(){
        Double sum = 0.0;
        for (int i = 0; i < items.size();i++){
            sum += items.get(i).price();
        }
        return sum;
    }
    public void processOrder(){
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
        notifyObserver();

    }
    public LinkedList<Item> return_order(){
        return items;
    }

    @Override
    public void notifyObserver() {
        for(Observer users: observers){
            users.update(return_order());
        }
    }
    public int amount_of(Flower flower) {
        Integer counter = 0;
        for (Item i : items) {
                for (int j = 0; j < i.size(); j++) {
                    if (flower.getClass().equals(i.getFlower(j).getClass())) {
                        counter++;
                    }
                }
        }
        return counter;
    }


    public void removeObserver(Observer a) {
        observers.remove(a);
    }

    public void addObserver(Observer a) {
        observers.add(a);

    }
}
