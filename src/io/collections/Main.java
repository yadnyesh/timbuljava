package io.collections;

import java.util.List;

/**
 * Created by z063407 on 3/19/17.
 */
public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8 , 12);

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }


    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=========================================================================");
    }
}

