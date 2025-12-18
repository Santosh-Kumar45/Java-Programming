package LeetCode_Challenges;

public class Add_Two_Number {
    public static void printTwoarray(int arr1[],int arr2[]){

        int num1=0;
        int num2=0;
        for(int i=arr1.length-1;i>=0;i--){
//           System.out.print(arr1[i]);
            num1=arr1[i];
           System.out.print((int)num1);
        }
        System.out.println();

        for(int i=arr2.length-1;i>=0;i--){
//            System.out.print(arr2[i]);
            num2=arr2[i];
            System.out.print((int)num2);
        }
        System.out.println();
        int num;
        int carry=0;
        for(int i=2;i>=0;i--){
            if((arr1[i]+arr2[i])>=0){
                 num=arr1[i]+arr2[i]+carry;
                 int remender=num%10;
                 System.out.print(remender);
                 int restNum=num;
                 carry=restNum/10;
//
            }
//            else{
//                System.out.print(arr1[i]+arr2[i]);
//            }
        }
//        int num3=num1+num2;
//        System.out.println(num3);
    }




    public static void main(String[] args) {
        int arr1[]={2,4,3};
        int arr2[]={5,6,4};
        printTwoarray(arr1,arr2);

    }
}

