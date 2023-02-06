import java.util.Scanner;

public class RegularBracketSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.next().toCharArray();
        int counter = 0;
        int length = arr.length;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == '('){
                counter++;
            }
            else{
                counter--;
                if(counter < 0){
                    length --;
                    counter = 0;
                }
            }
        }
        System.out.println(length - counter);
    }
}
