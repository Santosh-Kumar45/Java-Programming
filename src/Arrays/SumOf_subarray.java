package Arrays;

public class SumOf_subarray {
    public static void printSumOfSubarray(int arr[]){
        int sum=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
//            sum+=arr[start];
            for(int j=i;j<arr.length;j++){
                int end=j;

                sum1+=arr[end];

                for(int k=start;k<end;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.println("");

            }
            if(sum>arr[i]){
                System.out.println("greater");
            }
            else System.out.println("smaller");

        }
//        System.out.println("sum of subarray is :"+sum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSumOfSubarray(arr);
    }
}
