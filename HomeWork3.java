package algorithms;

public class HomeWork3 {
    public static void main(String[] args) {

        System.out.println(getFibonacciValue(10));
        System.out.println(getFibonacciValue(20));
        System.out.println(getFibonacciValue(30));
        System.out.println(getFibList(10));
        System.out.println(getFibList(20));
        System.out.println(getFibList(30));
    }
    public static int getFibonacciValue(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacciValue(n-1) + getFibonacciValue(n -2);
        }
    }

    public static int getFibList(int n){
        int first = 0;
        int second = 1;
        int next = 0;
        for (int i = 0; i < n-1; i++) {
           next = second + first;
           first = second;
           second = next;
        }
        return next;
    }
    
}
