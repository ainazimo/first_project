import java.util.Scanner;

public class CompareSubstring {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            System.out.println(func1(in.nextLine(),in.nextLine()));
        }
    }
    
    public static int func1(String str1, String str2){
        int result=0;
        int i=0,j=1;
        String str3;
        for (int k = 0; k < str1.length(); k++) {
            str3=str1.substring(i,j);
            if (str2.contains(str3)){
                j++;
                result=str3.length();
            }
            else{
                i++;j++;
            }
        }
        return result;
    }
}
