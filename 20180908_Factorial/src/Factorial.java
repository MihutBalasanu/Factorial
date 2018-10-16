import java.util.Scanner;

public class Factorial {

    //    public static int factorial (int n){
//        if(n == 1) {
//            return 1;
//        }else{
//            int fn =  factorial (n-1 ) * n;
//            return fn;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Introduceti o valoare pentru n:");
//        int n = s.nextInt();
//        int factN = factorial(n);
//        System.out.println("Factorial: "+ factN);
//    }
//}
    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            int fn = factorial(n - 1) * n;
            return fn;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int n = s.nextInt();
        int factorial = factorial(n);
        System.out.println("Factorial: " + factorial);
    }
}

