public class CheckForPrime3 {
    public static void main(String[] args) {
        int num = 11;
        if (isPrime3(num)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime");
        }
    }

    public static boolean isPrime3(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5; i*i<=n; i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
