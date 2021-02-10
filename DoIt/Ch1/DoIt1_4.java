import java.util.Scanner;

/**
 *  1 부터 n 까지의 합을 구합니다.
 * */
public class DoIt1_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, sum = 0, i = 1;

        System.out.print("n의 값 : ");
        n = stdIn.nextInt();

//        while (i <= n){
//            sum += i;
//            i++;
//        }

        for (int j = 1; j <=n ; j++) {
            sum += j;
        }

        System.out.println(n + "까지의 합은 " + sum + ", i는 " + i + " 입니다.");
    }
}
