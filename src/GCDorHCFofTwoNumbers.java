public class GCDorHCFofTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int gcdValue = gcd(num1,num2);
        System.out.println("The gcd of " + num1 +" and "+ num2 + " is: " + gcdValue);
    }

    public static int gcd(int a, int b){
        int res = Math.min(a,b);
        while(res > 0){
            if(a % res == 0 && b % res == 0){
                return res;
            }
            res --;
        }
        return 1;
    }
}
