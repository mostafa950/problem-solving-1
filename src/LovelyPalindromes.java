import java.util.Scanner;

public class LovelyPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        char[] result = value.toCharArray();
        System.out.print(value);
        for (int i = value.length() -1 ; i >= 0 ; i--){
            System.out.print(result[i]);
        }
    }
}
