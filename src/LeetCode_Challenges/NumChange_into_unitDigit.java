package LeetCode_Challenges;

public class NumChange_into_unitDigit {
    public static void main(String[] args) {
        int Num=78;
        int sum=0;
        int res=0;
        for(int i=0;i<2;i++){
            if(Num>=10){
                int remenderNum=Num%10;
                System.out.println(remenderNum);
                int restNum=Num;
                int divNum=restNum/10;
                System.out.println(divNum);
                sum=sum+remenderNum+divNum;

                 res=sum-res;
                Num=sum;
            }else
                break;

        }
        System.out.println(res);
    }
}
