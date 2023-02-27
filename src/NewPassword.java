import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        List<Character> myChar = new ArrayList<Character>();
        List<Character> password = new ArrayList<Character>();
        for (int i = 97 ; i < 97 + n ; i++){
            myChar.add((char) i );
        }
       // System.out.println(myChar);
        int pointer = 0;
        for (int i = 0 ; i < k ; i++){
            password.add(myChar.get(pointer));
            if(pointer == myChar.size() - 1){
                pointer = 0;
            }else {
                pointer++;
            }
            System.out.print(password.get(i));
        }

    }
}
