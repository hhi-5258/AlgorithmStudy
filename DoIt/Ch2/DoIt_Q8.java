import java.util.Scanner;

/**
 * 입력받은 10진수를 2~36진수로 기수 변환하여 나타냄
 */
public class DoIt_Q8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no; //변환하는 정수
        int cd; //기수
        int dno; //변환 후의 자릿수
        char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자열

        System.out.println("10진수를 기수로 변환합니다.");
        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            no = stdIn.nextInt();
        } while (no < 0);
        do {
            System.out.print("어떤 진수로 변환할까요? (2~36) : ");
            cd = stdIn.nextInt();
        } while (cd < 2 || cd > 36);

        cardConvDetail(no, cd, cno);

    }

    // x 를 r 진수로 변환하여 배열 d에 아랫자리 부터 넣어두고 자릿수를 반환
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        return digits;
    }

    //배열의 앞쪽에 윗자리를 넣어두는 메소드
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x = x / r;
        } while (x != 0);

        // 배열을 반대로 정렬
        for (int i = 0; i < d.length / 2; i++) {
            char temp = d[i];
            d[i] = d[d.length - i - 1];
            d[d.length - i - 1] = temp;
        }
        return digits;
    }

    // 기수 변환 과정을 자세히 나타내는 메소드
    static void cardConvDetail(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(r + " |         " + x);
        do {
            System.out.println("  + ---------------");
            System.out.println(r + " |         " + x / r + "  ... " + dchar.charAt(x % r));
            d[digits++] = dchar.charAt(x % r);
            x = x / r;
        } while (x != 0);

        System.out.print(r + " 진수로 ");

        // 배열을 반대로 정렬
        for (int i = 0; i < d.length / 2; i++) {
            char temp = d[i];
            d[i] = d[d.length - i - 1];
            d[d.length - i - 1] = temp;
        }
        // 배열 출력
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
        }


        System.out.println("입니다.");

    }
}
