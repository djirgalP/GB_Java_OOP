package Homework7;

public class LandlinePhone extends Phone {

    public LandlinePhone(String model) {
        super(model);
    }

    @Override
    public void call() {
        System.out.println("Landline phone makes outgoing call");
    }
    @Override
    public void receiveCall() {
        System.out.println("Landline phone receives incoming call");
    }
}