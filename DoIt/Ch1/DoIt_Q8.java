import java.util.Scanner;
/**
 *  가우스의 덧셈을 이용한 1 부터 n 까지의 정수의 합 구하기
 * */
public class DoIt_Q8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = (1 + n) * (n / 2) + (n % 2 == 0 ? 0 : (n + 1) / 2);

        System.out.println("sum = " + sum);
    }
}
