package HomeWorks.homeWorks27.TaskA;

class Whales extends AbstractObjects  implements Swimanble{
    private String name;

    public Whales(String name) {
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
