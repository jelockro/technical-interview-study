import java.util.LinkedList;
import java.util.Queue;

public class QueueExample<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    // constructor
    public QueueExample(){}

    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public void enqueue(E element) {
        list.addLast(element);
    }

    public void dequeue() {
        list.removeFirst();
    }
    public E first() {
        return list.first();
    }


}
