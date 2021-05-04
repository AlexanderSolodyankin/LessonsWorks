package Lessons.lessons18;

public class NootBook {
    HardDriveDisk hdd;
    RandomAccessMemory ram ;
    OperationSystem os ;
    CPU centralproc;

    public HardDriveDisk getHdd() {
        return hdd;
    }

    public void setHdd(HardDriveDisk hdd) {
        this.hdd = hdd;
    }

    public RandomAccessMemory getRam() {
        return ram;
    }

    public void setRam(RandomAccessMemory ram) {
        this.ram = ram;
    }

    public OperationSystem getOs() {
        return os;
    }

    public void setOs(OperationSystem os) {
        this.os = os;
    }

    public CPU getCentralproc() {
        return centralproc;
    }

    public void setCentralproc(CPU centralproc) {
        this.centralproc = centralproc;
    }



    public NootBook(HardDriveDisk hdd, RandomAccessMemory ram, OperationSystem os, CPU cpu){

        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.centralproc = cpu;

    }


    @Override
    public String toString() {
        return String.format("Ноутбук \n" +
                "Жоский диск: %s \n" +
                "Оперативная память: %s \n" +
                "Операционная система: %s \n" +
                "Процессор: %s \n", getHdd(), getRam(), getOs(), getCentralproc() );
    }
}
