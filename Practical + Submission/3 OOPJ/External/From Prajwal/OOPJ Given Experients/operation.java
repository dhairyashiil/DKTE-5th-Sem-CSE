public class operation {

    static void addition(int a, int b) throws MyException {
        System.out.println("\nIn Addition...");
        int add = a + b;
        if (add > 1000) {
            throw new MyException(" Too long addition Exception Occurs");
        } else {
            System.out.println("Addition is " + add);
        }
    }
    static void subtraction(int a, int b) throws MyException {
        System.out.println("\nIn Subtraction...");
        int sub = a - b;
        if (sub < 0) {
            throw new MyException(" NegativeAnswer Exception Occurs");
        } else {
            System.out.println("Subtraction is " + sub);
        }
    }
    static void multiplication(int a, int b) throws MyException {
        System.out.println("\nIn Multiplication...");
        int mul = a * b;
        if (mul > 5000) {
            throw new MyException(" TooLongMultiplication exception Occurs");
        } else {
            System.out.println("Subtraction is " + mul);
        }
    }
    static void division(int a, int b) throws MyException {
        System.out.println("\nIn Division...");

        if (b == 0) {
            throw new MyException(" Divide by 0 exception Occurs");
        } else {
            int div = a / b;
            System.out.println("Subtraction is " + div);
        }
    }
    public static void main(String[] args) {
        try {
            addition(1000, 200);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            subtraction(50, 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            multiplication(2500, 3);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            division(10, 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}