package Main;

import Decorator.BasketDecorator;
import Delivery.PostDeliveryStrategy;
import Enums.FlowerColour;
import Enums.FlowerType;
import Flowers.Astrometry;
import Flowers.Flower;
import Flowers.FlowerBucket;
import Decorator.PaperDecorator;
import Decorator.RibbonDecorator;
import Flowers.Mayweed;
import Payment.PayPalPaymentStrategy;
import suppliers.AstromerySupplierObserver;

import java.util.Arrays;

/**
 * Created by Pankiv on 14.11.2016.
 */
public class Main {
    public static void main(String [] args){
        FlowerBucket bucket = new FlowerBucket();
        Astrometry mayweed = new Astrometry(FlowerColour.GREEN, 12, true, 12.5, FlowerType.ASTROMETRY);
        Flower mayweed1 = new Mayweed(FlowerColour.RED,25,true,15.50,FlowerType.MAYWEED);
        bucket.addFlower(mayweed1);
        bucket.addFlower(mayweed);
        PaperDecorator paper = new PaperDecorator(bucket);
        RibbonDecorator ribbon = new RibbonDecorator(bucket);
        BasketDecorator basket = new BasketDecorator(bucket);
        Order order = new Order();
        order.addItem(paper);
        order.addItem(ribbon);
        order.addItem(basket);
        AstromerySupplierObserver sosat = new AstromerySupplierObserver(order);
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        order.processOrder();


    }
}
