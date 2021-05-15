package Lessons.lessons22;

 class Dogs {
    private String name;
    private int age;
    private int weirth;
    private static int objectCount;
    public int numOfCalls;

    public Dogs(){
        objectCount++;
    }
    public Dogs(String name, int age, int weirth){
        this.name = name;
        this.age = age;
        this.weirth = weirth;
        objectCount++;
    }
    public static int getObjectCount(){
        return objectCount;
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

    public int getWeirth() {
        return weirth;
    }

    public void setWeirth(int weirth) {
        this.weirth = weirth;
    }
    @Override
    public String toString(){
        return String.format("%s , %s, %s",getName(),getAge(),getWeirth());
    }
}
