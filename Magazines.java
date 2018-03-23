package ReadingMaterial;

public class Magazines extends Books{
    protected String topic;
    protected String genre;

    public Magazines(int pages, String title, String topic, String genre) {
        super(pages, title);
        this.topic = topic;
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void printInfo() {
        System.out.println("This is a magazine with " + pages);
        System.out.println("The title is " + title);
        System.out.println("The book genre is" + genre + "featured topic is " + topic);
    }

}
