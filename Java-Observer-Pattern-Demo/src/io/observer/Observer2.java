package io.observer;

import io.publisher.Publisher2;

public interface Observer2 {

    void registerPublisher(Publisher2 publisher2);

    void unRegisterPublisher(Publisher2 publisher2);

    void notifyAllPublishers();
}
