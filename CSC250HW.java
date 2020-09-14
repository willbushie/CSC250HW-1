// William Bushie - CSC250 - Fall 2020
import java.util.Scanner;

public class CSC250HW
{
    public static void main(String[] args)
    {
        // creation of all necessary variables
        String binaryString = "";
        int divRemainderResult = 0;
        int divModuloResult = 0;
        
        // print statment & creation of user input value 
        System.out.println("\nEnter the decimal string to convert to binary:");
        Scanner userInput = new Scanner(System.in);
        String inputString = userInput.nextLine();

        // Store string into new holder integer
        int inputInteger = Integer.parseInt(inputString);

        // process of changing decimal to binary numbers
            // loop to find all modulo results & store them
            // store input integer into divRemainderResult
        divRemainderResult = inputInteger;
        for (;divRemainderResult > 0;)
        {
            divModuloResult = (divRemainderResult % 2);
            divRemainderResult = (divRemainderResult / 2);

            // store divModuloResult onto front of binaryInteger
            binaryString = Integer.toString(divModuloResult) + binaryString;
        }

        // print statement of binary string from decimal string
        System.out.println("\n" + "The integer numbers " + "\"" + inputInteger + "\"" + " becomes "+ "\"" + binaryString + "\"" + " in binary.");
    }
}