package ReadingMaterial;

public class Driver {
    public static void main(String[] args) {

        Books book01 = new Books(200, "Java");
        book01.printInfo();

        Novels HarukiBook = new Novels(400, "Kafka on the Shore",
                "Kafka", "Haruki Murakami");
        HarukiBook.printInfo();

        Magazines JUMP = new Magazines(250,"Shonen JUMP", "Japanese manga","manga");
        JUMP.printInfo();

        TechJournals NEWTON = new TechJournals(350,"NEWTON", 1983);
        NEWTON.printInfo();

    }
}
