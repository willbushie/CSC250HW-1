// main file - William Bushie - CSC250 - Fall 2020

public class CSC250HW
{
    public static void main(String[] args) 
    {        
        // create the objects in the class
        BibleBook book1 = new BibleBook();
        BibleBook book2 = new BibleBook();
        BibleBook book3 = new BibleBook();

        // add attributes to all books
        book1.name = "Matthew";
        book1.chapters = 28;
        book1.summary = "the Gospel of Jesus Christ";

        book2.name = "Mark";
        book2.chapters = 16;
        book2.summary = "focuses on the death of Jesus";

        book3.name = "Luke";
        book3.chapters = 24;
        book3.summary = "covers Jesus' origin, birth, death, resurection and ascension";
    
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
    }    
}
