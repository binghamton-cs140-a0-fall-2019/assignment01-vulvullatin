package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester{
	public static void main(String[] args){
		DateAndPlaceOfBirth personOne = new DateAndPlaceOfBirth(2000,12,25,"Fairfax","Virginia","United States");
		DateAndPlaceOfBirth personTwo = new DateAndPlaceOfBirth(2000,12,25,"Paris","France");
		DateAndPlaceOfBirth personThree = new DateAndPlaceOfBirth(2005,12,25,"London","England");
		DateAndPlaceOfBirth personFour = new DateAndPlaceOfBirth(1984,5,25,"Richmond","Virginia","United States");
		DateAndPlaceOfBirth personFive = new DateAndPlaceOfBirth(1990,12,5,"Arlington","Virginia","United States");
		System.out.println(personOne.hasSameBirthDateAs(personTwo));
		System.out.println("Should be True");
		System.out.println(personOne.olderThan(personTwo));
		System.out.println("Should be False");
		System.out.println(personOne.youngerThan(personTwo));
		System.out.println("Should be False");
		System.out.println(personOne.hasSameBirthDateAs(personThree));
		System.out.println("Should be False");
		System.out.println(personOne.hasSameBirthDayAs(personThree));
		System.out.println("Should be True");
		System.out.println(personFour.hasSameBirthDayAs(personFive));
		System.out.println("Should be False");
		System.out.println(personFour.olderThan(personFive));
		System.out.println("Should be True");
		System.out.println(personFive.youngerThan(personFour));
		System.out.println("Should be True");
		try(PrintWriter output =new PrintWriter(new FileOutputStream(
			new File("output.txt"), true /* true means append to file */))) {
				output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
		output.println(personOne.hasSameBirthDateAs(personTwo));
		output.println("Should be True");
		output.println(personOne.olderThan(personTwo));
		output.println("Should be False");
		output.println(personOne.youngerThan(personTwo));
		output.println("Should be False");
		output.println(personOne.hasSameBirthDateAs(personThree));
		output.println("Should be False");
		output.println(personOne.hasSameBirthDayAs(personThree));
		output.println("Should be True");
		output.println(personFour.hasSameBirthDayAs(personFive));
		output.println("Should be False");
		output.println(personFour.olderThan(personFive));
		output.println("Should be True");
		output.println(personFive.youngerThan(personFour));
		output.println("Should be True");
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
