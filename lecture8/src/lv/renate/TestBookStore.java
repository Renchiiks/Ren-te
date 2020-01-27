package lv.renate;

import lv.renate.bookstore.Author;
import lv.renate.bookstore.Book;

public class TestBookStore {

	public static void main(String[] args) {
		
		Author rowling = new Author("J.K.Rowlong", "rowling@gmail.com", 'f');
		Author rainis = new Author("Rainis", "rainis@gmail.com", 'm');
		System.out.println(rowling.getEmail());
		rowling.setEmail("rowlin@gmail.com");
		System.out.println(rowling.getEmail());
		
		Author test20 = new Author("Test20");
		
		
		 Book harryPoter = new Book("Harry Poter", rowling, 22.3, 1000); 
		 System.out.println(harryPoter.toString());
		 
		 Book testBook2 = new Book("Test book", test20, 30.3, 34);
		System.out.println(testBook2.toString());
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Author test1 = new Author("name", "name@name", 'f');
		Author test2 = new Author("name1", "name1@name1", '0');

		System.out.println(test1.toString());
		System.out.println(test2.toString());

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++=");

		char m = 'm';
		char f = 'f';
		char o = 'o';

		if (m == o || f == o) {
			System.out.println("It is M or F");

		} else {
			System.out.println("It is not M or F");
		}

		switch (o) {
		case 'm':
			System.out.println("Its m");
			break;
		case 'f':
			System.out.println("Its f");
			break;
		default:
			System.out.println("Not in the list");
		}

	}

}
