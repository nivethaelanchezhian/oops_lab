// ADT Queue implementation using Exception Handling

class Queue {
    private int[] queue;
    private int front, rear, size;

    // Constructor
    Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Insert element into queue
    void enqueue(int value) throws Exception {
        if (rear == size - 1) {
            throw new Exception("Queue Overflow! Queue is full.");
        }

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = value;
        System.out.println(value + " inserted into queue.");
    }

    // Remove element from queue
    int dequeue() throws Exception {
        if (front == -1 || front > rear) {
            throw new Exception("Queue Underflow! Queue is empty.");
        }

        int value = queue[front++];

        if (front > rear) {
            front = -1;
            rear = -1;
        }

        return value;
    }

    // View front element
    int peek() throws Exception {
        if (front == -1 || front > rear) {
            throw new Exception("Queue is empty.");
        }

        return queue[front];
    }

    // Display queue elements
    void display() throws Exception {
        if (front == -1 || front > rear) {
            throw new Exception("Queue is empty.");
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class QueueADT {
    public static void main(String[] args) {

        Queue q = new Queue(3);

        try {
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);

            q.display();

            System.out.println("Front element: " + q.peek());

            System.out.println("Deleted element: " + q.dequeue());
            System.out.println("Deleted element: " + q.dequeue());

            q.display();

            // Uncomment to test underflow
            // q.dequeue();

            // Uncomment to test overflow
            // q.enqueue(40);
            // q.enqueue(50);
            // q.enqueue(60);
            // q.enqueue(70);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
