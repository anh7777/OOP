package oop.pattern.observer.exe1;

class ConcreteSubscriber implements Subscriber {
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Object context) {
        System.out.println(name + " updated with context: " + context);
    }
}
