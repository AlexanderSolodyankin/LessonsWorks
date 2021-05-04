package Lessons.lessons18;

public class Lessons18 {


    public static void main(String[] args) {
        CPU central = new CPU("I 5 pro", 6, 3);
        HardDriveDisk hdd = new HardDriveDisk(1024, 340);
        OperationSystem os = new OperationSystem("Windows", "pro edition 10");
        RandomAccessMemory ram = new RandomAccessMemory(6000 , "Strong memory");
        NootBook laptoop = new NootBook(hdd,ram,os,central);
        System.out.println(laptoop);
        System.out.println("после изменения!!");
        os = new OperationSystem("Linux", "Bomj edition");
        laptoop = new NootBook(hdd,ram,os,central);
        System.out.println(laptoop);
    }

}
