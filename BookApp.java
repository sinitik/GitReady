public class BookApp
{
    public static void main(String[] args) {
        Book[] library = {new Nonfiction("The Map Thief", "Michael Blanding", "thriller"), new Fiction("Elon Musk", "Walter Isaacson", "Biography")};

        for(Book lib : library)
        System.out.println(lib);
    }
}