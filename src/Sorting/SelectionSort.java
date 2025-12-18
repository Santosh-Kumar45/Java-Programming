package Sorting;

public class SelectionSort {
    public static void selectionSorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp;
            temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,4,6,2,9};
        selectionSorting(arr);
        printArr(arr);
    }
}
