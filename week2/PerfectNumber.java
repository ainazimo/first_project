import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int countTests=in.nextInt();
        ArrayList<Integer> tests = new ArrayList<>();
        for (int i = 0; i < countTests; i++) {
            tests.add(in.nextInt());
        }
        for (int test:tests) {
            int sum_number=0;
            for (int i = 1; i < test; i++) {
                if(test%i==0){
                    sum_number+=i;
                }
            }
            if (sum_number==test){
                System.out.println(test+" eh perfeito");
            }
            else{
                System.out.println(test+" nao eh perfeito");
            }
        }
    }
}
