package Method;
import java.util.*;
public class JavaBasics {
    public static void printHelloWorld(){
        System.out.println("hello world!");
    }
    public static void calculateSum(int num1,int num2){            //formal parameter
        System.out.println("sum is :-"+ (num1+num2));
    }

    public static void main(String[] args) {
//        printHelloWorld();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculateSum(a,b);                     //actual parameter,argument
    }
}
