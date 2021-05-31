package HomeWorks.homeWorks26.TaskA;

public class TaskA {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("Глория" ,14,new Apple("Яблоко", 10, true), new Insect("Куки", 56,null));
        System.out.println(monkey);
        monkey.drag();
        monkey.clime();
        monkey.eat();
    }
}
