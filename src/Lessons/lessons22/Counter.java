package Lessons.lessons22;

 class Counter {
     private static int numOfCalls = 0;
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
