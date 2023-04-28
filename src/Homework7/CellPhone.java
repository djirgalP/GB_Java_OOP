package Homework7;

public class CellPhone extends Phone implements SMSImpl, GSMImpl{

    private String IMEI;
    private String phoneOperator;
    private boolean connectionExists;

    public CellPhone(String IMEI, String model) {
        super(model);
        this.IMEI = IMEI;
        this.phoneOperator = null;
        this.connectionExists = false;
    }

    public String getIMEI() {
        return this.IMEI;
    }

    public void setPhoneOperator(String name) {
        this.phoneOperator = name;
    }

    public String getPhoneOperator() {
        return this.phoneOperator;
    }

    public void setConnectionExists(boolean exists) {
        this.connectionExists = exists;
    }

    @Override
    public void getOperatorData(){
        String operator = "MTS";
        setPhoneOperator(operator);
        System.out.println("The operator's name for CellPhone = " + operator);
    }

    @Override
    public boolean setUpConnection(String operator) {
        if (operator.equals("MTS")) //логика такая просто так
            return true;
        else
            return false;
    }

    @Override
    public void passInfo(String imei){
        System.out.println("Transfer IMEI info to operator ... " + this.getIMEI());
    }

    @Override
    public void call() {
        System.out.println("Push-button phone makes outgoing call");
    }

    @Override
    public void receiveCall() {
        System.out.println("Push-button phone receives incoming call");
    }

    @Override
    public void sendSms(String sms){
        System.out.println("Cell phone sends sms");
    }

    @Override
    public String receiveSms(){
        String sms = "This is a text for sms";
        System.out.println("Cell phone receives sms");
        return sms;
    }

    public void turnOn(){
        getOperatorData(); // получаем инфо об операторе моб. сети
        if (setUpConnection("MTS")) {// устанавливаем соединение
            setConnectionExists(true);
            passInfo(getIMEI());
            System.out.println(receiveSms());
        }
    }

    public void turnOff(){
        setConnectionExists(false);
    }
}
