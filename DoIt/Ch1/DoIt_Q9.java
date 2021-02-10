import java.util.Scanner;

/**
 *  정수 a, b 를 포함하여 그 사이의 모든 정수의 합을 구하여 반환합니다.
 * */
public class DoIt_Q9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b;

        System.out.print("a 의 값 : ");
        a = stdIn.nextInt();
        System.out.print("b 의 값 : ");
        b = stdIn.nextInt();

        System.out.println(a + " 와 " + b + " 사이의 정수의 합은 " + sumof(a,b) + " 입니다.");
    }

    public static int sumof(int a, int b) {
        int sum = 0, min, max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}
