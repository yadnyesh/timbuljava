package io.java9.in28minutes.javafilehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryScanRunner {
	
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get("/Users/z063407/tuts/targetcode/JavaCollections/"))
			 .forEach(System.out::println);
		;
	}
}
