package ReadingMaterial;

public class TechJournals extends Books{
    protected int publishedYear;

    public TechJournals(int pages, String title, int publishedYear) {
        super(pages, title);
        this.publishedYear = publishedYear;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void printInfo() {
        System.out.println("This journals was published in " + publishedYear);
    }

}
