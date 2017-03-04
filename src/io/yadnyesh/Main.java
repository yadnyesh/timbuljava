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

       char charValue = 'A';
       switch (charValue){
           case 'A':
               System.out.println("A was found");
           case 'B':
               System.out.println("B was found");
           case 'C':case 'D' :case 'E':
               System.out.println("C, D or E was found");
       }

    }


}
