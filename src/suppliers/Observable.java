package suppliers;


/**
 * Created by Pankiv on 22.11.2016.
 */
public interface Observable {
    void notifyObserver();
    void removeObserver(Observer a);
    void addObserver(Observer a);
}
