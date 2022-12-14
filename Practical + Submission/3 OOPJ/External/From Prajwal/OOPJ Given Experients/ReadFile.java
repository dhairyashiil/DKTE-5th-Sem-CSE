
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        System.out.println("enter choice\n");
        System.out.println("1.Read Contents from file\n2.Write in file");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && n < 3) {
            switch (n) {
            case 1:
                try {
                    System.out.println("Enter file Name");
                    String fileName = sc.next();
                    FileInputStream myFile = new FileInputStream(fileName);
                    Scanner scc = new Scanner(myFile);
                    while (scc.hasNextLine()) {
                        String s = scc.nextLine();
                        System.out.println(s);
                    }
                    scc.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Error while Reading file");
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    System.out.println("Enter file Name");
                    String myFile = sc.next();
                    FileOutputStream fileName = new FileOutputStream(myFile);

                    try {
                        sc.nextLine();
                        System.out.println("enter content");
                        String str = sc.nextLine();
                        fileName.write(str.getBytes());
                        System.out.println("content entered succesfully");
                        sc.close();
                    } catch (IOException e) {
                        System.out.println("file does not found");
                        e.printStackTrace();
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Error while Adding Content");
                    e.printStackTrace();
                }
            default:
                break;
            }
        }
    }

}
