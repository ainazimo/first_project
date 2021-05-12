import java.util.Scanner;
public class Weighted_Averages{
    public static void main(String agrs[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double a;
        double b;
        double c;
        float[] result = new float[n];


        for (int i = 0; i < n; i++)
        {
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();

            result[i] = (float) (((a/10) * 2) + ((b/10) * 3) + ((c/10) * 5));
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f\n",result[i]);
        }
    }
}