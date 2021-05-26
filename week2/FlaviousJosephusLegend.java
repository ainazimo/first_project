import java.util.ArrayList;
import java.util.Scanner;

public class FlaviousJosephusLegend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int l=0;l<n;l++){
            int x1 = in.nextInt(), x2 = in.nextInt();
            ArrayList<Integer> result = new ArrayList<Integer>(x1);
            for (int i = 1; i <= x1; i++)
                result.add(i);
            int i = 0, j = 0;
            while(x1 > 1) {
                j = (++j) % x2;
                if(j == 0) {
                    x1--;
                    result.remove(i);
                } else {
                    i = (++i) % x1;
                }
            }
            System.out.println("Case "+(l+1)+": "+ result.get(0));
        }
    }
}
