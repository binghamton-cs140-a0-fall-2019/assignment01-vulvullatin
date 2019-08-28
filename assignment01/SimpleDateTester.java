package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester{
	public static void main(String[] args) {
		SimpleDate d1 = SimpleDate.of(1999, 2, 23);
		SimpleDate d2 = SimpleDate.of(1876, 3, 12);
		System.out.println(d1);
		System.out.println(d2);
	   System.out.println(d1.before(d2));
		System.out.println("Should be false");
		try(PrintWriter output = new PrintWriter(new FileOutputStream(new File("output.txt"), true))) {
			output.println(d1);
			output.println(d2);
			output.println(d1.before(d2));
			output.println("Should be false");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
