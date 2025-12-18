package Arrays;

public class SubArrays {
    public static void printSubArrays(int arr[]){
        int totalsubarray=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print(arr[k]+" ");
                }
                totalsubarray++;
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("total sub array is :"+totalsubarray);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        printSubArrays(arr);
    }
}
