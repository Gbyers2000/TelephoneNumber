import java.util.*;

public class TelephoneNumber

{

	public static void main (String[] args)

	{

		Scanner userinput = new Scanner(System.in);

		//ask for user input and store the answer as a string
		System.out.println("Please enter a phone number with no hyphens or parentheses: ");
		String PhoneNumber = userinput.nextLine();

		//use substring to obtain the area code
		String AreaCode = PhoneNumber.substring(0,3);

		//use substring to separate the remaining numbers
		String FirstThree = PhoneNumber.substring(3,6);
		String LastFour = PhoneNumber.substring(6,10);

		//print the phone number
		System.out.println("Your phone number is : " + AreaCode + "-" + FirstThree + "-" + LastFour);


	}
}