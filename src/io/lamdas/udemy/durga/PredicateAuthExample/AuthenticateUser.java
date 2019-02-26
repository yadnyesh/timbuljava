package io.lamdas.udemy.durga.PredicateAuthExample;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.Predicate;

public class AuthenticateUser {
	
	
	public static void main(String[] args) {
		Predicate<User> userAuthPredicate = user -> user.username.equals("Yadnyesh") && user.password.equals("password");
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username: ");
		user.username = scanner.next();
		System.out.println("Enter password");
		user.password = scanner.next();
		if(userAuthPredicate.test(user)){
			System.out.println("Valid user");
		} else {
			System.out.println("User Login Failed");
		}
	}
}
