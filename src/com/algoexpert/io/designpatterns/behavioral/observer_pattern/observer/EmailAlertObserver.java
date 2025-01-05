package com.algoexpert.io.designpatterns.behavioral.observer_pattern.observer;

import com.algoexpert.io.designpatterns.behavioral.observer_pattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
    private String userName;
    private String emailId;
    private StockObservable stockObservable;

    public EmailAlertObserver(StockObservable observable, String userName, String emailId) {
        this.stockObservable = observable;
        this.userName = userName;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is back in stock, hurry up!!");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println(msg +  " sent to " +  emailId );
    }
}
