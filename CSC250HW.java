// main file - William Bushie - CSC250 - Fall 2020

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSC250HW {
    // declaring the objects in the class
    String name;
    int chapters;
    String summary;

    // constructor - constructing the objects when called upon. 
    public CSC250HW()
    {
        this.name = name;
        this.chapters = chapters;
        this.summary = summary;
    }

    // method to read in the data from the sheet & create an arraylist
    public static ArrayList<ArrayList<String>> createArrayList() throws FileNotFoundException 
    {
        // create an arraylist to store each string/line from file, of the books
        ArrayList<ArrayList<String>> finalArrayList = new ArrayList<ArrayList<String>>();

        // read in the appropriate data from the file & store in arraylist
        File myObj = new File("input.dat");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine())
        {
            // create string holder and read in from file - contains whole line as string
            String dataReadIn = myReader.nextLine();
            // split dataReadIn into 3 pieces
            String[] dataSplitString = dataReadIn.split(":");
            // correct the mismatch error for types String[] and Array
            //List<String> dataSplitList = Arrays.asList(dataSplitString);
            // add dataSplit to the finalArrayList
            finalArrayList.add(dataSplitString);
        }
        myReader.close();
        return finalArrayList;
    }

    // method to print every book in the arraylist
    public static void printEachBook(ArrayList<String> arrayList)
    {
        // print each index in the array on a line
        System.out.println("\n");
        for (String data : arrayList) 
        {
            System.out.println(data);
        }
        System.out.println("\n");
        //System.out.println("completed");
        //System.out.println(arrayList.get(1));
        
    }

    // method to sort the arraylist by # of chapters - using a buble sort
    public void bubbleSortInt(int arr[]) 
    {
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    }

    // method to sort the arraylist by name alphabetically - using a buble sort
    public void bubbleSortAlpha(String name)
    {

    }

    // Main method
    public static void main(String[] args) throws Exception
    {        
        
    }    
}
