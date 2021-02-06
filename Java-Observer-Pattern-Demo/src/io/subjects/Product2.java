package io.subjects;

import io.publisher.Publisher2;
import io.observer.Observer2;

import java.util.ArrayList;

public class Product2 implements Observer2 {

    private String productName;
    private String productType;
    private String productAvailability;

    private ArrayList<Publisher2> publisher2s = new ArrayList<>();

    public Product2(String productName, String productType, String productAvailability) {
        this.productName = productName;
        this.productType = productType;
        this.productAvailability = productAvailability;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(String productAvailability) {
        this.productAvailability = productAvailability;
        notifyAllPublishers();
    }

    public ArrayList<Publisher2> getPublishers() {
        return publisher2s;
    }

    public void setPublishers(ArrayList<Publisher2> publisher2s) {
        this.publisher2s = publisher2s;
    }


    public void registerPublisher(Publisher2 publisher2) {
        getPublishers().add(publisher2);
    }

    public void unRegisterPublisher(Publisher2 publisher2) {
        getPublishers().remove(publisher2);
    }

    @Override
    public void notifyAllPublishers() {
        System.out.println("All Subscribers notified !!");
        for (Publisher2 ob: publisher2s) {
            ob.update(this.productAvailability);
        }
    }
}
