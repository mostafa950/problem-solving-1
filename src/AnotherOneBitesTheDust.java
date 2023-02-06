import java.util.Scanner;

public class AnotherOneBitesTheDust {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sizeA = scanner.nextInt();
        long sizeB = scanner.nextInt();
        long sizeAB = scanner.nextInt();
        sizeA += sizeAB;
        sizeB += sizeAB;
        long result = 0;
        if(sizeA == sizeB){
            result = sizeA * 2;
        } else if (sizeA < sizeB) {
            result = (sizeA * 2)  + 1;
        }
        else {
            result = (sizeB * 2) +1;
        }
        System.out.println(result);
    }
}
