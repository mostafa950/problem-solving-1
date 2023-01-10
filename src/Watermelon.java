import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // w that refer to weight
        int w = scanner.nextInt();
        if (w > 0 && w <= 100 && w % 2 == 0){ // that mean w is even
            System.out.println("yes");
        }
        else if (w > 100){ // that mean w is odd
            System.out.println("please enter weight between 1 to 100");
        }
        else {
            System.out.println("no");
        }
    }

}
