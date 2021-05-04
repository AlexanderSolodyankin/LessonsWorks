package HomeWorks.homeLessons17;

import java.util.Random;

public class Computer {

    private String brand;
    private String color;
    private Display screen = new Display(21, "Ligth", "IPS");
    private HardDriveDisk hdd = new HardDriveDisk(1000);
    private RandomAccessMemory ddr3 = new RandomAccessMemory(8, "King Stoun");
//    private UniversalSerialBus[] usb = new UniversalSerialBus[6];
    private KeyBoard keyBoard = new KeyBoard(88,false,true);




    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Computer(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    public void setUsb(UniversalSerialBus[] usb) {
//        this.usb = usb;
//    }
//
//    public UniversalSerialBus[] getUsb(){
//        Random ran = new Random();
//        for (int i=0; i < usb.length; i++){
//            int random = ran.nextInt();
//            usb[i] = new UniversalSerialBus(random, random);
//        }
//        return usb;
//    }

    // я чет не понял как вывести массив из USB портов



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        Random ran = new Random();
        System.out.println(screen);
        System.out.println();
        System.out.println(hdd);
        System.out.println();
        System.out.println(ddr3);
        System.out.println();
        System.out.println(keyBoard);
        System.out.println();
        return String.format("Компьютер: %s \n" +
                        "Марка: %s \n",
                getBrand(), getColor());

    }


}
