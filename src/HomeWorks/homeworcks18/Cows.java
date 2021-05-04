package HomeWorks.homeworcks18;

public class Cows {
    private int weight;
    private int age;
    private String gender;
    private String name;

    private Cows(){}

    public Cows(int weight, int age, String gender, String name) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("\nКорова: %s " +
                             "\nВозраст: %s" +
                             "\nПол: %s " +
                             "\nВес: %s \n", name, age, gender, weight);
    }
}
