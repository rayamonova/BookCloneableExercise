package bg.smg;

public class Book implements Cloneable{
    private String title;
    private Author author;
    private int pages;
    private Price price;

    public Book(String title, Author author, int pages, Price price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public Book() {
        this.author=new Author();
        this.price=new Price();
        this.pages=0;
        this.title="";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
