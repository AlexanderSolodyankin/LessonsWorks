package Lessons.lessons18.lesson18;

public class Cpu {
    String model;
    int cores;
    double fequency;

    public Cpu(String model, int cores, double fequency) {
        this.model = model;
        this.cores = cores;
        this.fequency = fequency;
    }

    @Override
    public String toString() {
        return "\nCpu{" +
                "model='" + model + '\'' +
                ", cores=" + cores +
                ", fequency=" + fequency +
                '}';
    }
}
