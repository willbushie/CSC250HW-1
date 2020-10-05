// main file - William Bushie - CSC250 - Fall 2020

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CSC250HW
{
    public static void main(String[] args) throws Exception
    {        
        // need to create a print of each book, one line as follows "Matthew:28:The Gospel of Christ." 
        // create an arraylist to store each of the books
        ArrayList<String> bookStringArrayList = new ArrayList<String>();
        
        // read in the appropriate data from the file & store in arraylist
        File myObj = new File("input.dat");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine())
        {
            String data = myReader.nextLine();
            bookStringArrayList.add(data);
            //System.out.println(data);
        }
        myReader.close();

/*         // print each index in the array on a line
        System.out.println("\n");
        for (String data : bookStringArray) 
        {
            System.out.println(data);
        }
        System.out.println("\n");
        //System.out.println("completed");
 */    
        // ask user for key word to search
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a keyword to search for:");
        String userInput = input.nextLine();
        input.close();

        // search the arraylist element for the keyword & print whether the key is found or not
        int size = bookStringArrayList.size();
        int index = 0;
        System.out.println("=============================");
        while (index < size)
        {
            String testString = bookStringArrayList.get(index);
            if (testString.contains(userInput))
            {
                System.out.println("This BibleBook contains the keyword:");
                System.out.println(testString);
                return;
                // uncomment (vvv) to find all searches that contain the keyword & comment out the return statement
                //index += 1;
            }
            else
            {
                index += 1;
            }
        }
        // if the key is not found in any of the arraylist objects, print not found
        System.out.println("Keyword was not found within in the search.");
    }    
}
