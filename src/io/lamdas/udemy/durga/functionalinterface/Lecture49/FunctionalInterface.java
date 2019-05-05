package io.lamdas.udemy.durga.functionalinterface.Lecture49;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FunctionalInterface {
	
	public static void main(String[] args) {
		ArrayList<Movie> movieArrayList = new ArrayList<>();
		movieArrayList.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		movieArrayList.add(new Movie("Raees", "SRK", "PAK"));
		movieArrayList.add(new Movie("Dangal", "Aamir", "Ritu"));
		movieArrayList.add(new Movie("Sultan", "Salman", "Anushka"));
		
		Consumer<Movie> movieConsumer = m -> {
			System.out.print(m.getName());
			System.out.print(m.getHero());
			System.out.print(m.getHeroine());
			System.out.println();
		};
		
		movieArrayList.forEach(movieConsumer);
	}
	
}
