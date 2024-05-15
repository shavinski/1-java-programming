package part4.ObjectsInAList;

public class Book {
    private String name;
    private int pages;
    private int publicationYear;

    public Book() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
