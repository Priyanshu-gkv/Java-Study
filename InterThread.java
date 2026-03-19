class Q {
    int n;

    synchronized int get() {
        System.out.println("Got : " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Put : " + n);
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) { // infinity loop
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) { // infinity loop
            q.get();
        }
    }
}

// Correct Method
class Q2 {
    int n;
    boolean value = false;

    synchronized int get() {
        while (!value) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("Got : " + n);
        value = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (value) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        this.n = n;
        value = true;
        System.out.println("Put : " + n);
        notify();
    }
}

class Producer2 implements Runnable {
    Q2 q;

    Producer2(Q2 q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) { // infinity loop
            q.put(i++);
        }
    }
}

class Consumer2 implements Runnable {
    Q2 q;

    Consumer2(Q2 q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) { // infinity loop
            q.get();
        }
    }
}

public class InterThread {
    public static void main(String[] args) {
        // Q q = new Q();
        // new Producer(q);
        // new Consumer(q);
        // System.out.println("CTRL + C");

        Q2 q = new Q2();
        new Producer2(q);
        new Consumer2(q);
        System.out.println("CTRL + C");
    }
}
