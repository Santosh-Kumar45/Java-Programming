package Stacks;


import java.util.Stack;
public class BasicOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());


        System.out.println(st);
        System.out.println("size is "+st.size());
        st.push(1);
        System.out.println(st);
        System.out.println("size is "+st.size());
        st.push(23);
        System.out.println(st);
        System.out.println("size is "+st.size());
        st.push(90);
        System.out.println(st);
        System.out.println("size is "+st.size());
        st.push(5);
        System.out.println(st);
        System.out.println("size is "+st.size());
        st.push(35);
        System.out.println(st);
        System.out.println("size is "+st.size());
        System.out.println(st.isEmpty());



//
//        while(st.size()>1){
//            st.pop();
//        }
//        System.out.println(st.peek());
   }
}
