package Lessons.lessons27.MyLessons27;

class lessons27 {
  public static void main(String[] args) {
   Oceanarium[] arrayAnimal = new Oceanarium[3];
   arrayAnimal[0] = new Shark();
   arrayAnimal[1] = new Duck();
   arrayAnimal[2] = new Turtels();
   // океанариум как интерфейс я реализовал

   for (int i = 0; i< arrayAnimal.length;i++){
    arrayAnimal[i].makeNouce();
   }
  }
}
