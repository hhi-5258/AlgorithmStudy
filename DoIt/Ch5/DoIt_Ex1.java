import java.util.Scanner;

/**
 * 재귀 메서드 호출을 사용하지 않고 factorial 메소드를 작성하세요.
 * */
public class DoIt_Ex1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        System.out.println("factorial " + x + " : " + factorial(x));
    }

    static int factorial(int x) {
        int result = 1;

        while(x > 1) {
            result *= x--;
        }

        return (result);
    }


}
