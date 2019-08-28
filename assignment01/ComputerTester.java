package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		Computer computerOne = new Computer("Dell", "Very good CPU", 8, 2000, true, 1500);
		Computer computerTwo = new Computer("Dell", "Very good CPU", 8, 2000, false, 1300);
		Computer computerThree = new Computer("Dell", "Very good CPU", 8, 500, false, 500);
		Computer computerFour = new Computer("Dell", "Very good CPU", 8, 500, true, 700);
		System.out.println(computerOne);
		System.out.println(computerTwo);
		System.out.println(computerThree);
		System.out.println(computerFour);
		try(PrintWriter output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		Computer computerOne2 = new Computer("Dell", "Very good CPU", 8, 2000, true, 1500);
		Computer computerTwo2 = new Computer("Dell", "Very good CPU", 8, 2000, false, 1300);
		Computer computerThree2 = new Computer("Dell", "Very good CPU", 8, 500, false, 500);
		Computer computerFour2 = new Computer("Dell", "Very good CPU", 8, 500, true, 700);
		output.println(computerOne);
		output.println(computerTwo);
		output.println(computerThree);
		output.println(computerFour);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
