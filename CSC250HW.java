// main file - William Bushie - CSC250 - Fall 2020

import java.util.Random;


public class CSC250HW 
{
    // main method
    public static void main(String[] args)
    {
        // create random array
        int[] playerAges = new int[5];
        // create new player objects & store into array randomly
        for(int i = 0; i < playerAges.length; i++)
        {
            // generate random int
            Random r = new Random();
            int storedInt = r.nextInt(10);
            Player player = new Player(storedInt);
            //store into array of players at pos i
            playerAges[i] = player.age;
        }

        //int[] testArray = new int[]{7,3,2,6,9};
        //sort array using merge sort | print before & after
        // print before
        System.out.println("BEFORE:");
        CSC250HW.displayArray(playerAges); //(testArray);
        // call merge sort
        sorting.mergeSort(playerAges, 0, playerAges.length-1);//(testArray, 0, testArray.length-1);
        // print after merge sort
        System.out.println("AFTER:");
        CSC250HW.displayArray(playerAges);//(testArray)

        // call binary search to find a player with a certain age
        System.out.println("Seach for specified number (9)");
        System.out.println(searching.isInArray(searching.binarySearchRec(playerAges, 0, playerAges.length-1, 9)));
        //System.out.println(searching.binarySearchNoRec(playerAges, 27));
        /*int test = 4/5;
        System.out.println(test);*/
    }

    // method to display an array
    static void displayArray(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i]);
		}
    }
}
