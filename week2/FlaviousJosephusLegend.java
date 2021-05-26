import java.util.Scanner;

public class FlaviousJosephusLegend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int NumberOfPeople = in.nextInt();
        int[][] array = new int[NumberOfPeople][2];
        for (int i = 0; i < NumberOfPeople; i++) {
            for (int j = 0; j < 2; j++){
                array[i][j] = in.nextInt();
            }
        }
        for (int j = 0; j < NumberOfPeople; j++) {
            int[] people = new int[array[j][0]];
            initialization(people);
            int n=people.length;
            int i=array[j][1]-1;
            while (true){
                if (n==1){
                    break;
                }
                else{
                    //System.out.println(i);
                    swap(people,i);
                    n--;
                    if (n==1){
                        /*for (int k = 0; k < n; k++) {
                            System.out.print(people[k]+" ");
                        }
                        System.out.println();*/
                        //System.out.println(people[0]);
                        break;
                    }
                    if (i==n){
                        i=0;
                    }
                    if(i+array[j][1]-1<n){
                        i+=array[j][1]-1;
                    }
                    else{
                        i=(i+(array[j][1]-1))-n;;
                    }
                }/*
                for (int k = 0; k < n; k++) {
                    System.out.print(people[k]+" ");
                }
                System.out.println();*/
            }
            System.out.println("Case "+(j+1)+": "+people[0]);
            //1 3 5
        }

        /*int[] arr={1,2,3,4,5};
        swap(arr,1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();*/

    }

    public static void initialization(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
    }

    public static void swap(int[] array, int j){
        for (int i = j; i < array.length-1; i++) {
            int tmp = array[i];
            array[i]=array[i+1];
            array[i+1]=tmp;
        }
    }

}
