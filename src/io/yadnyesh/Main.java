package io.yadnyesh;

/**
 * Created by z063407 on 3/4/17.
 */
public class Main {
    public static void main (String args[]){
       int switchValue = 1;

       switch(switchValue){
           case 1:
               System.out.println("Value was 1");
               break;
           case 2:
               System.out.println("Value was 2");
               break;
            default:
                System.out.println();
                break;
       }

       char charValue = 'C';
       switch (charValue){
           case 'A':
               System.out.println("A was found");
               break;
           case 'B':
               System.out.println("B was found");
               break;
           case 'C':case 'D' :case 'E':
               System.out.println("C, D or E was found");
               break;
           default:
               System.out.println("Could not find A, B, C, D, or E");
               break;
       }

       String month = "January";
       switch(month.toLowerCase()){
           case "january":
               System.out.println("Jan");
               break;
           case "june":
               System.out.println("Jun");
               break;
           default:
               System.out.println("Not Sure");
       }


    }


}
