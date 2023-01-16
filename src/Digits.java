import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLoop = scanner.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0 ; i < numOfLoop ; i++){
            String input = scanner.next();
            arr.add(input);
            }
        for (int s = 0 ; s < arr.size() ; s++){
            for(int t = arr.get(s).length() -1 ; t >= 0  ; t--){
                System.out.print(arr.get(s).charAt(t) + " ");
            }
            System.out.println();
        }
    }
}
