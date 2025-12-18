package Arrays;

import java.util.ArrayList;

public class ArraylistBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(20);
        arr.add(22);
        arr.add(23);
        arr.add(26);
        arr.set(3,1000);
        System.out.println(arr);
    }
}
