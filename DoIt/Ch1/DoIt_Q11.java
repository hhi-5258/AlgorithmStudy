import java.util.Scanner;
/**
 *  양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
 * */
public class DoIt_Q11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
            System.out.print("n 의 값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int no = 0; // 자릿수
        for (int i = n; i > 0; no++) {
            i = i / 10;
        }
        System.out.println(n + "은 " + no + " 자리입니다.");
    }

}
