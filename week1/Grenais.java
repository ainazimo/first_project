import java.util.Scanner;
public class Grenais{
    public static void main(String agrs[]) {
        Scanner in = new Scanner(System.in);
        int I=0,G=0;
        int i=0;
        int Empates=0;
        while (true){
            i++;
            int x1 = in.nextInt();
            int x2 = in.nextInt();
            if (x1>x2){
                I++;
            }
            else if (x2>x1){
                G++;
            }
            else {Empates++;I++;G++;}
            int id = in.nextInt();
            if (id==2){
                break;
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.println("Novo grenal (1-sim 2-nao)");
        }
        System.out.println(i+" grenais");
        System.out.println("Inter:"+I);
        System.out.println("Gremio:"+G);
        System.out.println("Empates:"+Empates);
        if (I!=G){
            if (I>G){
                System.out.println("Inter venceu mais");
            }
            else System.out.println("Gremio venceu mais");
        }
        else System.out.println("Não houve vencedor");
    }
}