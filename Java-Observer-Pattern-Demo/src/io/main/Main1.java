package io.main;

import io.subjects.Product1;
import io.subscribers.Person1;

public class Main1 {

    public static void main(String[] args) {
        Person1 p1 = new Person1("Person-1");
        Person1 p2 = new Person1("Person-2");
        Person1 p3 = new Person1("Person-3");
        Person1 p4 = new Person1("Person-4");

        Product1 product1 = new Product1("Lenovo", "Laptop","Not Available");

        try {
            System.out.println("-----Before-----");

            // Persons subscribed to notifications
            product1.registerPerson(p1);
            product1.registerPerson(p2);
            product1.registerPerson(p3);
            product1.registerPerson(p4);

            product1.notifyAllPersons();

            Thread.sleep(3000);

            System.out.println("-----After-----");

            // Persons Un-Subscribed to notifications
            product1.unRegisterPerson(p2);
            product1.unRegisterPerson(p4);

            // Product stage changed
            product1.setProductAvailability("Available");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
