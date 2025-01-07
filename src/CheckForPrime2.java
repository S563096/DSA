public class CheckForPrime2 {
    public static void main(String[] args) {
        int num = 6;
        if (isPrime2(num)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime");
        }
    }

    public static boolean isPrime2(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i*i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}