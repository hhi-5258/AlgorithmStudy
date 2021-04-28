import java.util.Scanner;

/**
 * 이진 검색의 과정을 출력하는 프로그램을 작성하세요.
 */
public class DoIt_Ex4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.print("x[0] : ");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]); // 오름차순으로 받기
        }

        System.out.print("key : ");
        int ky = stdIn.nextInt();

        int resultIdx = binarySearch(x, num, ky);
        if (resultIdx == -1) {
            System.out.println("요소가 배열에 존재하지 않습니다.");
        } else {
            System.out.println(ky + "는 x[" + resultIdx + "]에 있습니다.");
        }

    }

    static int binarySearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        int center = 0;

        System.out.print("   |");
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n---+");
        for (int i = 0; i < n; i++) {
            System.out.print("---");
        }

        do {
            center = (pr + pl + 1) / 2;

            System.out.print("\n   |");
            System.out.printf(String.format("%%%ds<-", 2 * pl + 1), "");
            System.out.printf(String.format("%%%ds+", 2 * center + 1), "");
            System.out.printf(String.format("%%%ds->", 2 * (pr - center) + 1), "");

            System.out.printf("\n%3d|", center);
            for (int i = 0; i < n; i++) {
                System.out.printf("%3d", a[i]);
            }

            if (a[center] == key) {
                System.out.println();
                return center;
            } else if (a[center] < key) {
                pl = center + 1;
            } else {
                pr = center - 1;
            }
        } while (pr >= pl);

        return -1;
    }
}
