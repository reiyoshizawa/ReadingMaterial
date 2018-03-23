package ReadingMaterial;

public class Novels extends Books{
    protected String primaryCharacters;
    protected String author;

    public Novels(int pages, String title, String primaryCharacters, String author) {
        super(pages, title);
        this.primaryCharacters = primaryCharacters;
        this.author = author;
    }

    public String getPrimaryCharacters() {
        return primaryCharacters;
    }

    public void setPrimaryCharacters(String primaryCharacters) {
        this.primaryCharacters = primaryCharacters;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printInfo() {
        System.out.println("This is a novel with " + pages + " written by " + author);
        System.out.println("The title is " + title);
        System.out.println("main character is " + primaryCharacters);
    }

}
