
import java.util.*;

public class StackQueueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        System.out.println("1.Stack");
        System.out.println("2.Queue");
        System.out.println("Enter your preference");
        p = sc.nextInt();
        char c;

        switch (p) {
        case 1:
            System.out.println("Enter required size for Stack");
            int size = sc.nextInt();
            StackQueue s1 = new StackQueue(size);
            System.out.println("How many ele do you want to push");
            int n = sc.nextInt();
            System.out.println("Enter data");
            for (int i = 0; i < n; i++) {
                int data = sc.nextInt();
                s1.push(data);
            }
            System.out.println("Current Stack");
            s1.print();
            do {
                System.out.println("\na.push data");
                System.out.println("b.pop data");
                System.out.println("c.Get peak\n");
                System.out.println("Enter key of the operation which you want to perform?");
                char ch = sc.next().charAt(0);

                switch (ch) {
                case 'a':
                    System.out.println("Enter data");
                    int nData = sc.nextInt();
                    s1.push(nData);
                    System.out.println("Current Stack");
                    s1.print();
                    break;
                case 'b':
                    s1.pop();
                    s1.print();
                    break;
                case 'c':
                    System.out.println("Currently top element is " + s1.top());
                    break;
                default:
                    System.out.println("Enter valid input\n");
                    break;
                }
                System.out.println("\nFor continue please enter 'y' or 'Y'");
                c = sc.next().charAt(0);
            } while (c == 'y' || c == 'Y');
            break;

        case 2:
            System.out.println("Enter required size for Queue");
            int siz = sc.nextInt();
            StackQueue s2 = new StackQueue(siz);
            System.out.println("How many ele do you want to enqueu");
            int m = sc.nextInt();
            System.out.println("Enter data");
            for (int i = 0; i < m; i++) {
                int data = sc.nextInt();
                s2.enqueu(data);
            }
            do {
                System.out.println("\na.enqueu data");
                System.out.println("b.dequeu data");
                System.out.println("Enter key of the operation which you want to perform?");
                char ch1 = sc.next().charAt(0);

                switch (ch1) {
                case 'a':
                    System.out.println("Enter data");
                    int nData = sc.nextInt();
                    s2.push(nData);
                    System.out.println("Current Queue");
                    s2.print();
                    break;
                case 'b':
                    s2.dequeue();
                    s2.print();
                    break;
                default:
                    System.out.println("Enter valid input\n");
                    break;
                }
                System.out.println("\nFor continue please enter 'y' or 'Y'\n");
                c = sc.next().charAt(0);
            } while (c == 'y' || c == 'Y');
        default:
            System.out.println("Enter correct preference");
            break;
        }

    }

}

interface StackInterface {
    void push(int data);

    void pop();

    int top();
}

interface QueueInterface {
    void enqueu(int data);

    void dequeue();
}

class StackQueue implements StackInterface, QueueInterface {
    int st[];
    int c;
    int f;

    StackQueue(int size) {
        st = new int[size];
        c = -1;
        f = 0;
    }

    public void print() {
        int i = f;
        for (i = f; i <= c; i++) {
            System.out.print(st[i] + " ");
        }
    }

    @Override
    public void push(int data) {
        if (c == st.length - 1) {
            System.out.print("\nStack overflow");
            return;
        } else {
            st[++c] = data;
        }
    }

    @Override
    public void pop() {
        if (c < 0) {
            System.out.print("\nStack underflow");
            return;
        } else {
            c--;
        }

    }

    @Override
    public int top() {
        if (c < 0) {
            return 0;
        }
        return st[c];
    }

    @Override
    public void enqueu(int data) {
        if (c == st.length - 1) {
            System.out.print("\nQueue overflow");
            return;
        } else {
            st[++c] = data;
        }
    }

    @Override
    public void dequeue() {
        if (f > st.length) {
            System.out.print("\nQueue underflow");
        } else {
            f++;
        }
    }

}
