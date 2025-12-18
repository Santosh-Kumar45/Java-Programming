package Method;

import static Method.PrimeNumber.isPrime;

public class Prime_in_Range {

    public static void primeInRanges(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(" "+i);
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primeInRanges(20);
    }
}
