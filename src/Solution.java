import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Operationable operation;
        operation = Integer::sum;
        int q = in.nextInt();
        int a = in.nextInt();
        int result = operation.calculate(q, a);
        System.out.println(result);
    }
}
interface Operationable {
    int calculate(int x, int y);
}
