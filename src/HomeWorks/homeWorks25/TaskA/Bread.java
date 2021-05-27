package HomeWorks.homeWorks25.TaskA;

 class Bread implements Actable {
    private String name;

    public Bread(String name) {
        this.name = name;
    }

    @Override
    public void act() {
        System.out.println("Выпекается " + name);
    }
}
