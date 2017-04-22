package io.yadnyesh;

/**
 * Created by z063407 on 4/22/17.
 */
public class ArrayDisp {

    static <T> void Display (T[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if(arr[i] != null) {
                System.out.printf(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String[] names = new String [10];
        names[0] = "Yadnyesh";
        names[1] = "Bindiya";
        names[2] = "Varada";
        names[3] = "Bharat";
        names[4] = "Shweta";
        names[5] = "Navneet";
        names[6] = "Navneet";
        names[7] = "Mike";
        names[8] = "Brian";
        names[9] = "Greg";
        Display(names);
    }



}
