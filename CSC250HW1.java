// William Bushie - CSC250 - Fall 2020
import java.util.Scanner;

public class CSC250HW1
{
    public static void main(String[] args)
    {
        // creation of all necessary variables
        int vowelCount = 0;
        
        // print statment & creation of user input value 
        System.out.println("\nEnter text to find vowels within?");
        Scanner userInput = new Scanner(System.in);
        String bookInitial = userInput.nextLine();

        // Change string into lowercase
        String bookLowerCase = bookInitial.toLowerCase();

        // creation and execution of for loop and if loop
        for(int x = 0; x < bookLowerCase.length(); x++)
        {
            if(bookLowerCase.charAt(x) == 'a' || bookLowerCase.charAt(x) == 'e' || bookLowerCase.charAt(x) == 'i' || bookLowerCase.charAt(x) == 'o' || bookLowerCase.charAt(x) == 'u')
            {
                vowelCount++;
            }
        }

        // print statement of total vowels found in string
        System.out.println("\n" + "Total number of vowels found within " + "\"" + bookInitial + "\"" + " is " + vowelCount + ".");
    }
}