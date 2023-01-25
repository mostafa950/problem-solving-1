import java.util.Scanner;

public class ICoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        char [] nums;
        for(int i = 0 ; i< 3 ;i++){
            String value = scanner.next();
            nums = value.toCharArray();
            if(nums[1] == '>'){ // A > B
                a += nums[0] == 'A' ? 1: 0;
                b += nums[0] == 'B' ? 1: 0;
                c += nums[0] == 'C' ? 1: 0;
            }else{ // C < A
                a += nums[2] == 'A' ? 1: 0;
                b += nums[2] == 'B' ? 1: 0;
                c += nums[2] == 'C' ? 1: 0;
            }
        }
        if(a == b || a == c || b == c){
            System.out.println("Impossible");
        }
        else{ // b < c < a (a=2 ; b =0 ; c=1)
            if(a > b && a >c){
                if(b > c){
                    System.out.println("CBA");
                }else {
                    System.out.println("BCA");
                }
            }
            if(b > a && b > c){
                if(a > c){
                    System.out.println("CAB");
                }else {
                    System.out.println("ACB");
                }
            }
            if(c > a && c > b){
                if(a > b){
                    System.out.println("BAC");
                }else {
                    System.out.println("ABC");
                }
            }
        }
    }
}
