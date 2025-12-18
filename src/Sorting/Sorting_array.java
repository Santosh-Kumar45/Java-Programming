package Sorting;
public class Sorting_array {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("unsorted array");
            }
            else {
                System.out.print("sorted array");
            }
        }
    }
}
