package Arrays;

public class DiagonalMatrix {
  public static int  printDiagonalMatrix(int matrix[][]){
      int sum=0;
//        for(int i=0;i<=matrix.length-1;i++){
//            for(int j=0;j<=matrix[0].length-1;j++){
//                if(i==j){
//                    sum+=matrix[i][j];
//                }
//                else if(i+j==(matrix.length-1)){
//                    sum+=matrix[i][j];
//                }
//            }
//        }
      for(int i=0;i<=matrix.length-1;i++){
          //primary diagonal
          sum+=matrix[i][i];

          //seconday diagonal
          if(i !=matrix.length-1-i){
              sum+=matrix[i][matrix.length-i-1];
          }
      }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8} };
      int result=  printDiagonalMatrix(matrix);
      System.out.println("sum of diagonal is : "+result);
    }
}
