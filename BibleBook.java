// BibleBook class

public class BibleBook 
{
    // create the class attributes
    public String name, summary;
    public int chapters;

    // method for printing all attributes from the books
    public void displayBook()
    {
        System.out.println("Book Description: ");
        System.out.println("Book name:              " + name);
        System.out.println("Number of Chapters:     " + chapters);
        System.out.println("Summary of book:        " + summary + "\n");
    }
}
