package LeetCode_Challenges;

public class Swapping_last_AndFirst {
    public static void printReverse(int arr[]){
        for(int i=0;i<arr.length;i++){
            int n=arr.length-1;
            int temp=arr[n];
            arr[n]=arr[i];
            arr[i]=temp;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};


      printReverse(arr);

    }
}
