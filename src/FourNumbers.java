import java.util.Scanner;

public class FourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 1;
        for(int i = 0 ; i <4 ; i++){
            sum *= scanner.nextInt();
        }
        System.out.println(sum);
    }
}
