import java.util.Scanner;

/**
 *  세 값의 최솟값을 구하는 min3 메소드를 작성하세요.
 * */

public class DoIt_Q2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b, c;

        System.out.print("a의 값 : ");
        a = stdIn.nextInt();

        System.out.print("b의 값 : ");
        b = stdIn.nextInt();

        System.out.print("c의 값 : ");
        c = stdIn.nextInt();

        System.out.println("최솟값은 " + min3(a,b,c) + " 입니다.");
    }

    public static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
}
