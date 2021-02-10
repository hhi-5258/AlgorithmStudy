import java.util.Scanner;

/**
 *  3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.
 * */
public class DoIt1C_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b, c;

        System.out.print("a의 값 : ");
        a = stdIn.nextInt();

        System.out.print("b의 값 : ");
        b = stdIn.nextInt();

        System.out.print("c의 값 : ");
        c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a,b,c) + " 입니다.");
    }
    public static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) return b;
            else if (a <= c) return a;
            else return c;
        }
        else if (a > c) return a;
        else if (b > c) return c;
        else return b;
    }
}
