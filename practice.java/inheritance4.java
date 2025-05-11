class Book {
void read() {
System.out.println("Reading a book");
}
}
class Novel extends Book {
void storyLine() {
System.out.println("The novel has an interesting storyline");
}
}
public class inheritance4 {
public static void main(String[] args) {
Novel n = new Novel();
n.read();
n.storyLine();
}
}