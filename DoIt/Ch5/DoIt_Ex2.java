import java.util.Scanner;

/**
 * 재귀 메소드 호출을 사용하지 않고 gcd 메소드를 작성하세요.
 */
public class DoIt_Ex2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대 공약수를 구합니다.");

        System.out.print("정수를 입력하세요.：");
        int x = stdIn.nextInt();
        System.out.print("정수를 입력하세요.：");
        int y = stdIn.nextInt();

        System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");
    }

    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
