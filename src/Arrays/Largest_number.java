package Arrays;

public class Largest_number {

    public static int largestNumber(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;  i++){
           if(largest<arr[i]){
               largest=arr[i];
           }
           if(smallest>arr[i]){
               smallest=arr[i];
           }

        }
        System.out.println("smallest num is :"+smallest);
        return largest;


    }

    public static void main(String[] args) {
        int arr[]={10,20,39,49,80};
       int value= largestNumber(arr);
        System.out.println("largest num is :"+value);
    }
}
