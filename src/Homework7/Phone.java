package Homework7;

public abstract class Phone implements CallingImpl{
    String model;

    public Phone(String model) {
        this.model = model;
    }

    @Override
    public void call() {
        System.out.println("Phone makes outgoing call");
    }

    @Override
    public void receiveCall() {
        System.out.println("Phone receives incoming call");
    }
}
