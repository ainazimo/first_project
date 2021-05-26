import java.util.Scanner;

public class PasswordsValidator {

    public static boolean chek1(String str){
        if (str.length()>=6 && str.length()<=32){
            return true;
        }
        else return false;
    }

    public static boolean chek2(String str){
        for (char ch: str.toCharArray()){
            if (Character.isAlphabetic(ch)){
            }
            else if(Character.isDigit(ch)){
            }
            else return false;
        }
        return true;
    }

    public static boolean chek3(String str){
        int number=0;
        int capitalLetter=0;
        int lowercaseLetter=0;
        for (char ch:str.toCharArray()){
            if (Character.isDigit(ch)){
                number++;
            }
            else if (Character.isUpperCase(ch)){
                capitalLetter++;
            }
            else if(Character.isLowerCase(ch)){
                lowercaseLetter++;
            }
        }
        if (number>0 && capitalLetter>0 && lowercaseLetter>0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            if (chek1(str) && chek2(str) && chek3(str)){
                System.out.println("Senha valida.");
            }
            else{
                System.out.println("Senha invalida.");
            }
        }
    }
}