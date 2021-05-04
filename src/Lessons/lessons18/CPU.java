package Lessons.lessons18;

public class CPU {
    String model;
    int core;
    int frequency;

    public CPU(){}

    public CPU(String model, int core, int frequency){
        this.model = model;
        this.core = core;
        this.frequency = frequency;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setCore(int core) {
        this.core = core;
    }public int getCore() {return core;}

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString(){
        return String.format("Модель процесора: %s \n" +
                "Количество ядер: %s \n" +
                "Частота процесора: %s \n", getModel(), getCore(), getFrequency());
    }
}
