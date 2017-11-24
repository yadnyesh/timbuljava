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
        names[0] = "Yadnyesh...HOHO ";
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
        Integer[] numbers = new Integer[] {1,2,3,4,5,6,7,8,9,0};
        System.out.println("");
        Display(numbers);
    }



}
