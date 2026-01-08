package fr.eni.tp;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    List<Observer> observers;

    public Observable(){
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public <T> void notifyObservers(String key, T data) {
        for (Observer observer : observers){
            if (observer.getType().isInstance(data)) {
                observer.onChange(key, data);
            }
        }
    }
}
