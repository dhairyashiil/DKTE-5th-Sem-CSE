import MyMath.*;
import java.util.*;

public class PackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trig n = new Trig(45);
        System.out.println("Sine  " + n.getSine());
        System.out.println("Cosine  " + n.getCoSine());
        System.out.println("Tangent  " + n.getTangent());
        System.out.println("Cotangent  " + n.getCotangent());
        System.out.println("Cosecant  " + n.getCosecant());
        System.out.println("Secant  " + n.getSecant());
        Arithmetic ar = new Arithmetic(37, 5);
        System.out.println("\nAddition  " + ar.getAddition());
        System.out.println("Subtraction  " + ar.getSubtraction());
        System.out.println("Multiplication  " + ar.getMultiplication());
        System.out.println("Division  " + ar.getDivision());
        int a[] = { 23, 52, 30, 14, 45 };
        Stat s = new Stat(a);

        System.out.println("\nMinimum no " + s.min_no());
        System.out.println("Maximum no " + s.max_no());
        System.out.println("Count " + s.count());
        System.out.println("Sum " + s.sum());
        System.out.println("Average " + s.average());
    }
}

package MyMath;

public class Arithmetic {
    float a;
    float b;

    public Arithmetic(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getAddition() {
        return a + b;
    }

    public float getSubtraction() {
        return a - b;
    }

    public float getMultiplication() {
        return a * b;
    }

    public float getDivision() {
        return a / b;
    }
}

package MyMath;

public class Stat {
    int[] a;

    public Stat(int[] a) {
        this.a = a;
    }

    public int min_no() {
        int i, min = a[0];
        for (i = 0; i < a.length; i++) {
            min = (a[i] < min) ? a[i] : min;
        }
        return min;
    }

    public int max_no() {
        int i, max = a[0];
        for (i = 0; i < a.length; i++) {
            max = (a[i] > max) ? a[i] : max;
        }
        return max;
    }

    public int count() {
        return a.length;
    }

    public int sum() {
        int i, s = 0;
        for (i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }

    public float average() {
        return (sum() / count());
    }
}

package MyMath;

public class Trig {
    double angle;

    public Trig(double ang) {
        angle = Math.toRadians(ang);
    }

    public double getSine() {
        double a = Math.sin(angle);
        return a;
    }

    public double getCoSine() {
        double a = Math.cos(angle);
        return a;
    }

    public double getTangent() {
        double a = Math.tan(angle);
        return a;
    }

    public double getCotangent() {
        double a = 1 / Math.tan(angle);
        return a;
    }

    public double getCosecant() {
        double a = 1 / Math.sin(angle);
        return a;
    }

    public double getSecant() {
        double a = 1 / Math.cos(angle);
        return a;
    }
}