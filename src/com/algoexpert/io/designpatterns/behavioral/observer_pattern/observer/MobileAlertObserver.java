package com.algoexpert.io.designpatterns.behavioral.observer_pattern.observer;

import com.algoexpert.io.designpatterns.behavioral.observer_pattern.observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

    private String userName;
    private String mobile;
    private StockObservable stockObservable;

    public MobileAlertObserver(StockObservable observable, String userName, String mobile) {
        this.stockObservable = observable;
        this.userName = userName;
        this.mobile = mobile;
    }
    @Override
    public void update() {
        sendMsgOnMobile(mobile, "Product is back in stock, hurry up!!");
    }

    private void sendMsgOnMobile(String mobile, String msg) {
        System.out.println(msg + " sent to " + mobile);
    }
}
