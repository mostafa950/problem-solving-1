import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class HorseShoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> arr = new HashSet<>();
        int numOfColors = 4;
        for (int i = 0 ; i < 4 ; i++){
            arr.add(scanner.nextInt());
        }
        System.out.println(numOfColors - arr.size());
    }
}