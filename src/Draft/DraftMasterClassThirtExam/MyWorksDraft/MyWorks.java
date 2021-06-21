package Draft.DraftMasterClassThirtExam.MyWorksDraft;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class MyWorks {
     public static void main(String[] args) throws FileNotFoundException {
         FileReader input = new FileReader("input.txt");
         FileReader patterns = new FileReader("patterns.txt");
         ArrayList<String> inputText = setArrayText(input);
         ArrayList<String> patternsText = setArrayText(patterns);
         outLineText(inputText, patternsText);
         System.out.println("---------------------------------");
         outLineTextAnother(inputText,patternsText);
         System.out.println("-----------------------------------");
         outLineTextDifference(inputText,patternsText);


     }

     static ArrayList<String> setArrayText(FileReader reader){
         Scanner sc = new Scanner(reader);
         ArrayList<String> arrayText = new ArrayList<>();

         while(sc.hasNextLine()){
             arrayText.add(sc.nextLine());

         }
         return arrayText;
     }
     static void outLineText(ArrayList<String> input, ArrayList<String> patterns){
         for(String setInput: input){
             for(String setPatеerns: patterns){
                 if(setInput.equals(setPatеerns)){
                     System.out.println(setInput);
                 }
             }

         }
     }
    static void outLineTextAnother(ArrayList<String> input, ArrayList<String> patterns){
        for(String setInput: input){
            for(String setPatеerns: patterns){
                if(setInput.contains(setPatеerns)){
                    System.out.println(setInput);
                }
            }

        }
    }
    static void outLineTextDifference(ArrayList<String> input, ArrayList<String> patterns){
      ArrayList<String> chekString = patterns;
        String charSetLine = "";
      for(int i =0;i < chekString.size();i++){
          String checkLine = chekString.get(i);
          charSetLine = "";
            int contents = 0;
          for(int j =0; j < checkLine.length();j++){
              contents = 0;
             if(j + 1 < checkLine.length()){
                 if(checkLine.charAt(j + 1) == checkLine.charAt(j)){
                     contents ++;
                 }
             }
             if(contents == 0) {
                 charSetLine = charSetLine + checkLine.charAt(j);
             }
          }
          chekString.set(i,charSetLine);
      }
        for(String setInput: input){
            for(String setPatеerns: chekString){
                if(setInput.equals(setPatеerns)){
                    System.out.println(setInput);
                }
            }
        }
    }


}
