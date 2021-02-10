import java.util.Scanner;
/**
 *  n이 7이면 " 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28" 로 출력하는 프로그램 작성
 * */
public class DoIt_Q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("n의 값 : ");
        n = stdIn.nextInt();

        for (int i = 1; i <=n ; i++) {
            sum += i;

            if (i == n) {
                System.out.println(i + " = " + sum);
            } else {
                System.out.print(i + " + ");
            }
        }
    }
}
