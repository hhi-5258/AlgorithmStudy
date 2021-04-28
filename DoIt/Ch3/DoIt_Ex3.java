import java.util.Scanner;

/**
 * key 와 일치하는 반복적인 요소의 인덱스들을 배열로 나타내고, 배열의 요소수를 반환하는 메소드 작성.
 * */
public class DoIt_Ex3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("key : ");
        int ky = stdIn.nextInt();

        int idxNum = searchIdx(x, num, ky, y);
        System.out.println("key의 갯수 : " + idxNum);

    }

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[count++] = i;
            }
        }
        return count;
    }
}
