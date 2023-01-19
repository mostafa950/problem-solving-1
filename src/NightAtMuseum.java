import java.util.Scanner;

public class NightAtMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // most // m
        int moves = 0;  // number of moves
        int start = 97; // a
        for (int i = 0 ; i < name.length() ; i++){
            int result = Math.abs(name.toCharArray()[i] - start);
            if(result <= 13){
                moves += result;
            }
            else { // else if (result > 13)
                moves += (26 - result);
            }
            start = name.toCharArray()[i]; // 109
        }
        System.out.println(moves);
    }
}
