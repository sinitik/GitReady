public class Nonfiction extends Book {
    private String subject;

    public Nonfiction(String title, String author, String subject)
    {
        super(title, author);
        this.subject = subject;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s:%s", super.toString(), subject);
    }
}