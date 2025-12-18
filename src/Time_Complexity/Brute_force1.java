package Time_Complexity;

public class Brute_force1 {
    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5};
        int arr2[]={0,0,1,0,0};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<i;j++){
                if((arr1[i] * arr2[j])==0)
                {
                    arr2[j]=1;
                    System.out.println(arr2[j]);
                }
                else{
                    break;
                }
            }
        }
    }
}
