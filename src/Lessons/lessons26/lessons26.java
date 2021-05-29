package Lessons.lessons26;

 class lessons26 {
  public static void main(String[] args) {
       Turtel turtel = new Turtel();
       turtel.egg();
       turtel.panzer();
       turtel.swim();

       Panzer turtel2 = new Turtel();
       turtel2.panzer(); // причем другие методжы вызвать не могу!!!!!!
      // прикольный результат

      Chicken  chicken = new Chicken();
      Conteiner conteiner = new Conteiner(turtel,chicken);
  }

}
