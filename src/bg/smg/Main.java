package bg.smg;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Title1");
        book.setPages(200);
        Price price=new Price();
        price.setValue(35.5);
        price.setCurrency();
    }
}
