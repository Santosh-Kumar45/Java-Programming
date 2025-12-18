package Arrays;

public class Missing_in_Arrays {
    public static int printMissingElements(int arr[]){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int arraySum=0;
        for(int ele:arr){
            arraySum+=ele;
        }
        return sum-arraySum;


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int result=printMissingElements(arr);
        System.out.println(result);
    }
}
