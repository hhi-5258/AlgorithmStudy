import java.util.Scanner;

public class DoIt_Q3 {
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

        System.out.println("최솟값은 " + min4(a,b,c,d) + " 입니다.");
    }

    public static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }
}
