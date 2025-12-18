package Arrays;

public class Second_largestElement {
    public static int printSecondLargestElement(int arr[]){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>smax && arr[j]!=max){
                 smax=arr[j];
                }
        }
        return smax;

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,6,7,10,9};
        int result=printSecondLargestElement(arr);
        System.out.println(result);
    }
}
