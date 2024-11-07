package exercise8;

public abstract class Observer {

    protected Subject subject;

    public Observer(final Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    // reakcja na zmianę stanu
    public abstract void update();
}
