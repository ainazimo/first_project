import java.util.Scanner;

public class Column_in_Array{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double[][] N = new double[12][12];

        int C = in.nextInt();
        String T= in.next();

        double result=0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                N[i][j] = in.nextDouble();
                if (j == C) {
                    result = result + N[i][C];
                }
            }
        }
        if (T.equals("S")){
            System.out.printf("%.1f\n",result);
        }
        else if(T.equals("M")){
            result=result/12;
            System.out.printf("%.1f\n",result);
        }
    }
}