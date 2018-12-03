public class Recursion {

    public static void main(String[] args) {
        System.out.println(factorial(10)); // 3628800
        System.out.println(fibonacci(16)); // fibonacci at index 16 => 987
    }

    public static int factorial(int n){
        if (n <= 1)
            return 1;
        return n * factorial(n-1);
    }

    public static long fibonacci(int index){
        if (index < 2)
            return index;
        return fibonacci(index-1) + fibonacci(index-2);

    }
}
