package Time_Complexity;

public class TimeComplexity_01 {
    public static void main(String[]args){

        int []arr;
        arr=new int[]{6,3,2,4,1,7,1,5};
         boolean flag=false;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                break;
            }
        }
    }
}
