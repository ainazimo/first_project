import java.util.Scanner;

public class FibonacciArray {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        long[] fibonacci = new long[62];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for (int i=2;i<62;i++){
            fibonacci[i] = fibonacci[i-2]+fibonacci[i-1];
        }

        int n = in.nextInt();
        int[] tests = new int[n];
        for (int i = 0; i < n; i++) {
            tests[i]= in.nextInt();
        }
        for (int index : tests){
            System.out.println("Fib(" + index + ") = " + fibonacci[index]);
        }
    }
}
