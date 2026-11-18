package challanges;

//custom Exceptions
class StackOverFlowException extends Exception {
    public String toString() {
        return "Stack is full!";
    }
}

class StackUnderFlowException extends Exception {
    public String toString() {
        return "Stack is empty!";
    }
}

// define stack
class Stack {
    private int size;
    private int top = -1; // initial condition empty state
    private int S[]; // stack

    // constructor
    public Stack(int size) {
        this.size = size;
        S = new int[size];
    }

    // methods
    public void push(int x) throws StackOverFlowException {
        if (top == size - 1)
            throw new StackOverFlowException();
        top++;
        S[top] = x;
    }

    public int pop() throws StackUnderFlowException {
        int x = -1; //
        if (top == -1)
            throw new StackUnderFlowException();
        x = S[top];
        top--;
        return x;
    }

    public void printStack() {
        System.out.println("=====================");
        for (int i = top; i >= 0; i--) {
            System.out.println(S[i]);
        }
    }

}

public class StackExample {
    public static void main(String[] args) {
        // stack FIFO
        Stack st = new Stack(10);
        try {
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60);
            st.push(70);
            st.push(80);
            st.push(90);
            st.push(100); // last item, stack is full

            // st.push(110); //will show the message and not push it
        } catch (StackOverFlowException e) {
            System.out.println(e);
        }
        // st.printStack(); //print the stack

        try {
            st.pop(); // pop 100

            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop(); //pops 10

            //st.pop(); //nothing here at this points givers msg Stack is empty
        } catch (StackUnderFlowException e) {
            System.out.println(e);
        }

        st.printStack();
    }
}
