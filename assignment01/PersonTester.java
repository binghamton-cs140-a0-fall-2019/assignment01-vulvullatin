package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester{
	public static void main(String[] args) {
		Person person1 = new Person("John", "Doe", "129873456", new DateAndPlaceOfBirth(2001, 9, 11, "A City", "Mississippi", "United States"), new StreetUSAddress("1100 Pennsylvania Avenue", "Apartment 1", "Washington", "DC", "20004"));
		System.out.println(person1);
		try(PrintWriter output = new PrintWriter(new FileOutputStream(new File("output.txt"), true))) {
		output.println("\nTESTS FOR Person.java:");
		output.println(person1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
