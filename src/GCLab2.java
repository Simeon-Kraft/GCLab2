
import java.util.Scanner;
public class GCLab2 {

	/*
	 * 	Calculate the perimeter and area of various classrooms.
	 * 	Additionally, calculate the volume of the rooms.
	 *  Loop the application as desired by the user.
	 * 
	 */

	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String userInput;
		String userContinue = "y";	
		
		System.out.println("This program calculates the area, perimeter, and volume of a given classroom.");
		
		
		do {
		
		System.out.println("Please enter the room's length in feet: ");
			double length = scnr.nextDouble();
			
		System.out.println("Next, enter the room's width in feet: ");
			double width = scnr.nextDouble();
			
		System.out.println("Lastly, enter the room's height in feet: ");
			double height = scnr.nextDouble();
			
			double area = (length * width);
			double perimeter = ((length*2) + (width*2));
			double volume = (length*width*height);
			
			
		System.out.println("The room's demensions are as follows: ");
		System.out.println("Area: " + area + "ft.");
		System.out.println("Perimeter: " + perimeter + "ft." );
		System.out.println("Volume: " + volume + "ft.");
		
		System.out.println("Would you like to go again? Press (y) to continue or any other key to exit.");
		userInput = scnr.next();
		
		} while((userInput.equals(userContinue))); {
			System.out.println("Goodbye.");
		}
	
	} 
	
}
