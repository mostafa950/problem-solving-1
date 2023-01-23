import java.util.Scanner;

public class BearBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int years = 0;
        for(int i = 0 ; first <= second ; i++){
            first *= 3;
            second *= 2;
            years++;
        }

        System.out.println(years);
    }
}
