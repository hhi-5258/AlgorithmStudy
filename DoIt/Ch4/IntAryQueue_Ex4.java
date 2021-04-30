/**
 * queue 를 구현하는 프로그램을 만드세요.
 */
public class IntAryQueue_Ex4 {
    private int max; // 큐 용량
    private int num; // 현재 데이터 수
    private int[] que; // 큐 본체

    public IntAryQueue_Ex4(int capacity) {
        this.max = capacity;
        this.num = 0;
        que = new int[max];
    }

    public class EmptyQueueException extends RuntimeException {
        public EmptyQueueException() {
        }
    }

    public class OverflowQueueException extends RuntimeException {
        public OverflowQueueException() {
        }
    }

    public int enque(int x) throws OverflowQueueException {
        if (num >= max) {
            throw new OverflowQueueException();
        } else {
            return que[num++] = x;
        }
    }

    // que[0] 빼고 나머지 한 칸 씩 당기기
    public int deque() throws EmptyQueueException {
        if (num <= 0) {
            throw new EmptyQueueException();
        } else {
            int x = que[0];
            for (int i = 0; i < num -1; i++) {
                que[i] = que[i+1];
            }
            num--;
            return x;
        }
    }

    public int peek() throws EmptyQueueException {
        if (num <= 0) {
            throw new EmptyQueueException();
        } else {
            return que[num - 1];
        }
    }

    public int indexOf(int x) {
        for (int i = num - 1; i >= 0; i--) {
            if (que[i] == x) return i;
        }
        return -1;
    }

    public void clear() {
        num = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = num - 1; i >= 0; i--) {
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }
}