package Arrays;

public class Wave_arrays {
    public static void printWave(int arr[]){
        for(int i=0;i<arr.length-1;i=i+2){
            if(arr[i]<arr[i+1]){
                int temp;
                arr[i]=arr[i+1];
                temp=arr[i];
                arr[i+1]=temp;
            }
        }for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printWave(arr);
    }
}
