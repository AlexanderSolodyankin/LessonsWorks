package Lessons.lesson16.lesson16;

 class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format("My name is %s, i am %s", this.name, this.age);
    }


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
        this.age = age;
    }

    @Override
    public int hashCode(){
        return this.age + name.hashCode();
    }

    @Override
    public boolean equals(Object otherObject){
        if(this.hashCode() != otherObject.hashCode()){
            return false;
        }
        return this.hashCode() == otherObject.hashCode();
    }


}
