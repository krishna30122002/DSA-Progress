import java.io.*;
import java.lang.*;
import java.util.Scanner;

class m_thread extends Thread {
    private String mssg;

    m_thread(String mssg)
    {
        this.mssg = mssg;
    }

    public void run()
    {

        while (testdemo.start == true) {
            System.out.println(this.mssg);
            try {
                Thread.sleep(5000);
            }
            catch (Exception err) {
            }
        }
    }
}

public class testdemo {
    public static boolean start = true;
    public static void main(String[] args)
    {
        m_thread newThread = new m_thread("Welcome to Java Lab");
        newThread.start();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        testdemo.start = false;
    }
}