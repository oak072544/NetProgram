import java.io.*;

public class JavaThread extends Thread {
    public static void main(String[] args) {
        try {
            int in = Integer.parseInt(args[0]);
            JavaThread[] in_t = new JavaThread[in];

            for (int j = 0; j < in_t.length; j++) {
                in_t[j] = new JavaThread(j);
                in_t[j].start();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    public int num;

    public JavaThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(num + " Hello World");
    }
}