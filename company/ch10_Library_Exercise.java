/**
 * @author Aryan
 * This is Exercise on OOPs concept...
 **/

package com.company;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

class Library {
	String name;
	ArrayList<String> books = new ArrayList<>();
	HashMap<String, String> lendersList = new HashMap<>();
	
	int maxBooks = 10;
	int booksPresent;
	Scanner sc = new Scanner(System.in);
	
	public Library(String name) {
		this.name = name;
	}
	
	
	public void displayBooks() {
		int i = 0;
		System.out.println("\nThe books are: ");
		for (String e:books) {
			System.out.printf("%d. %s\n", i, e);
			i++;
		}
		
	}
	
	
	public void lendBook() {
		System.out.println("Enter book name");
		String book = sc.nextLine();
		System.out.println("Enter your name");
		String nameUser = sc.nextLine();
		
		if (books.contains(book)) {
			if (!lendersList.containsValue(book)) {
				lendersList.put(nameUser, book);
				System.out.printf("Please return the book %s in a week...\n", book);
			}
			
			else if (lendersList.containsValue(book)) {
				System.out.println("The book is already issued by the someone");
			}
			
		}
		else {
			System.out.println("SORRY! The book is currently not in the list "
					+ "but it will be added in future...");
		}
		
	}
	
	
	public void addBook() {
		System.out.println("Enter book's name: ");
		String book = sc.next();
		if (booksPresent<maxBooks) {
			books.add(book);
			System.out.printf("%s is added!\n", book);
		} 
		
		else {
			System.out.println("The vacancy of books is over! Try later");
		}
	
	}
	
	
	public void removeBook() {
		System.out.println("Enter book's name: ");
		String book = sc.nextLine();

		if (books.contains(book)) {
			books.remove(book);
			System.out.printf("The book %s is removed\n", book);
		}
		
		else {
			System.out.println("The book is not in the list");
		}
		
	}
	
	
	public int getBooksPresent() {
		return booksPresent;
	}
	
	
	public int getMaxBooks() {
		return maxBooks;
	
	}
	
}




public class ch10_Library_Exercise {
	
	public static void main(String[] args) {
		Library l = new Library("Aryan's library");
		l.books.add("Python Automation");
		l.books.add("Hello World!");
		l.books.add("I love books");
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		
		while (run) {

			System.out.println("\nWelcome to Aryan's Library");
			System.out.println("1.Display all books");
			System.out.println("2.Lend books");
			System.out.println("3.Add book");
			System.out.println("4.Remove book");
			
			System.out.println();
			System.out.println("Enter your choice (1/2/3/4)");
			int choice = sc.nextInt();

			switch (choice) {
				case 1 -> l.displayBooks();
				case 2 -> l.lendBook();
				case 3 -> l.addBook();
				case 4 -> l.removeBook();
			}
			
			System.out.println("\nPress 'c' to continue or 'q' to quit");
			String isEnd = sc.next();
			if (isEnd.equalsIgnoreCase("q")) run = false;

		}
		
		System.out.println("Ended");
		
	}
		

}
