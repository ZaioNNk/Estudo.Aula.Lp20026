import java.util.Scanner;

public class Becrootd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =  sc.nextInt();
        int B = sc.nextInt();
        int x = A*B;
        System.out.printf( "x = %d\n" ,x);
        sc.close();

    }
}
