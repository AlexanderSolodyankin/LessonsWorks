package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskB;

public class Main {

    public static void main(String[] args) {
        Margarita margarita = new Margarita(300, 1.23, false);
        Pepperoni pepperoni = new Pepperoni(250, 1.54, true);
        LaFinta laFinta = new LaFinta(120, 0.76, false);


        margarita.cook();
        margarita.deliver();
        System.out.println(margarita);
        System.out.println();

        pepperoni.cook();
        pepperoni.deliver();
        System.out.println(pepperoni);
        System.out.println();

        laFinta.cook();
        laFinta.deliver();
        System.out.println(laFinta);
        System.out.println();
    }
}
