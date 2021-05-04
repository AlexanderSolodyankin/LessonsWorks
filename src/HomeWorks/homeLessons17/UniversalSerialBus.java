package HomeWorks.homeLessons17;


public class UniversalSerialBus {

    private int serial;
    private int idPort;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public UniversalSerialBus (int serial, int idPort){
        this.idPort = idPort;
        if(idPort % 2 ==0){
            this.serial = 2;
        }
        else {
            this.serial = 1;
        }
        if(idPort % 3 == 0){
            this.serial = serial % 4;
        }

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setSerial(int serial){
        if(serial % 2 ==0){
            this.serial = 2;
        }
        else {
            this.serial = 1;
        }
        if(serial % 3 != 0){
            this.serial = 3;
        }
    }
    public int getSerial(){
        return serial;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setIdPort(int idPort){
        this.idPort = idPort;
    }
    public int getIdPort(){
        return idPort;
    }
}
