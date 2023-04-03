import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //problem 1
        //arrayOne(arr);
        //problem 2
        //arrayAvg(arr);



    }
//problem 1
    public static void arrayOne(int[] arr){
        arrayOneRecursive(arr, arr.length - 1);
    }

    public static void arrayOneRecursive(int[] arr, int n){
        int min = arr[n];
        if(arr[n-1]<min) min = arr[n-1];
        if(n==1) {
            System.out.println(min);
            return;
        }
        arrayOneRecursive(arr,n-1);
    }
    //problem 2
    public static void arrayAvg(int[] arr){
        arrayAvgRecursive(arr, arr.length - 1, 0.0);
    }
    public static void arrayAvgRecursive(int[] arr, int n, double sum){
        sum = sum + arr[n];
        if(n==0){
            System.out.println(sum/arr.length);
            return;
        }
        arrayAvgRecursive(arr, n-1, sum);
    }


}
