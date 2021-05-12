import java.util.Scanner;
public class Population_Increase{
    public static void main(String agrs[]) {
        Scanner in = new Scanner(System.in);
        int n, counter;
        int PA , PB ;
        double G1 , G2;
        n = in.nextInt();
        for (int m = 1; m <= n; m++) {
            counter = 0;
            PA  = in.nextInt();
            PB  = in.nextInt();
            G1  = in.nextDouble();
            G2 = in.nextDouble();
            while (PA  <= PB ) {
                PA  *= (G1  / 100.0) + 1.0;
                PB  *= (G2 / 100.0) + 1.0;
                counter++;
                if (counter > 100) {
                    System.out.print("Mais de 1 seculo.\n");
                    break;
                }
            }
            if (counter <= 100) {
                System.out.printf("%d anos.\n", counter);
            }
        }
    }
}