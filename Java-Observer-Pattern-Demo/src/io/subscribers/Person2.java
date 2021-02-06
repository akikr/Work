package io.subscribers;

import io.publisher.Publisher2;

public class Person2 implements Publisher2 {

    private String personName;

    public Person2(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public void update(Object obj) {
        System.out.println("Hello " + getPersonName() + " , Product is " + obj);
    }
}
