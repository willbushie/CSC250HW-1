// William Bushie - CSC250 - Fall 2020
import java.util.*;

public class CSC250HW
{
    public static void main(String[] args)
    {
        // print statment & creation of user input value | 101110101101
        System.out.println("\nEnter the binary string to convert to hexadecimal:");
        Scanner userInput = new Scanner(System.in);
        String inputString = userInput.nextLine();

        // call binaryToHex method
        binaryToHex(inputString);
    }

    public static void binaryToHex(String binaryNumberString)
    {
        //binaryNumberString = "101110101101";
        // create dictionary for corresponding hex & binary values
        HashMap<String, String> binaryToHexDictionary = new HashMap<String, String>();
            binaryToHexDictionary.put("0000","0");
            binaryToHexDictionary.put("0001","1");
            binaryToHexDictionary.put("0010","2");
            binaryToHexDictionary.put("0011","3");
            binaryToHexDictionary.put("0100","4");
            binaryToHexDictionary.put("0101","5");
            binaryToHexDictionary.put("0110","6");
            binaryToHexDictionary.put("0111","7");
            binaryToHexDictionary.put("1000","8");
            binaryToHexDictionary.put("1001","9");
            binaryToHexDictionary.put("1010","A");
            binaryToHexDictionary.put("1011","B");
            binaryToHexDictionary.put("1100","C");
            binaryToHexDictionary.put("1101","D");
            binaryToHexDictionary.put("1110","E");
            binaryToHexDictionary.put("1111","F");

        // check to make sure length is divisible by 4 evenly & fix if not
        while (binaryNumberString.length() % 4 != 0)
        {
            binaryNumberString = "0" + binaryNumberString;
        }

        // separate into groups of 4
        char[] binaryCharArray = binaryNumberString.toCharArray();
        ArrayList<String> binaryStringArrayList = new ArrayList<String>();
        for (int i = 0; binaryCharArray.length > i; i++)
        {
            char charHolderVariable = 'a';
            charHolderVariable = binaryCharArray[i];
            String stringHolderVariable = "";
            stringHolderVariable = stringHolderVariable + charHolderVariable;
            binaryStringArrayList.add(stringHolderVariable);
        }

        ArrayList<String> binaryGroupsArrayList = new ArrayList<String>();
        String tempHoldString = "";
        int binaryArrayIndex = binaryStringArrayList.size();
        for (int i = 0; binaryArrayIndex > i ;i = i + 4) 
        {
            tempHoldString = binaryStringArrayList.get(i) + binaryStringArrayList.get(i+1) + binaryStringArrayList.get(i+2) + binaryStringArrayList.get(i+3);
            binaryGroupsArrayList.add(tempHoldString);
        }

        // check each string against dictionary & create new string
        String finalHexString = "";
        int lastArrayIndex = binaryGroupsArrayList.size()-1;
        for (String group : binaryGroupsArrayList) 
        {
            finalHexString = finalHexString + binaryToHexDictionary.get(group);
            System.out.println("finalHexString beind built up: " + finalHexString);
            if (group == binaryGroupsArrayList.get(lastArrayIndex))
            {
                // print statement of binary string from hexadecimal string
                System.out.println("\n" + "The binary number " + "\"" + binaryNumberString + "\"" + " becomes " + "\"" + finalHexString+ "\"" + " in hexadecimal.");
            }
            else
            {
                System.out.println("Value did not process correctly");
            }
        }
    }
}
