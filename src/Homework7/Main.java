package Homework7;

public class Main {
    public static void main(String[] args) {
        Phone wirePhoneUSSR = new LandlinePhone("TA-68");
        wirePhoneUSSR.call();
        CellPhone cellPhoneSiemens = new CellPhone("12345343", "Siemens c65");
        cellPhoneSiemens.turnOn();
        cellPhoneSiemens.call();
        cellPhoneSiemens.sendSms("I love Java");

        CellPhoneSensor cellPhoneSamsung = new CellPhoneSensor("98155521", "SamsungA51");
    }
}
