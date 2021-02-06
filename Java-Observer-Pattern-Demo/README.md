As the name suggests it is used for observing some objects.  Observer watch for any change in state or property of subject.  Suppose you are interested in particular object and want to get notified when its state changes then you observe that object and when any state or property change happens to that object,it get notified to you.
As described by GoF:
"Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically".
You can think of observer design pattern in two ways:-
Subject-Observer relationship:Object which is being observed is refereed as Subject and classes which observe subject are called Observer. 
Publisher-Subscriber relationship:A publisher is one who publish data and notifies it to the list of subscribers who have subscribed for the same to that publisher.
A simple example is Newspaper. Whenever a new edition is published by the publisher,it will be circulated among subscribers whom have subscribed to publisher. The observers will not monitor every time whether there is any change in state of subject or not, since they will be notified for every state change of subject, until they stop observing subject. So it follows hollywood principle-"Don't call us,we will call you".
