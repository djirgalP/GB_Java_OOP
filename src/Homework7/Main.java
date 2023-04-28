package Homework7;

public class Main {
    public static void main(String[] args) {
        Phone wirePhoneUSSR = new LandlinePhone("TA-68");
        wirePhoneUSSR.receiveCall();
        wirePhoneUSSR.call();

        CellPhone cellPhoneSiemens = new CellPhone("12345343", "Siemens c65");
        cellPhoneSiemens.turnOn();
        cellPhoneSiemens.receiveCall();
        cellPhoneSiemens.call();
        cellPhoneSiemens.sendSms("I love Java");
        cellPhoneSiemens.setRingtone("Beyonce");
        cellPhoneSiemens.receiveCall();

        CellPhoneSensor cellPhoneSamsung = new CellPhoneSensor("98155521", "SamsungA51");
        cellPhoneSamsung.turnOn();
        cellPhoneSamsung.receiveCall();
        cellPhoneSamsung.call();
        cellPhoneSamsung.sendSms("I love OOP");
        cellPhoneSamsung.setRingtone("50Cent");
        cellPhoneSamsung.receiveCall();
    }
}
