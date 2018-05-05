package io.java9.in28minutes.javafilehandling;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirectoryScanRunner {
	
	public static void main(String[] args) throws IOException {
		String currentDirectory = "/Users/z063407/tuts/";
		Files.list(Paths.get(currentDirectory))
			 .forEach(System.out::println);
		
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		
		Files.walk(Paths.get(currentDirectory), 1)
				.filter(predicate)
				.forEach(System.out::println);
	}
}
