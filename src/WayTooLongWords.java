import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLoops = scanner.nextInt();
        char[] word;
        for (int i = 0 ; i< numOfLoops ; i++) {
             word = scanner.next().toCharArray();
            if(word.length > 10) {
                System.out.println(word[0] + "" + (word.length - 2) + "" + word[word.length - 1]);
                continue;
            }
                System.out.println(word);
        }
    }
}
