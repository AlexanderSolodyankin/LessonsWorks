package Draft.DraftLessons;

 class Main {
  public static void main(String[] args) {
   HumClass human1 = new HumClass(); // создан класс человек
   human1.setName("Лариса");
   System.out.println(human1.getName());
   HumClass human2 ;
   human2 = new HumClass();
   human2.setName("Даша");
   System.out.println(human2.getName());
   HumClass human3 = human2;
   System.out.println(human3.getName());
   human2.setName("Новое имя");
   System.out.println("Человек 3 " + human3.getName());
   /**
    * В данном примере показано что созданый клас является сылочнной переменной
    * и то что они сслылаются к одному и тому же обьекту    *
    */

   int num1 = 4;
   int num2 = num1;
   num1 = 3;
   System.out.println(num2);
   /**
    * Пример действия примитивных переменных
    */
  }
}
