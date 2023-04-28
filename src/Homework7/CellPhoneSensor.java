package Homework7;

public class CellPhoneSensor extends CellPhone implements LTEImpl {

    String connectionType;

    public CellPhoneSensor(String IMEI, String model) {
        super(IMEI, model);
    }
    public void setConnectionType(String type){
        this.connectionType = type;
    }
    public String getConnectionType(){
        return this.connectionType;
    }

    @Override
    public void getOperatorData(){
        String operator = "Megafon";
        setPhoneOperator(operator);
        System.out.println("The operator's name for Sensor CellPhone " + super.model + " is " + operator);
    }

    @Override
    public String getAvailableRange(){
        return "4G";
    }

    @Override
    public boolean setUp4GConnection(String operator){
        if (operator.equals("MTS") || operator.equals("Megafon") || operator.equals("Beeline")) {//логика такая просто так
            setConnectionType(getAvailableRange());
            System.out.println("Connection type is ... " + getConnectionType());
            return true;
        } else {
            System.out.println("Connection is unavailable ... ");
            return false;
        }
    }

    @Override
    public void call() {
        System.out.println("Sensor CellPhone " + super.model + " makes outgoing call");
    }

    @Override
    public void receiveCall() {
        System.out.println("Sensor CellPhone "  + super.model + " receives incoming call");
        makeSound();
    }

    @Override
    public void sendSms(String sms){
        System.out.println("Sensor CellPhone "  + super.model + " sends sms ... " + sms);
    }

    @Override
    public String receiveSms(){
        String sms = "This is a text for sms";
        System.out.println("Sensor CellPhone "  + super.model + " receives sms");
        return sms;
    }

    @Override
    public void turnOn(){
        getOperatorData(); // получаем инфо об операторе моб. сети
        if (setUp4GConnection("Megafon")) {// устанавливаем соединение 4G
            setConnectionExists(true);
            passInfo(getIMEI());
            System.out.println(receiveSms());
        }
    }

    @Override
    public void turnOff(){
        setConnectionExists(false);
        System.out.println("Sensor CellPhone "  + super.model + " is turned off");
    }
    
}
