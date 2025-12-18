package Stacks;
import java.util.Stack;
public class InsertAtBottom {
    public static void main(String[]args){
        Stack<Integer> st=new Stack<>();
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        Stack<Integer> rt=new Stack<>();
        rt.push(70);
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
    }
}
