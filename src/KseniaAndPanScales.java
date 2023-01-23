import java.util.Scanner;

public class KseniaAndPanScales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scales = scanner.next();
        String addName = scanner.next();
        int right = 0;
        int left = 0;
        int flag = 0;
        String value = "";
        char[] arr = new char[scales.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scales.toCharArray()[i];
            value += arr[i];
            if(scales.toCharArray()[i] == 124){
                flag = 1;
            }
            if(flag == 0){
                left++;
            }
            else {
                right++;
            }
        }
        right--;
        int min = Math.min(left,right);
        int max = Math.max(left,right);
        if(left < right && addName.length() + left == right) {
            System.out.println(addName+value);
        } else if (min == max || addName.length()+ min > max) {
            System.out.println("Impossible");
        } else {
            System.out.println(value+addName);
        }
        }
    }

