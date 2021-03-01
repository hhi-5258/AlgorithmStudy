/**
 * 1000 이하의 소수(prime number)를 열거
 * n 의 제곱근 이하의 어떤 소수로도 나누어떨어지지 않으면 n 은 소수라고 판단.
 * **/
public class DoIt_Q9 {
    public static void main(String[] args){
        int counter = 0; // 곱셈과 나눗셈의 횟수
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수를 저장하는 배열 (짝수는 소수가 아니므로 절반인 500)

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for (int n=5; n <=1000; n += 2){ // 대상은 홀수만
            boolean flag = false; // counter 를 계산하기 위해 사용됨.
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) { // 소수 아님
                    flag = true;
                    break;
                }
            }

            if (!flag){
                prime[ptr++] = n;
                counter++;
            }
        }

        for (int i=0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}
