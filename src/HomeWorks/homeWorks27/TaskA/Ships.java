package HomeWorks.homeWorks27.TaskA;

class Ships implements Swimanble{
    private String name;

    public Ships(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void swims() {
        System.out.println(name + " Плавает");
    }

}
