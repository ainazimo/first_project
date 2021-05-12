import java.util.Scanner;

public class Triangle_Types{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();

        if (B>A && B>C){
            double tmp=A;
            A=B;
            B=tmp;
            if (C>B){
                tmp=C;
                C=B;
                B=tmp;
            }
        }
        else if (C>A && C>B){
            double tmp=A;
            A=C;
            C=tmp;
            if (C>B){
                tmp=C;
                C=B;
                B=tmp;
            }
        }
        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if (Math.pow(A,2)==Math.pow(B,2)+Math.pow(C,2)){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if (Math.pow(A,2)>(Math.pow(B,2)+Math.pow(C,2))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if (Math.pow(A,2)<(Math.pow(B,2)+Math.pow(C,2))){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A==B&& B==C){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((A==B || B==C || A==C) && (A!=B || B!=C || A!=C)){
            System.out.println("TRIANGULO ISOSCELES");
        }

    }
}