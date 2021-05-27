package HomeWorks.homeWorks25.TaskA;

 class Circle implements Actable{
    private int diametr;

    public Circle(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void act() {
        System.out.println("Рисуется " + diametr);
    }
}
