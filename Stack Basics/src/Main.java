import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //CREATE STACK
        Stack<Integer>st = new Stack<>();
        //TO PUSH OR ADD THE ELEMENTS
        st.push(20);
        st.push(30);
        st.push(100);
        //TO KNOW THE NUMBER OF ELEMENTS IN STACK
        System.out.println(st.size());

        //TO KNOW THE FIRST/TOP ELEMENT OF THE STACK
        System.out.println(st.peek());

        //TO DELETE THE ELEMENT FROM STACK
        st.pop();
    }
}
