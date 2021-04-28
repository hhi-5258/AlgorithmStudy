import java.util.Scanner;

/**
 * 선형 검색(보초법：for문을 사용하여 구현)
 */
public class DoIt_Ex1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }

    public static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key; // 보초 추가

        for (i = 0; a[i] != key; i++) {

        }
        return i == n ? -1 : i;
    }
}
