import java.util.Scanner;

/**
 * 하노이의 탑
 * */
public class Hanoi_Q6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 수 :");
        int n = stdIn.nextInt();

        move(n, 1, 3); // 1번 기둥의 n개 원반을 3번 기둥으로 옮김
    }

    static void move(int no, int x, int y) { // no : 옮겨야 할 원반의 갯수, x : 시작 기둥의 번호, y: 목표 기둥의 번호
        if (no > 1) move(no -1, x, 6 - x - y); // 기둥 번호의 합이 6 이므로 중간 기둥의 번호는 6-x-y

        System.out.println("원반[" + no + "] 을 " + x + "기둥에서 " + y + " 기둥으로 옮김");

        if (no > 1) move(no - 1, 6 - x- y, y);
    }
}
