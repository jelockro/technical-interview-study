public class TestQueue {
    public static void main(String[] args) {

        QueueExample<String> myQueue = new QueueExample<String>();
        myQueue.enqueue("Person 1");
        myQueue.enqueue("Person 2");
        myQueue.enqueue("Person 3");
        myQueue.enqueue("Person 4");
        myQueue.enqueue("Person 5");

    }
}
