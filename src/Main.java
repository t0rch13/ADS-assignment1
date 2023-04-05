import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();

//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//          arr[i] = sc.nextInt();
//        }

        String str = sc.next();

//        problem 1
//        arrayOne(arr);
//        problem 2
//        arrayAvg(arr);
//        problem 3
//        isPrime(n);
//        problem 4
//        factorial(n);
//        problem 5
//        System.out.println(fibonacci(n));
//        problem 6
//        System.out.println(power(a,n));
//        problem 7
//        permutations(str);
//        problem 8
//        checkDigit(str);
//        problem 9

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
    //problem 3
    public static void isPrime(int n){
        isPrimeRecursive(n,0, 1);
    }
    public static void isPrimeRecursive(int n,int i, int start){
        double limit = Math.sqrt(n);
        if(n%start == 0){
            i++;
        }
        if(i == 2) {
            System.out.println("Composite");
            return;
        }
        if(start > limit & i < 2){
            System.out.println("Prime");
            return;
        }
        isPrimeRecursive(n,i,start+1);
    }
    //problem 4
    public static void factorial(int n){
        factorialRecursive(n, 1, 1);
    }
    public static void factorialRecursive(int n, int start, int factorial){
        factorial = factorial * start;
        if(start == n) {
            System.out.println(factorial);
            return;
        }
        factorialRecursive(n,start+1,factorial);
    }
    //problem 5
    public static int fibonacci(int n){
        if(n < 2) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
    //problem 6
    public static int power(int a, int n){
        if (n == 0) return 1;
        if (n == 1) return a;
        return power(a,n-1)*a;
    }
    //problem 7
    public static void permutations(String str){
        char[] charStr = str.toCharArray();
        permutationsRecursive(charStr, 0);
    }
    public static void permutationsRecursive(char[] arr,int i){
        if(i == arr.length - 1){
            System.out.println(arr);
            return;
        }

        for (int j = i ; j < arr.length; j++) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            permutationsRecursive(arr,i+1);
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    //problem 8
    public static void checkDigit(String str){
        char[] charStr = str.toCharArray();
        checkDigitRecursive(charStr, 0);
    }

    public static void checkDigitRecursive(char[] arr,int n) {
        if (n == arr.length){
            System.out.println("Yes");
            return;
        }
        if (Character.isLetter(arr[n])){
            System.out.println("No");
            return;
        }
        checkDigitRecursive(arr,n+1);
    }



}
