package Arrays;


public class sprial_matrixRevision {
    public static void printSprialMatrix(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix.length-1;
        while(startRow<=endRow && startCol<=endCol){

            //top part
            for(int i=startRow;i<=endCol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            //right part
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom part
            for(int i=endCol-1;i>=startCol;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            //left part
            for(int i=endRow-1;i>=startRow+1;i--){
                if(endRow==startRow){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            //reapting part for small circle
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();


    }



    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8} };
        printSprialMatrix(matrix);

    }
}
