class SharedData {
    private int value;
    private boolean available = false;

    // Producer puts data
    synchronized void produce(int value) {
        try {
            while (available) {
                wait();
            }

            this.value = value;
            System.out.println("Produced: " + value);

            available = true;
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Consumer takes data
    synchronized void consume() {
        try {
            while (!available) {
                wait();
            }

            System.out.println("Consumed: " + value);

            available = false;
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Producer extends Thread {
    private SharedData data;

    Producer(SharedData data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.produce(i);
        }
    }
}

class Consumer extends Thread {
    private SharedData data;

    Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();
    }
}
