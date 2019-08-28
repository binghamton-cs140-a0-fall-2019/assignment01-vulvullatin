package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester{
	public static void main(String[] args){
		ComputerOwner dude = new ComputerOwner(new Person("John", "Doe", "12-543-6789", new DateAndPlaceOfBirth(1999, 1, 1, "Davenport", "Iowa", "United States"), new StreetUSAddress("123 First Place", "", "Townville", "Oklahomansas", "39201")));
		Computer[] computers = {new Computer("Dell", "Fast", 2, 1, true, 1000000.0), 
										  new Computer("Dell", "Slow", 3, 2, false, 3), 
										    new Computer("Dell", "It does CPU stuff", 8, 20, true, 30.0), 
											   new Computer("HP", "All the cores", 9, 10, false, 200.2)};
		for(int i = 0; i<computers.length; i++) dude.addComputer(computers[i]);
		System.out.println(dude);
		String s1 = dude.toString();
		dude.removeComputer(3);
		dude.removeComputer(1);
		System.out.println(dude);
		try(PrintWriter output = new PrintWriter(new FileOutputStream(new File("output.txt"), true))) {
		output.println("\nTESTS FOR ComputerOwner.java");
		output.println(s1);
		output.println(dude);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
