package io.observer;


import io.subscribers.Person1;

public interface Observer1 {
    void registerPerson(Person1 person1);

    void unRegisterPerson(Person1 person1);

    void notifyAllPersons();

    void update (Person1 person1, Object obj);
}
