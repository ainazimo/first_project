import java.util.Scanner;
public class Game_Time_with_Minutes{
    public static void main(String agrs[]){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();

        int h=0,m=0;
        if (x1==y1 && x2==y2){
            h=24;
        }
        else if (x1==y1){
            h=24;
            if (y2>=x2){
                h=0;
                m=y2-x2;
            }
            else{
                h--;
                m=60-(x2-y2);
            }
        }
        else if (y1>x1){
            h=y1-x1;
            if (y2>=x2){
                m=y2-x2;
            }
            else{
                h--;
                m=60-(x2-y2);
            }
        }
        else{
            h=24-(x1-y1);
            if (y2>=x2){
                m=y2-x2;
            }
            else{
                h--;
                m=60-(x2-y2);
            }
        }
        System.out.print("O JOGO DUROU "+h);
        System.out.println(" HORA(S) E "+m+" MINUTO(S)");
    }
}