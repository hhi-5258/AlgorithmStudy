import java.util.Scanner;
/**
 * 왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.
 * */
public class DoIt1_8 {
    public static void main(String[] args) {
        int n;
        Scanner stdIn = new Scanner(System.in);
        do {
            System.out.print("n 의 값 : ");
            n = stdIn.nextInt();
        } while(n <= 0); // n은 양수

        for (int i = 0; i < n; i++) {
            for (int j = 0; i >= j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
