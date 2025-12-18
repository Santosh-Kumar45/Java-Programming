package Time_Complexity;

public class Brute_Force {
    public static void main(String[]args){
        int sum=0;
        int arr[]={3,4,6,5,2,6};
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            sum+=arr[i];
        }
        int s=n*(n+1)/2;
        System.out.println(sum-s);
    }
}
