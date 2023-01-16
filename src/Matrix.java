import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // first solution
/*        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++)
        {
            for (int m = 0 ; m < 2 ; m++)
            {
                int num = scanner.nextInt();
                arr.add(num);
            }
        }
        int inputNum = scanner.nextInt();
        if (arr.contains(inputNum)){
            System.out.println("Will not take number");
        }
        else {
            System.out.println("Will take number");
        }*/
        // second solution
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        String result = "";
        for (int i = 0; i < row; i++)
        {
            for (int m = 0 ; m < col ; m++)
            {
                arr[i][m] = scanner.nextInt();
            }
        }
        int inputNum = scanner.nextInt();
        int flag = 0;
        for (int[] entryArr : arr){
            for (int num : entryArr){
                if(num == inputNum){
                    result = "Number founded and Will not take number ";
                    break;
                }
                else {
                    result = "Will take number";
                }
            }
        }
        // third solution
/*        for (int i = 0; i < 3; i++)
        {
            for (int m = 0 ; m < 2 ; m++)
            {
                if(arr[i][m] == inputNum){
                    result = "Will not take number ";
                }
                else {
                    result = "Will take number";
                }
            }
        }*/
        System.out.println(result);
    }
}
