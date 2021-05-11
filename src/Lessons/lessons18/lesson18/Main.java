package Lessons.lessons18.lesson18;

public class Main {
    public static void main(String[] args) {
        Hdd hdd = new Hdd(2048, 720);
        Ram[] ram =  new Ram[4];
        ram[0] = new Ram(4096, "DDR4");
        Os os = new Os("Widnows", "10");
        Cpu cpu = new Cpu("INtel", 8, 2.5);
        Notebook myNotebook = new Notebook(hdd, ram, os, cpu);

        Hdd newHdd = new Hdd(12048, 1720);
        Os newOs = new Os("Upundtu", "16.04");
        Cpu newCpu = new Cpu("Intel core i9", 8, 2.5);

        myNotebook.setHdd(newHdd);
        myNotebook.setOs(newOs);
        myNotebook.setCpu(newCpu);

        System.out.println(myNotebook);

        Ram[] fetchedRams = myNotebook.getRam();
        for(Ram slot : fetchedRams) {
            System.out.println(slot);
        }
    }
}
