// thread class
public class parent extends Thread
{
    String name;
    int[] ar;
    int begin, end;

    public parent(String string, int[] ar, int begin, int end) 
    {
        this.name = name;
        this.ar = ar;
        this.begin = begin;
        this.end = end;
	}

	public void run()
    {
        sorting.mergeSort(ar, begin, end);
    }
}
