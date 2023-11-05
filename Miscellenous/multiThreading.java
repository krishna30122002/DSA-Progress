// Question 1

// public class multiThreading extends Thread{
//     public void run(){
//         System.out.println("Thread is Running");
//     }
//     public static void main(String[] args){
//         multiThreading obj=new multiThreading();
//         obj.start();
//     }
// }

//Question 2

// class parent {
//     parent() {
//         System.out.println("I am the constructor of Parent Class.");
//     }
// }

// public class multiThreading extends parent implements Runnable {
//     public void run() {
//         try {
//             System.out.println("Thread " + Thread.currentThread().getId() + " is Running");
//         } catch (Exception e) {
//             System.out.println("Exception is caught");
//         }
//     }

//     public static void main(String[] args) {
//         for (int i = 0; i < 2; i++) {
//             Thread obj = new Thread(new multiThreading());
//             obj.start();
//         }
//     }
// }

//Question 3

class parent {
    parent(String s) {
        System.out.println(s);
    }
}

public class multiThreading extends parent implements Runnable {
    public static void main(String[] args) {
        super(parent);
        multiThreading obj=new multiThreading("NITP");
        obj.start();
    }
}