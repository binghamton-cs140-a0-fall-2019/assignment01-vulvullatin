package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester{
	public static void main(String[] args){
		StreetUSAddress streetAddressOne = new StreetUSAddress("123 House Street", "", "Woodbridge", "VA", "22193");
		StreetUSAddress streetAddressTwo = new StreetUSAddress("123 Apartment Street", "Apartment 1", "Woodbridge", "VA", "22193");
		System.out.println(streetAddressOne);
		System.out.println(streetAddressTwo);
		try(PrintWriter output = new PrintWriter(new FileOutputStream(
			new File("output.txt"), true /* true means append to file */))) {
				output.println("\nTESTS FOR StreetUSAddress.java:");

		output.println(streetAddressOne);
		output.println(streetAddressTwo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
