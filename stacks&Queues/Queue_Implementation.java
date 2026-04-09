import java.util.Scanner;

class QueueDemo {
    int queue[];
    int front, rear, size;

    QueueDemo(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " removed from queue");
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueDemo q = new QueueDemo(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();
    }
}
