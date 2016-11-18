import Decorator.Item;
import Delivery.IDelivery;
import Payment.IPayment;

import java.util.LinkedList;

/**
 * Created by Pankiv on 14.11.2016.
 */
public class Order {
    LinkedList<Item> items = new LinkedList();
    IPayment payment;
    IDelivery delivery;

    public void setPaymentStrategy(IPayment payment) {
        this.payment = payment;
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

    }
}
