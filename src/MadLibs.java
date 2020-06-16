import java.util.Scanner;


public class MadLibs {

	public static void main(String[] args) {
		String color;
		String pastTenseVerb;
		String adjective;
		String noun;
		
		Scanner scan = new Scanner(System.in);
		
		// Get the input from the user. Save each input to the correct variable.
		System.out.println("Welcome to Mad Libs!\n");
		
		System.out.println("Please enter a color.");
		color = scan.next();
		
		System.out.println("Please enter a past tense verb.");
		pastTenseVerb = scan.next();
		
		System.out.println("Please enter an adjective.");
		adjective = scan.next();
		
		System.out.println("Please enter a noun.");
		noun = scan.next();
		
		// Construct the madLIb
		String madLibBeginning = "The " + color + " dragon " + pastTenseVerb + " at the " + adjective;
		String madLibEnd = " knight, who rode in on a sturdy, giant " + noun + ".";
		
		// Print the message to the user.
		System.out.print(madLibBeginning);
		System.out.println(madLibEnd);

	}

}
