
import java.io.*;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) throws IOException {
        int RollNo;
        long mob;
        String name, clas, email;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter RollNo");
        RollNo = sc.nextInt();
        System.out.println("Enter Class");
        class = sc.next();
        System.out.println("Enter MobNo");
        mob = sc.nextLong();
        System.out.println("Enter email");
        email = sc.next();
        try (FileOutputStream fos = new FileOutputStream("studfile.txt");
                DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeInt(RollNo);
            dos.writeUTF(name);
            dos.writeUTF(clas);
            dos.writeLong(mob);
            dos.writeUTF(email);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream("studfile.txt");
                DataInputStream dis = new DataInputStream(fis)) {
            System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("\nRoll No : " + dis.readInt());
            System.out.println("Name : " + dis.readUTF());
            System.out.println("Class : " + dis.readUTF());
            System.out.println("Mob No : " + dis.readLong());
            System.out.println("E-mail : " + dis.readUTF());
            System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
