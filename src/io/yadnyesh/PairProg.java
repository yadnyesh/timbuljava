package io.yadnyesh;

/**
 * Created by z063407 on 4/23/17.
 */
public class PairProg {
    public static void main(String[] args) {
        Pair<String, Integer> grade1 = new Pair<>("Williams", 90);
        Pair<String, Integer> grade2 = new Pair<>("Brown", 44);
        System.out.println(grade1.getFirstItem());
        System.out.println(grade1.getSecondItem());
        System.out.println(grade2.getFirstItem());
        System.out.println(grade2.getSecondItem());
    }
}
