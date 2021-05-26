import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int countTests=in.nextInt();
        ArrayList<Integer> tests = new ArrayList<>();
        for (int i = 0; i < countTests; i++) {
            tests.add(in.nextInt());
        }
        for (int test:tests) {
            boolean tr = true;
            for (int i = 2; i < test; i++) {
                if(test%i==0){
                    tr = false;
                    break;
                }
            }
            if (tr){
                System.out.println(test+" eh primo");
            }
            else{
                System.out.println(test+" nao eh primo");
            }
        }
    }
}
