package Arrays;

public class SumOf_TwoNumber {
    public static void printSum(int arr[],int target){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,7};
        int target=8;
        printSum(arr,target);
    }
}
