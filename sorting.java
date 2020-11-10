// class that holds methods for sorting arrays
public class sorting
{
    // merge sort method
    static void mergeSort(int[] ar, int begin, int end)
    {
        if(begin != end)
        {
            int begin1 = begin;
            int end1 = begin + ((end - begin)/2);
            int begin2 = end1 + 1;
            int end2 = end;
			//Runnable r = new MyRunnable(param_value);
			//new Thread(r).start();
			parent p1 = new parent("p2",ar, begin1, end1);
			p1.start();
			//sorting.mergeSort(ar, begin1, end1);
			parent p2 = new parent("p2",ar, begin2, end2);
			p2.start();
			//sorting.mergeSort(ar, begin2, end2);
			try
			{
				// print the total number of threads currently running
				//System.out.println("active threads: " + Thread.activeCount());
				p1.join();
				p2.join();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			sorting.merge(ar, begin1, end1, begin2, end2);
        }
    }

    // merge method
    static void merge(int[] ar, int begin1, int end1, int begin2, int end2)
	{
		int[] temp = new int[end2 - begin1 + 1];
		int pos1 = begin1;
		int pos2 = begin2;
		for(int i = 0; i < temp.length; i++)
		{
			if(pos1 <= end1 && pos2 <= end2)
			{
				if(ar[pos1] < ar[pos2])
				{
					temp[i] = ar[pos1];
					pos1++;
				}
				else
				{
					temp[i] = ar[pos2];
					pos2++;
				}
			}
			else
			{
				//either pos1 or pos2 is off the end of their list and the other guy is the 
				//default winner
				if(pos1 > end1)
				{
					temp[i] = ar[pos2];
					pos2++;
				}
				else
				{
					temp[i] = ar[pos1];
					pos1++;
				}
			}
		} //end of for loop
		
		//copy temp back over ar from begin1 to end2
		int posInTemp = 0;
		for(int i = begin1; i <= end2; i++)
		{
			ar[i] = temp[posInTemp];
			posInTemp++;
		}
	}
}