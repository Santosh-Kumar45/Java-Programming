package Sorting;

public class CheckArrayisSorted {
    public static void main(String[] args) {
        int arr[]={50,10,30,50};
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    System.out.println("Array is not sorted");
                    break;
                }
                else
                {
                    System.out.println("Array is sorted");
                    break;
                }
        }
    }
}
