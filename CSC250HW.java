// main file - William Bushie - CSC250 - Fall 2020

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSC250HW
{
    public static void main(String[] args) 
    {        
        // need to create a print of each book, one line as follows "Matthew:28:The Gospel of Christ." 
        // create an array to store each of the books
        String bookStringArray[] = new String[27];
        int count = 0;
        
        // read in the appropriate data from the file & store in array
        try
        {
            File myObj = new File("input.dat");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                bookStringArray[count] = data;
                //System.out.println(data);
                count += 1;
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("error");
            e.printStackTrace();
        }
        
        // print each index in the array on a line
        System.out.println("\n");
        for (String data : bookStringArray) 
        {
            System.out.println(data);
        }
        System.out.println("\n");
        //System.out.println("completed");
    }    
}
