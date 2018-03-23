package ReadingMaterial;

public class Books {
    protected int pages;
    protected String title;

    public Books(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printInfo() {
        System.out.println("This is a book with " + pages);
        System.out.println("The title is " + title);
    }
}
