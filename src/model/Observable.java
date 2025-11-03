package model;

/**
 * @author Nelleke Jansen
 * Interface for the Observable
 */
public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
