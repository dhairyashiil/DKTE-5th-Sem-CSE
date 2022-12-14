import java.util.Random;


public class RandomNumberThreading{
    public static void main(String[] args){
        RandomNumberThread r = new RandomNumberThread();
        r.start();
    }
}
class RandomNumberThread extends Thread{
    public void run(){
        Random n = new Random();
        for(int i=0;i<10;i++){
            int randomInt = n.nextInt(100);
            System.out.println("Random Integer is "+randomInt);
            SquareThread  s = new SquareThread(randomInt);
            s.start();
            CubeThread c = new CubeThread(randomInt);
            c.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Thread sleeps");
            }
        }
    }
}
class SquareThread extends Thread{
    int num;
    SquareThread(int n){
         num = n;
    }
    public void run(){
        System.out.println("Square of "+num+" is "+num*num);
    }
}
class CubeThread extends Thread{
    int num;
    CubeThread(int n){
         num = n;
    }
    public void run(){
        System.out.println("Square of "+num+" is "+num*num*num);
    }
}