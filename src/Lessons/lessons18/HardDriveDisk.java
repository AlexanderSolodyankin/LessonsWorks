package Lessons.lessons18;

public class HardDriveDisk {
    private int volemDisk;
    private int speedDisk;

    public HardDriveDisk(){}

    public HardDriveDisk(int volemDisk, int speedDisk){
        this.volemDisk = volemDisk;
        this.speedDisk = speedDisk;
    }

    public void setVolemDisk(int volemDisk){
        this.volemDisk = volemDisk;
    }
    public int getVolemDisk(){
        return volemDisk;
    }

    public void setSpeedDisk(int speedDisk) {
        this.speedDisk = speedDisk;
    }

    public int getSpeedDisk() {
        return speedDisk;
    }

    @Override
    public String toString(){
        return String.format("\nОбъем диска: %s \n" +
                "Скорость диска: %s \n", getVolemDisk(), getSpeedDisk());
    }
}
