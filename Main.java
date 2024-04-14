import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();


        print(n);







    }

    public static void print(int n){

        if (n==0){
            return;
        }

        for (int i = 0; i <n ; i++) {

            for (int j = 1; j <=n-i ; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();

        }
        print(n-1);

    }


}