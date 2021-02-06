package io.subjects;

import io.observer.Observer1;
import io.publisher.Publisher2;
import io.subscribers.Person1;

import java.util.ArrayList;

public class Product1 implements Observer1 {

    private String productName;
    private String productType;
    private String productAvailability;

    private ArrayList<Person1> person1s = new ArrayList<>();

    public Product1(String productName, String productType, String productAvailability) {
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
        notifyAllPersons();
    }

    public ArrayList<Person1> getPerson1s() {
        return person1s;
    }

    public void setPerson1s(ArrayList<Person1> person1s) {
        this.person1s = person1s;
    }

    @Override
    public void registerPerson(Person1 person1) {
        getPerson1s().add(person1);
    }

    @Override
    public void unRegisterPerson(Person1 person1) {
        getPerson1s().remove(person1);
    }

    @Override
    public void notifyAllPersons() {
        System.out.println("All Subscribers notified !!");
        for (Person1 pr1: person1s) {
            update(pr1, this.productAvailability);
        }
    }

    @Override
    public void update(Person1 person1, Object obj) {
        System.out.println("Hello " + person1.getPersonName() + " , Product is " + obj);
    }
}
