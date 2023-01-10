import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // w that refer to weight
        int w = scanner.nextInt();
        if (w % 2 == 0){ // that mean w is even
            System.out.println("yes");
        }
        else { // that mean w is odd
            System.out.println("no");
        }
    }
}