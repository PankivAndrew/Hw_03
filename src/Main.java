import Decorator.BasketDecorator;
import Delivery.PostDeliveryStrategy;
import Flowers.Flower;
import Flowers.FlowerBucket;
import Decorator.Item;
import Decorator.PaperDecorator;
import Decorator.RibbonDecorator;
import Payment.IPayment;
import Payment.PayPalPaymentStrategy;

/**
 * Created by Pankiv on 14.11.2016.
 */
public class Main {
    public static void main(String [] args){
        FlowerBucket bucket = new FlowerBucket();

        Item itm = new FlowerBucket();
        Flower mak = new Flower("green", 12, true, 12.5, "poppy");
        bucket.addFlower(mak);
        PaperDecorator paper = new PaperDecorator(bucket);
        RibbonDecorator ribbon = new RibbonDecorator(bucket);
        BasketDecorator basket = new BasketDecorator(bucket);
        Order order = new Order();
        order.addItem(paper);
        order.addItem(ribbon);
        order.addItem(basket);
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        order.processOrder();

    }
}
