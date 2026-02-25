// First Way to Create Multi-Thread Using Implements Runnable Interface
class NewThread implements Runnable {
    String name;
    Thread t;// Create Instance variable

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println(t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);// When sleep then Main Thread Execute
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

// Second Way to Create Multi-Thread Usind Extends The Original class of Thread

class NewThreadExtend extends Thread {// Here Thread is the Super Class / Parent Class of NewThreadExtend Class
    // When we Extend the Thread class we don't have to declare the instance
    // Variable of Thread type

    NewThreadExtend(String threadName) {
        super(threadName);// super() method calls the constructor of the Thread class Which accept String
        System.out.println("Child Thread " + this);
        start();// we simply call start here
    }

    // entry-point for child thread
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted " + e);
        }
        System.out.println("Child Exit.");
    }
}

public class ConceptThreads {
    public static void main(String[] args) {
        // new NewThread("First");// Start Threads When it is declared
        // new NewThread("Second"); // Multi-Thread
        // new NewThread("Third"); // Multi-Thread

        new NewThreadExtend("First");// Start Threads When it is declared
        new NewThreadExtend("Second"); // Multi-Thread
        new NewThreadExtend("Third"); // Multi-Thread

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread : " + i);
                Thread.sleep(1000);// When Sleep then Child Thread Execute means CPU can not be idle
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Exiting");
    }
}
