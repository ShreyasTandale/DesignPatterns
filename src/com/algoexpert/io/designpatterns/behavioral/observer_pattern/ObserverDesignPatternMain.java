package com.algoexpert.io.designpatterns.behavioral.observer_pattern;


import com.algoexpert.io.designpatterns.behavioral.observer_pattern.observable.IphoneStockObservable;
import com.algoexpert.io.designpatterns.behavioral.observer_pattern.observable.StockObservable;
import com.algoexpert.io.designpatterns.behavioral.observer_pattern.observer.EmailAlertObserver;
import com.algoexpert.io.designpatterns.behavioral.observer_pattern.observer.NotificationAlertObserver;

/*
  When to use observer pattern?
* 1) Implement "Notify me" functionality for any product which is unavailable at an Ecommerce site atm,
* but will be available in the future

  2) A Weather station, whenever it updates the current temperature, the TV display and Mobile Display should get updated.
* */
public class ObserverDesignPatternMain {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();
        NotificationAlertObserver emailObserver1 = new EmailAlertObserver(iphoneStockObservable, "Shreyas", "shreyas.tandale@gmail.com");
        NotificationAlertObserver emailObserver2 = new EmailAlertObserver(iphoneStockObservable, "Kajal", "kajal.tandale@gmail.com");
        NotificationAlertObserver emailObserver3 = new EmailAlertObserver(iphoneStockObservable, "Aadhira", "aadhira.tandale@gmail.com");

        iphoneStockObservable.add(emailObserver1);
        iphoneStockObservable.add(emailObserver2);
        iphoneStockObservable.add(emailObserver3);

        iphoneStockObservable.setStockCount(10);


    }
}
