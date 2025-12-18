package Arrays;

public class IndexOfArrays {
    public static int binarySearch(int number[],int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            //comparision.
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
        public static void main (String[] args){
            int number[] = {20,3,4,5,44,6,7};
          int  key = 44;
            int index =binarySearch(number, key);
            System.out.println("index num is :"+index);
        }
    }


