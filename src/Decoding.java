import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfOperation = scanner.nextInt();
        String decodeWord = scanner.next(); // logva
        String result = "";
        int length = decodeWord.length();
        for (int i = 0 ; i < numOfOperation ; i++){
            int indexOf = decodeWord.length() - length;
            if(length % 2 == 0){
                result = decodeWord.charAt(indexOf) + result;
            }
            else {
                result = result + decodeWord.charAt(indexOf);
            }
            length --;
        }
        System.out.println(result);
    }
}
