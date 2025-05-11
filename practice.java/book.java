public class book {
    private String title;
    private String author;
    private double price;

  
    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
 public void applyDiscount() {
        this.price -= this.price * 0.10;
    }

   public void displayFinalPrice() {
        System.out.println("Final Price after Discount: " + price);
    }
    public static void main(String[] args) {
        book book = new book("The Great Gatsby", "F. Scott Fitzgerald", 20.00);
        
        System.out.println("Original Price: " + book.price);
        
        book.applyDiscount();
        
        book.displayFinalPrice();
    }
}