public class RecursionDemo1 {
    public static void main(String[] args){

        long n=20;
        //recursiveFunction(n);
        long fact=factorial(n);
        System.out.println("factorial of no."+fact);
    }
//factorial of a no. will work only when value of n! is less than range of no.
    private static long factorial(long n) {
        if(n<=1) return 1;
        long f1=n*factorial(n-1);
        return f1;
    }

    static long recursiveFunction(int n){
        if(n<=0) return 1;
        System.out.println(n);
        return recursiveFunction(n-1);
    }
}
