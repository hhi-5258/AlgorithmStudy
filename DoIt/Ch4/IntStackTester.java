import java.util.Scanner;

/**
 * int 형 스택 사용 예제
 */
public class IntStackTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64); // 스택 생성

        while (true) {
            System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
            System.out.println("(1) 푸시  (2) 팝   (3) 피크  (4) 덤프 (5) 검색  (0) 종료 : ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1: // 푸시
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2: // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비었습니다.");
                    }
                    break;

                case 3: // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 4: // 덤프
                    s.dump();
                    break;

                case 5: // 검색
                    System.out.print("찾고자 하는 수 : ");
                    x = stdIn.nextInt();
                    int idx = s.indexOf(x);
                    if (idx == -1) {
                        System.out.println(x + "는 스택에 존재하지 않습니다.");
                    } else {
                        System.out.println(x + "는 stack[" + idx + "] 에 존재합니다.");
                    }
            }
        }
    }
}
