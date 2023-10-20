package algorithms;

public class HomeWork3 {
    public static void main(String[] args) {

        System.out.println(getFibRec(10));
        System.out.println(getFibRec(20));
        System.out.println(getFibRec(30));
        System.out.println(getFibIter(10));
        System.out.println(getFibIter(20));
        System.out.println(getFibIter(30));
    }
    public static int getFibRec(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibRec(n-1) + getFibRec(n -2);
        }
    }

    public static int getFibIter(int n){
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
