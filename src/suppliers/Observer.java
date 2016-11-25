package suppliers;


import java.util.LinkedList;


/**
 * Created by Pankiv on 22.11.2016.
 */
public abstract class Observer{
    protected Observable subject;
    public abstract void update(LinkedList flower);
}
