public class TestStack {
    public static void main(String args[]){
        Stack<String> myStack = new Stack<String>();
        myStack.push("Person 1");
        myStack.push("Person 2");
        myStack.push("Person 3");
        myStack.push("Person 4");
        myStack.push("Person 5");
        System.out.println(myStack.size());
        System.out.println(myStack.top());
        System.out.println(myStack.size());
        while (myStack.size() > 0 ){
            myStack.pop();
        }
    }
}
