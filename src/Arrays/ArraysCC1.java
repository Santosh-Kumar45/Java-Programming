package Arrays;
import java.util.*;

public class ArraysCC1 {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
            System.out.print(" "+marks[i]);
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int marks[]={10,20,30};
        update(marks);

    }
}
