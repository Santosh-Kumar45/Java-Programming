package Arrays;
import java.util.*;
public class Matrix {
    public static void main(String[]args){
        int matrix[][]=new int[3][3];
        Scanner input=new Scanner(System.in);
        int row=matrix.length;
        int col=matrix.length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
