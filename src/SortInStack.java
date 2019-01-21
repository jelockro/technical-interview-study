public class SortInStack {

    private static Stack putInStack(String stringToPush) {
        Stack<Integer> myStack = new Stack<Integer>();
        for (char c : stringToPush.toCharArray()){
            int y = c - '0';
            myStack.push(y);
        }
        return myStack;
    }

    private static String sort(String stringToSort) {
        Stack a = putInStack(stringToSort);
        Stack<Integer> b = new Stack<Integer>();
        Stack<Integer> c = new Stack<Integer>();
        String myString = "";

        while (!a.isEmpty()) {
            // if there is an empty slot
            if (b.isEmpty()) {
                b.push((Integer) a.pop());
            } else if (c.isEmpty()) {
                c.push((Integer) a.pop());
            }
            if (!b.isEmpty() && !c.isEmpty()) {
                // if b or c only have one item
                if (b.top() > c.top()) {
                    if (c.size() == 1) {
                        b.push(c.pop());
                    } else {
                        while (!c.isEmpty()) {
                            a.push(c.pop());
                        }
                    }
                } else if (c.top() > b.top()) {
                    if (b.size() == 1) {
                        c.push(b.pop());
                    } else {
                        while (!b.isEmpty()) {
                            a.push(b.pop());
                        }
                    }
                }
            }

            if (!b.isEmpty() && !c.isEmpty()){
                // if one c or b are > 1 and a < (b || c)
                if ((int) a.top() < b.top() && (int) a.top() < c.top()) {
                    if (b.top() < c.top()) {
                        b.push((Integer) a.pop());
                    } else {
                        c.push((Integer) a.pop());
                    }

                } else if ((int) a.top() < b.top()) {
                    b.push((Integer) a.pop());
                } else if ((int) a.top() < c.top()) {
                    c.push((Integer) a.pop());
                }
            }


        }

        while (!b.isEmpty()) {
            myString += Integer.toString(b.pop());
        }
        while (!c.isEmpty()) {
            myString += Integer.toString(c.pop());
        }



        System.out.println(myString);
        return myString;
    }

    public static void main(String[] args) {
        sort("635241");
    }

}
