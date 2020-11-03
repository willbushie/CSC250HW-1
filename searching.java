public class searching
{
    // binary search method
    static boolean binarySearchNoRec(int[] ar, int valueToSearchFor)
    {
        int begin = 0;
        int end = ar.length-1;
        int middle;

        do 
        {
            middle = (end + begin) / 2;
            if (ar[middle] == valueToSearchFor)
            {
                System.out.println("INTO FIRST IF");
                return true;
            }
            else if (valueToSearchFor < ar[middle])
            {
                end = middle-1;
                System.out.println("END: " + end);
            }
            else
            {
                begin = middle+1;
                System.out.println("BEGIN: " + begin);
            }
        }
        while (end <= middle+1);
        System.out.println("INTO WHILE");
        return false;
    }

    static int binarySearchRec(int[] ar, int begin, int adjLength, int searchVal)
    {
        if (adjLength >= begin)
        {
            // create int middle (for index)
            int middle = begin + (adjLength - begin) / 2;
            // if searchVal is middle
            if (ar[middle] == searchVal)
            {
                // to return index
                return middle;
            }
            // if smaller than middle (in left side of array)
            if (ar[middle] > searchVal)
            {
                //recursion
                return binarySearchRec(ar, begin, middle-1, searchVal);
            }
            //else (in right side of array)
            return binarySearchRec(ar, middle+1, adjLength, searchVal);
        }
        // if nothing was found
        return -1;
    }

    // method to determin if value is within an array
    static boolean isInArray(int value)
    {
        if (value < 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}