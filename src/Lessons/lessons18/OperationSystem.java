package Lessons.lessons18;

public class OperationSystem {
    private String nameOS;
    private   String versionOS;

    public OperationSystem(){}


    public OperationSystem(String nameOS, String versionOS) {
        this.nameOS = nameOS;
        this.versionOS = versionOS;
    }

    public void setNameOS(String nameOS) {
        this.nameOS = nameOS;
    }

    public String getNameOS() {
        return nameOS;
    }

    public void setVersionOS(String versionOS) {
        this.versionOS = versionOS;
    }

    public String getVersionOS() {
        return versionOS;
    }

    @Override
    public String toString() {
        return String.format ( "Операционная система \n" +
                "Название операционной системы: %s \n" +
                "Версия операционной системы: %s ", getNameOS(), getVersionOS());
    }
}
