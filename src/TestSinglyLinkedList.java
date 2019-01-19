public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();
        myList.addLast("element 1");
        myList.addLast("element 2");
        myList.addLast("element 3");
        System.out.println(myList.removeFirst());
    }
}
