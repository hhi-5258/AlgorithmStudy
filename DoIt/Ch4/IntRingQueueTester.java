import java.util.Scanner;

/**
 * int 형 Ring Queue 사용 예제
 */
public class IntRingQueueTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntRingQueue s = new IntRingQueue(64);

        while (true) {
            System.out.println("현재 데이터 수 :" + s.size() + " / " + s.capacity());
            System.out.println("(1)인큐  (2)디큐  (3)피크  (4)덤프  (0)종료");
            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt();
                    try {
                        s.enque(x);
                    } catch (IntRingQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        System.out.println("디큐한 데이터 : " + s.deque());
                    } catch (IntRingQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        System.out.println("피크한 데이터 : " + s.peek());
                    } catch (IntRingQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
