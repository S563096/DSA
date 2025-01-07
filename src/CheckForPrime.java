public class CheckForPrime {
    public static void main(String[] args) {
        int num = 6;
        if (isPrime(num)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime");
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
