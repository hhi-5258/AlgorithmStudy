import java.util.Scanner;

public class DoIt_Q10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a 의 값 : ");
        int a = stdIn.nextInt();

        int b = 0;
        while(true) {
            System.out.print("b 의 값 : ");
            b = stdIn.nextInt();
            if (b > a) {
                break;
            }
            System.out.println(a + "보다 큰 값을 입력하세요!");
        }

        System.out.println("b - a 는 " + (b-a) + "입니다.");


    }
}
