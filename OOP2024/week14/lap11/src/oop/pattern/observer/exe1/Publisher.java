package oop.pattern.observer.exe1;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private Object mainState;

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(mainState);
        }
    }

    public void mainBusinessLogic(Object newState) {
        mainState = newState;
        notifySubscribers();
    }
}
