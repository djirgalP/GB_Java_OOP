package Homework7;

public interface GSMImpl {
    void getOperatorData(); //Получает информацию об операторе моб.связи
    boolean setUpConnection(String operator); //Устанавливает соедение с оператором
    void passInfo(String IMEI); //Передает данные о телефоне оператору, например, пусть это будет уникальный номер устройства
}
