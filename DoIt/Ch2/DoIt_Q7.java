import java.util.Scanner;

/**
 * 두 배열의 모든 요소의 값이 같은지 판단, 배열을 복사, 역순으로 복사
 * */
public class DoIt_Q7 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 a 의 요솟수 : ");
        int na = stdIn.nextInt();

        int[] a = new int[na];

        for(int i = 0; i<na; i++){
            System.out.print("a[" + i + "] : " );
            a[i] = stdIn.nextInt();
        }

        System.out.print("배열 b 의 요솟수 : ");
        int nb = stdIn.nextInt();

        int[] b = new int[nb];

        for(int i = 0; i<nb; i++){
            System.out.print("a[" + i + "] : " );
            b[i] = stdIn.nextInt();
        }

        System.out.println("배열 a 와 배열 b는 " + (equals(a,b)?"같습니다":"같지 않습니다"));

        System.out.println("배열 b 의 값을 배열 a에 복사하였습니다.");
        copy(a, b);
        printArray(a);

        System.out.println("배열 b 의 값을 배열 a에 역순으로 복사하였습니다.");
        rcopy(a, b);
        printArray(a);
    }

    static void printArray(int[] a) {
        for (int i = 0; i<a.length; i++) {
            System.out.println("[" + i + "] = " + a[i]);
        }
    }

    static boolean equals(int[] a, int[] b){
        if (a.length != b.length) return false;
        for (int i = 0; i< a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // b 의 모든 요소를 a에 복사
    static void copy(int[] a, int[] b) {
        for (int i=0; i<b.length; i++){
            a[i] = b[i];
        }
    }

    // b 의 모든 요소를 a에 역순으로 복사
    static void rcopy(int[] a, int[] b) {
        for (int i=0; i<b.length; i++) {
            a[b.length-i-1] = b[i];
        }
    }
}
