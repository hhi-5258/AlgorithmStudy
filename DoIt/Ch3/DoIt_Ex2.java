import java.util.Scanner;

/**
 * 선형 검색(보초법)의 검색 과정을 나타냄
 */
public class DoIt_Ex2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("찾고자 하는 수 : ");
        int ky = stdIn.nextInt();

        int idx = binarySearch(x, num, ky);
        if (idx == -1) {
            System.out.println("ky 는 존재하지 않습니다.");
        } else {
            System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
        }
    }

    static int binarySearch(int[] a, int n, int key) {
        a[n] = key;

        System.out.print("   | ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        System.out.print("---+");
        for (int i = 0; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();

        for (int index = 0; index < n; index++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (index * 3) + 3), "");
            System.out.printf("%3d|", index);
            for (int i = 0; i < n; i++) {
                System.out.printf("%3d", a[i]);
            }
            System.out.println("\n   |");
            if (a[index] == key) {
                return index;
            }
        }

        return -1;
    }
}
