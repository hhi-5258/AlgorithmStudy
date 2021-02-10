import java.util.Scanner;
/**
 * 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요.
 * */
public class DoIt_Q14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("n 의 값 : ");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
