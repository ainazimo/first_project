import java.util.Scanner;

public class Logical_Sequence_2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int col = in.nextInt();
        int num = in.nextInt();
        int counter = 0;

        for (int i = 1; i <= num; i++) {
            if (counter!=col-1){
                System.out.print(i+" ");
                counter++;
            }
            else {
                System.out.println(i);
                counter=0;
            }
        }
    }

}