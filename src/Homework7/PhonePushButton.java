package Homework7;

public class PhonePushButton implements CallingImpl, SMSImpl{
    @Override
    public void call() {
        System.out.println("Push-button phone calls");
    }

    @Override
    public void sms(){
        System.out.println("Push-button phone sends sms");
    }
}
