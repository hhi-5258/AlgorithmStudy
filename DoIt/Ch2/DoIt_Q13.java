import java.util.Scanner;

/**
 * 그 해의 경과 일수, 남은 일수를 구함
 * **/
public class DoIt_Q13 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
    };
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("그 해 경과 일수를 구합니다.");

        System.out.print("년 : "); int year = stdIn.nextInt();
        System.out.print("월 : "); int month = stdIn.nextInt();
        System.out.print("일 : "); int day = stdIn.nextInt();

        System.out.println("그 해 "+ dayOfYear(year, month, day) + " 일 째입니다.");
        System.out.println("그 해 남은 일수는 " + leftDayofYear(year, month, day) + "일 입니다.");
    }


    static int dayOfYear(int y, int m, int d){ // y년 m월 d일
        while(--m != 0){
            d += mdays[isLeap(y)][m-1];
        }
        return d;
    }

    // 그 해 남은 일수를 구하는 메소드
    static int leftDayofYear(int y, int m, int d) {
        int days = d;
        for (int i = 1; i < m; i++) {
            days += mdays[isLeap(y)][i-1];
        }
        return 365 + isLeap(y) - days;
    }

    // 평년인지 윤년인지 판단하는 메소드 (윤년 : 1, 평년 : 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) ? 1 : 0;
    }
}
