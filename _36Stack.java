import java.util.Stack;

public class _36Stack {
    public static void main(String[] args) {
        // Stack implements the List so you can also write as follow
        // List<Integer> l = new Stack<Integer>();
        Stack<String> st = new Stack<>();
        // Stack<String> st = new Stack<String>();
        st.push("test");
        st.peek();
        st.pop();
    }
}
