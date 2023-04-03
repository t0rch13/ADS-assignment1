import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        arrayOne(arr);//problem 1

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


}
