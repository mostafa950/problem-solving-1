import java.util.Scanner;

public class YaroslavAndPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLoops = scanner.nextInt();
        int result = 0;
        int[] arr = new int[numOfLoops];
        for (int i = 0; i < numOfLoops; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < arr.length ; i++) {
            int pointer = 0;
            for (int m = 0 ; m < arr.length ; m++){
                if(arr[i] == arr[m]){
                    pointer++;
                }
                if (pointer > result){
                    result = pointer;
                }
            }
        }
        if(arr.length % 2 == 0){
            if (result <= arr.length / 2) {
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
        else {
            if (numOfLoops == 1 || result <= arr.length/2 +1) {
                System.out.println("Yes");
            } else if (result > arr.length/2 +1) {
                System.out.println("No");
            }
        }
        System.out.println(result);
    }
}
