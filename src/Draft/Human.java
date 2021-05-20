package Draft;

import java.util.Scanner;

class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Scanner sc = new Scanner(System.in);
        if (age < 100 && age > 20) {
            this.age = age;
        }
        else {
            System.err.println("Вы неправельно возраст!!!!");
            System.err.print("Ведите возрост заново: ");
            setAge(sc.nextInt());
        }
    }
}
