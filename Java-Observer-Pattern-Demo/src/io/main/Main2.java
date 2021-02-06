package io.main;

import io.subjects.Product2;
import io.subscribers.Person2;

public class Main2 {

    public static void main(String[] args) {

        Person2 p1 = new Person2("Person-1");
        Person2 p2 = new Person2("Person-2");
        Person2 p3 = new Person2("Person-3");
        Person2 p4 = new Person2("Person-4");

        Product2 product2 = new Product2("Lenovo", "Laptop","Not Available");

        try {
            System.out.println("-----Before-----");

            // Persons subscribed to notifications
            product2.registerPublisher(p1);
            product2.registerPublisher(p2);
            product2.registerPublisher(p3);
            product2.registerPublisher(p4);

            product2.notifyAllPublishers();

            Thread.sleep(3000);

            System.out.println("-----After-----");

            // Persons Un-Subscribed to notifications
            product2.unRegisterPublisher(p2);
            product2.unRegisterPublisher(p4);

            // Product stage changed
            product2.setProductAvailability("Available");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
