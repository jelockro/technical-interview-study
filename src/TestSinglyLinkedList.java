public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();
        myList.addLast("element 1");
        myList.addLast("element 2");
        myList.addLast("element 3");
        myList.addLast("element 4");
        myList.addLast("element 5");
        myList.addLast("element 6");
        while(myList.size() > 0) {
            System.out.println(myList.removeFirst());
        }
        myList.addLast("element 1");
        myList.addLast("element 2");
        myList.addLast("element 3");
        myList.addLast("element 4");
        myList.addLast("element 5");
        myList.addLast("element 6");
        myList.reverseList();
        while(myList.size() > 0) {
            System.out.println(myList.removeFirst());
        }
    }
}
