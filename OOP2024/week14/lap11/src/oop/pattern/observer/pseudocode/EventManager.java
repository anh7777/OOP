package oop.pattern.observer.pseudocode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final Map<String, List<EventListener>> listeners;

    EventManager() {
        this.listeners = new HashMap<>();
    }

    void subscribe(String eventType, EventListener listener) {
        listeners.computeIfAbsent(eventType, k -> new LinkedList<>()).add(listener);
    }

    void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        if (users != null) users.remove(listener);
    }
    void notify(String eventType, String data) {
        List<EventListener> users = listeners.get(eventType);
        if (users != null) {
            for (EventListener listener : users) {
                listener.update(data);
            }
        }
    }
}
