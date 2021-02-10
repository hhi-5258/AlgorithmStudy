import java.util.Scanner;
/**
 * 직각 이등변 삼각형 출력
 * **/
public class DoIt_Q15 {
    public static void main(String[] args) {
        int n;
        Scanner stdIn = new Scanner(System.in);
        do {
            System.out.print("n 의 값 : ");
            n = stdIn.nextInt();
        } while(n <= 0); // n은 양수

        triangleLB(n);
        System.out.println("=============");
        triangleLU(n);
        System.out.println("=============");
        triangleRB(n);
        System.out.println("=============");
        triangleRU(n);
        System.out.println("=============");

    }

    // 왼쪽 아래가 직각인 이등변 삼각형 출력
    public static void triangleLB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; i >= j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 왼쪽 위가 직각인 이등변 삼각형 출력
    public static void triangleLU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 아래가 직각인 이등변 삼각형 출력
    public static void triangleRB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; n - i -1 > j; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 위가 직각인 이등변 삼각형 출력
    public static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
                System.out.print('*');
            System.out.println();					// 개행(줄변환)
        }
    }
}
