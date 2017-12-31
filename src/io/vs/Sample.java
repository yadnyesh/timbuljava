package io.vs;

import java.util.Arrays;
import java.util.List;

/**
 * Created by z063407 on 12/31/17.
 */
public class Sample {
	
	public static int transform(int number) {
		if (number == 7 )
			try {
				throw new Exception("oops something went wrong");
			} catch(Exception e) {
				e.printStackTrace();
			}
		return number;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		numbers.stream()
				.map(e -> transform(e))
				.forEach(e -> System.out.println(e));
	}
}

