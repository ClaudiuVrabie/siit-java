package Homework01;

public class Problem2 {



    public static int minValue(int[] arr, int min) {
         min = arr[0];
       int max = arr[7];
        for (int i = 1; i < max; i++) {

            if (arr[i] < min) {
                min = arr[i];
//
            }
        }

        return min;
    }

    public static void main(String[] args){
//
        int arr[]={54, 34, 87, 12, 4, 87, 90};
//
        System.out.println("Smallest: "+minValue(arr,7));
    }
}