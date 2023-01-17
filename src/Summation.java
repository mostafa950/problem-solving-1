import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // first solution
         long num = scanner.nextLong();
         long sum = (num * (num +1)) / 2;
        System.out.println(sum);
        // second solution
        // long sum = rec(scanner.nextLong());
        // System.out.println(sum);

    }
    public static long rec (long i ){
        if(i != 0 ){
            return  i + rec(i -1);
        }
        else {
            return 0;
        }
    }
}
