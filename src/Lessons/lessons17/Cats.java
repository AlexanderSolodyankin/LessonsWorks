package Lessons.lessons17;

public class Cats {
    int weigth;
    String name;
    int must;
    String breed;
    int age;

    public Cats(int weig, String name, int must, String breed, int age) {
        weigth = weig;
        this.name = name;
        this.must = must;
        this.breed = breed;
        this.age = age;
    }
    @Override
        public String toString(){
            return String.format("Вес = %s, Имя = %s, Усы = %s, Парода = %s, Возраст = %s",
                 getWeigth(), getName(), getMust(), getBreed(), getAge());
    }

    public void setWeigth(int w){
        weigth = w;
    }public int getWeigth(){return weigth;}

    public void setName(String name){
        this.name = name;
    }public String getName(){return name;}

    public void setMust(int m){
        must = m;
    }public int getMust(){return must;}

    public void setBreed(String bree){
        breed = bree;
    }public  String getBreed(){return breed;}

    public void setAge(int age){
        this.age = age;
    }public  int getAge(){return age;}

}
