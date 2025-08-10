package day_6_assignment.exception_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//4: Multi Exception in One Try Block
//Write a class MultiExceptionDemo:
//•	In a single try block, perform:
//o	Opening a file
//o	Parsing its first line as integer
//o	Dividing 100 by that integer
//•	Use multiple catch blocks in this order:
//1.	FileNotFoundException
//2.	IOException
//3.	NumberFormatException
//4.	ArithmeticException
//•	In each catch, print a tailored message:
//o	File not found
//o	Problem reading file
//o	Invalid number format
//o	Division by zero
//•	Finally, print "Execution completed".


public class MultiExceptionDemo {
	public static void main(String[] args) {

		String filename = "C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\sample.txt";

		try {

			BufferedReader br = new BufferedReader(new FileReader(filename));

			String line = br.readLine();

			int num = Integer.parseInt(line);

			int result = 100 / num;

			System.out.println("Result = " + result);

			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filename);
		} catch (IOException e) {
			System.out.println("Problem reading file: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format in file");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is not allowed");
		} finally {
			System.out.println("Execution completed");
		}
	}
}
