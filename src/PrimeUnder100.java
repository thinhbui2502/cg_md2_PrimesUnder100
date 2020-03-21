
public class PrimeUnder100 {
    public static void main(String[] args) {
        System.out.println("I will show you prime numbers less than 100!");
        int N = 2;
        boolean isPrime = true;

        while (N < 100) {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N);
            }
            N++;
            isPrime = true;
        }
    }
}
