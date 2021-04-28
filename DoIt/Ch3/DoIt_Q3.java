import java.util.Scanner;

/**
 * 보초법(sentinel method)
 * 배열 요소의 끝에 검색하고자 하는 값(보초)를 추가,
 * 보초는 반복문에서 종료 판단 횟수를 2회에서 1회로 줄이는 역할을 합니다.
 */
public class DoIt_Q3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++){
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

        a[n] = key;

        while(true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }
}
