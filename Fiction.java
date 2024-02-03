public class Fiction extends Book{
    private String genre;

    public Fiction(String title, String author, String genre)
    {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        return String.format("%s:%s", super.toString(), genre);
    }
}