import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
            int count = in.nextInt();
            StringBuilder res=new StringBuilder();
            for (int j = 0; j < str[i].length(); j++) {
                if((str[i].charAt(j) - count) >= 65){
                    char ch = (char) (str[i].charAt(j) - count);
                    res.append(ch);
                }else if((str[i].charAt(j) - count) < 65){
                    char ch = (char) ((str[i].charAt(j) - count) + 26);
                    res.append(ch);
                }
            }
            System.out.println(res);
        }

    }
}
