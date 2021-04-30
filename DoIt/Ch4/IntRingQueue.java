public class IntRingQueue {
    private int max; // 큐의 용량
    private int front; // 첫 번째 요소 커서
    private int rear; // 마지막 요소 커서
    private int num; // 현재 데이터 수 (front와 rear가 같은 경우 num 이 0이면 빈 경우, num이 max 면 가득 참.
    private int[] que; // 큐 본체

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    public IntRingQueue(int capacity) {
        this.max = capacity;
        num = front = rear = 0;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    // enque에 성공한 경우 x값을 그대로 반환
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= max) {
            throw new OverflowIntQueueException();
        } else {
            que[rear++] = x;
            num++;
            if (rear == max) rear = 0; // rear 값이 max 와 같아지면 없는 공간인 que[max]를 가리키게 됨
            return x;
        }
    }

    public int deque() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        } else {
            int x = que[front++];
            num--;
            if (front == max) front = 0; // front 값이 max 와 같아지면 없는 공간인 que[max]를 가리키게 됨
            return x;
        }
    }

    // 프런트 데이터를 들여다 봄
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        } else {
            return que[front];
        }
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max; // 스캔할 인덱스 계산
            if (que[idx] == x) return idx;
        }
        return -1;
    }

    public void clear() {
        num = front = rear = 0;
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
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }

    // 큐 안에서 몇번째에 있는가 반환(프런트에 있는 경우 1, 큐에 없는 경우 0)
    public int search(int x) {
        for (int i = 1; i <= num; i++) {
            if (que[(i + front) % max] == x) {
                return i;
            }
        }
        return 0;
    }
}
