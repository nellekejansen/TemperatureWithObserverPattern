package model;

/**
 * @author Nelleke Jansen
 * Interface for the Observable
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
