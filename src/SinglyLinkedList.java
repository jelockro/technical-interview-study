

public class SinglyLinkedList<T> {
    private static class Node<T> {
        private T element;
        private Node<T> next;
        public Node(T e, Node<T> n) {
            element = e;
            next = n;

        }
        public T getElement() {
            return element;

        }
        public Node<T> getNext() {
            return next;
        }
        public void setNext(Node<T> n){
            next = n;

        }
    }



    public static void main(String[] args) {

    }
}
