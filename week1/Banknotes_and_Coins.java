import java.util.Scanner;

public class Banknotes_and_Coins{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float d = in.nextFloat();
        int N = (int)d;
        float F = (d-N);
        System.out.println("NOTAS:");
        System.out.print((N/100)+ " nota(s) de R$ 100.00\n");
        N-=(N/100)*100;
        System.out.print((N/50)+ " nota(s) de R$ 50.00\n");
        N-=(N/50)*50;
        System.out.print((N/20)+ " nota(s) de R$ 20.00\n");
        N-=(N/20)*20;
        System.out.print((N/10)+ " nota(s) de R$ 10.00\n");
        N-=(N/10)*10;
        System.out.print((N/5)+ " nota(s) de R$ 5.00\n");
        N-=(N/5)*5;
        System.out.print((N/2)+ " nota(s) de R$ 2.00\n");
        N-=(N/2)*2;
        System.out.print("MOEDAS:\n");
        System.out.print(N + " moeda(s) de R$ 1.00\n");
        System.out.print((int)(F/0.50)+" moeda(s) de R$ 0.50\n");
        F-=(int)(F/0.50)*0.50;
        System.out.print((int)(F/0.25)+" moeda(s) de R$ 0.25\n");
        F-=(int)(F/0.25)*0.25;
        System.out.print((int)(F/0.10)+" moeda(s) de R$ 0.10\n");
        F-=(int)(F/0.10)*0.10;
        System.out.print((int)(F/0.05)+" moeda(s) de R$ 0.05\n");
        F-=(int)(F/0.05)*0.05;
        System.out.print((int)((F+0.001)/0.01)+" moeda(s) de R$ 0.01\n");
        in.close();
    }
}