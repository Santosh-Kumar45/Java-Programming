package Method;

public class CallByValue {
    public static void changeA(int a){
         a=30;

    }
    //finding binomial Coefficient.
    public static int binomialCoefficient(int n,int r){
        int N=factorial(n);
        int R=factorial(r);
        int NmR=factorial(n-r);
        int cal=N/(R*NmR);
        return cal;
    }

    //finding factorial.
    public static int factorial(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        return f;
    }




    public static void main(String[] args) {
        int a=6;
        changeA(a);
//        System.out.println(a);
//        System.out.println("factorial sum is:"+factorial(10));

        int binomialSum= binomialCoefficient(5,2);
        System.out.println("Total binomial Sum is :"+binomialSum);
    }



}
