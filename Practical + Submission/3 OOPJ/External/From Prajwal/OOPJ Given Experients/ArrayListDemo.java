import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID");
        String bid = sc.next();
        a.add(bid);
        System.out.println("Enter Book Name");
        String book_name = System.console().readLine();
        a.add(book_name);
        System.out.println("Enter Book Author");
        String author = System.console().readLine();
        a.add(author);
        System.out.println("Enter Book Publisher");
        String publisher = System.console().readLine();
        a.add(publisher);
        System.out.println("Enter Book Quantity");
        String quantity = sc.next();
        a.add(quantity);
        System.out.println("\nSize of List is: \n" + a.size());
        System.out.println("List Contains:\n" + a);
        a.remove(3);
        System.out.println("After Removing Publisher :\n" + a + "\n");
    }
}
