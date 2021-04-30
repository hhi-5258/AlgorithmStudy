import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 신체검사 데이터 배열에서 이진 검색하기,
 * binarySearch(T[] a, T key, Comparator <? super T> c) 사용
 * */

public class DoIt_Q8 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("이나령", 162, 0.3),
                new PhyscData("유지훈", 168, 0.4),
                new PhyscData("김한결", 169, 0.8),
                new PhyscData("홍준기", 171, 1.5),
                new PhyscData("전서현", 173, 0.7),
                new PhyscData("이호연", 174, 1.2),
                new PhyscData("이수민", 175, 2.0)
        };

        System.out.print("키가 몇 cm인 사람을 찾고 있나요? : ");
        int height = stdIn.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

        if (idx < 0) {
            System.out.println("요소가 없습니다.");
        } else {
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }

    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        // 생성자
        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString(){
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
            }
        }
    }

}
