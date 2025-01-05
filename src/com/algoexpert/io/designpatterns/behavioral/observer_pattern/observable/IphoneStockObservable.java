package com.algoexpert.io.designpatterns.behavioral.observer_pattern.observable;

import com.algoexpert.io.designpatterns.behavioral.observer_pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {
    public List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    private int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver: notificationAlertObservers)
            notificationAlertObserver.update();
    }

    @Override
    public void setStockCount(int stockCountAdded) {
        if(this.stockCount == 0) {
            notifySubscribers();
        }
        stockCount += stockCountAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
