import java.util.Scanner;

public class DoIt1_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a, b, c, max;
        System.out.print("a의 값 : ");
        a = stdIn.nextInt();

        System.out.print("b의 값 : ");
        b = stdIn.nextInt();

        System.out.print("c의 값 : ");
        c = stdIn.nextInt();

        max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최대값은 " + max + " 입니다.");
    }
}
