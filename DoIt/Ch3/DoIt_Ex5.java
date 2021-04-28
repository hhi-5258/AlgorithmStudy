import java.util.Scanner;

/**
 * 이진 검색 시, 배열에서 중복 요소가 있는 경우,
 * 가운데가 아닌 맨 앞의 요소를 찾는 binSearchX 메소드를 작성해 보세요.
 */
public class DoIt_Ex5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력해 주세요.");
        System.out.print("x[0] : ");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do{
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i-1]);
        }

        System.out.print("key : ");
        int ky = stdIn.nextInt();

        int idx = binSearchX(x, num, ky);
        if (idx == -1) {
            System.out.println("요소가 배열에 존재하지 않습니다.");
        } else {
            System.out.println("가장 앞쪽에 위치하는 " + ky + "는 x[" + idx + "]에 위치합니다.");
        }
    }

    static int binSearchX(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        int center;

        do {
            center = (pl + pr) / 2;

            if (a[center] == key) {
                for (int i = pl; i <= pr; i++) {
                    if (a[i] == key) return i;
                }
            } else if (a[center] < key) {
                pl = center + 1;
            } else {
                pr = center - 1;
            }
        } while (pr >= pl);

        return -1;
    }
}
