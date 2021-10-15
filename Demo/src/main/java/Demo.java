public class Demo {
    public static void main(String[] args) {
        int n = 5;

        int ans = fib(n);
        System.out.println(ans);
    }

    private static int fib(int n) {
        if(n == 0 || n == 1){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
}
