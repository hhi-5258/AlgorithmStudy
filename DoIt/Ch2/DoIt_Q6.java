import java.util.Scanner;
/**
 * 배열 요소의 값을 읽어 들여 역순으로 정렬하고, 요소들의 합을 구합니다.
 * */
public class DoIt_Q6 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("배열의 크기 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0 ; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬했습니다.");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        System.out.println("모든 요소의 합은 " + sumOf(x) + " 입니다.");

    }

    static int sumOf(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    static void reverse(int[] a) {
        for (int i = 0; i< a.length/2; i++) {
            swap(a, i, a.length-i-1);
        }
    }

    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
