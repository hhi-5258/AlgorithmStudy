import java.util.Scanner;

/**
 * 이진 검색(binary search) : 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘
 * 가운데 값을 기준으로 범위를 좁혀갑니다. 이진 검색은 검색을 반복할 때마다 범위가 절반이 되므로 비교 횟수의 평균값은 log n 입니다.
 */
public class DoIt_Q4 {
    //갯수가 n인 배열 a에서 key 값이 있는 지 검색
    static int binSearch(int[] a, int n, int key) {
        int pl = 0; // 왼쪽 끝 인덱스
        int pr = n - 1; // 오른쪽 끝 인덱스

        do {
            int pc = (pr + pl) / 2; // 가운데 인덱스
            if (a[pc] == key) { // key 값이 가운데 값, 검색 성공
                return pc;
            } else if (a[pc] < key) { // key 값이 오른쪽에 있는 경우
                pl = pc + 1;
            } else { // key값이 왼쪽에 있는 경우
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1; // 검색 실패
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]); // 이전에 입력한 수보다 작을 경우 다시 입력 받음
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}
