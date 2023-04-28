package Homework7;

public class CellPhone extends LandlinePhone implements SMSImpl, GSMImpl, SoundImpl{

    private String IMEI;
    private String phoneOperator;
    private String connectionType;
    private boolean connectionExists;
    private String ringtone;


    public CellPhone(String IMEI, String model) {
        super(model);
        this.IMEI = IMEI;
        this.phoneOperator = null;
        this.connectionType = null;
        this.connectionExists = false;
        this.ringtone = "Tryn-tryn";
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

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getConnectionType() {
        return this.connectionType;
    }

    public void setRingtone(String ringtone){
        this.ringtone = ringtone;
        System.out.println("Cell phone "  + super.model + " changed the ringtone to " + this.getRingtone());
    }

    public String getRingtone() {
        return ringtone;
    }

    @Override
    public void getOperatorData(){
        String operator = "MTS";
        setPhoneOperator(operator);
        System.out.println("The operator's name for CellPhone = " + operator);
    }

    @Override
    public String getAvailableRange(){
        return "2G";
    }

    @Override
    public boolean setUpConnection(String operator) {
        if (operator.equals("MTS") || operator.equals("Megafon")) {//логика такая просто так
            setConnectionType(getAvailableRange());
            System.out.println("Connection type is set up to ... " + getConnectionType());
            return true;
        } else {
            System.out.println("Connection is unavailable ... ");
            return false;
        }
    }

    @Override
    public void passInfo(String imei){
        System.out.println("Transfer IMEI info to operator ... " + this.getIMEI());
    }

    @Override
    public void call() {
        System.out.println("Cell phone" + super.model + " makes outgoing call");
    }

    @Override
    public void receiveCall() {
        System.out.println("Cell phone "  + super.model + " receives incoming call");
        makeSound();
    }

    @Override
    public void sendSms(String sms){
        System.out.println("Cell phone "  + super.model + " sends sms ... " + sms);
    }

    @Override
    public String receiveSms(){
        String sms = "This is a text for sms";
        System.out.println("Cell phone "  + super.model + " receives sms");
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
        System.out.println("Cell phone "  + super.model + " is turned off");
    }

    @Override
    public void makeSound(){
        System.out.println("and plays " + getRingtone());
    }

}
