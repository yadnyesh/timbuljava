package io.lamdas;

import java.util.Arrays;
import java.util.List;

/**
 * Created by z063407 on 9/24/17.
 */
public class Sample {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int result = 0;
		for(int e : numbers) {
			if(e % 2 == 0) {
				result += e * 2;
			}
		}
		System.out.println(result);
		System.out.println(numbers.stream().filter(e -> e % 2 == 0).mapToInt(e -> e * 2).sum());
		
		//        Thread th;
		//        th = new Thread(new Runnable() {
		//            @Override
		//            public void run() {
		//                System.out.println("In Another Thread");
		//            }
		//        });
		//
		//        th = new Thread(new Runnable() {
		//            @Override
		//            public void run() {
		//                System.out.println("In Another Thread2");
		//            }
		//        });
		//
		//        th.start();
		
		//        Thread th = new Thread(() -> System.out.printf("In Another Thread"));
		//        th.start();
		//        System.out.println("In main Thread");
		
	}
}
