package Homework7;

public class CellPhoneSensor extends CellPhone implements LTEImpl {

    String connectionType;

    public CellPhoneSensor(String IMEI, String model) {
        super(IMEI, model);
    }
    public void setConnectionType(String type){
        this.connectionType = type;
    }

    @Override
    public String getConnectionType(){
        String connection = "3G";
        return connection;
    }

}
