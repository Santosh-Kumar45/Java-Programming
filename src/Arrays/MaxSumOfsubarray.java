package Arrays;

public class MaxSumOfsubarray {
    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max value isi :"+ms);
    }

    public static void main(String[] args) {
        int numbers[]={-2,3,-1,-3,5,2,-3};
        kadanes(numbers);
    }
}
