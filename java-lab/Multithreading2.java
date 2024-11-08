//2.	Write a program using multithreading concept to show the inter thread communication

class SharedResource {
    private int data;
    private boolean dataAvailable = false;

    public synchronized void produce(int value) {
        while (dataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        dataAvailable = true;
        System.out.println("Produced: " + data);
        notify();
    }

    public synchronized void consume() {
        while (!dataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + data);
        dataAvailable = false;
        notify();
    }
}

class Producer implements Runnable {
    private final SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Multithreading2 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
