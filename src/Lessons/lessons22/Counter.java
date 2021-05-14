package Lessons.lessons22;

 class Counter {
     private int id;
     private static int numOfCalls = 0;
     private static int objectsCoun;

     public  Counter(){
         objectsCoun++;
     }
     public static int getObjectsCoun(){
         return objectsCoun;
     }
      static void increment(){
        Counter.numOfCalls++;
          System.out.println(numOfCalls);
     }
     public  static int factorial(){
          int factorial = 1;
          for(int i = 1; i <= numOfCalls; i++){
              factorial = factorial * i;
          }
         System.out.println("FACT " + factorial);
          return factorial;
     }

}
