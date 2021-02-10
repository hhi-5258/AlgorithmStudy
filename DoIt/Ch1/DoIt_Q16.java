import java.util.Scanner;
/**
 * n단의 피라미드를 출력하는 메소드를 작성하세요.
 * */
public class DoIt_Q16 {
    public static void main(String[] args) {
        int n;
        Scanner stdIn = new Scanner(System.in);
        do {
            System.out.print("n 의 값 : ");
            n = stdIn.nextInt();
        } while(n <= 0); // n은 양수

        spira(n);
    }

    public static void spira(int n) {
        for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
                System.out.print(i);
            System.out.println(); 						// 개행(줄변환)
        }
    }
}
