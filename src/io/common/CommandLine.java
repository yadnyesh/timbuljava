package io.common;

public class CommandLine {
	
	public static void main(String[] args) {
		if(args.length != 2) {
			System.err.println("usage: myapp <arg1> <arg2>");
			System.exit(1);
		}
	}
}
