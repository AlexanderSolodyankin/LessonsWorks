package HomeWorks.homeLessons17;

public class HardDriveDisk {
    private int placeDisk;
    private int brokenDowNumberDisk;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public HardDriveDisk() {

    }

    public HardDriveDisk(int disk) {
        placeDisk = disk ;
        brokenDowNumberDisk = disk / 250;

    }

    @Override
    public String toString() {
        return String.format("Жозкий диск обьемом на :  %s гигобайт \n" +
                "Разделен на %s разделов.", getPlaceDisk(), getBrokenDowNumberDisk());
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setPlaceDisk(int disk) {
        placeDisk = disk;
    }

    public int getPlaceDisk() {
        return placeDisk;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setBrokenDowNumberDisk(int disk) {
        if (disk <= 0) {
            System.err.println("Жоский диск сломан!!!");
        } else {
            brokenDowNumberDisk = disk / 250;
        }
    }

    public int getBrokenDowNumberDisk() {
        return brokenDowNumberDisk;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
