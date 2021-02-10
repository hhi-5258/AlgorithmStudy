import java.util.Scanner;

/**
 *  네 값의 최댓값을 구하는 max4 메소드를 작성하세요.
 * **/
public class DoIt_Q1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("a의 값 : ");
        a = stdIn.nextInt();

        System.out.print("b의 값 : ");
        b = stdIn.nextInt();

        System.out.print("c의 값 : ");
        c = stdIn.nextInt();

        System.out.print("d의 값 : ");
        d = stdIn.nextInt();

        System.out.println("최댓값은 " + max4(a,b,c,d) + " 입니다.");
    }

    public static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }
}
