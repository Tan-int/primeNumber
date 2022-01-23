package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
        int primeNumberCount = 0;

        for (int i = -10; i < 120; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " is a prime number");
                primeNumberCount++;
                if(primeNumberCount == 3){
                    break;
                }
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void check(){
        int primeNumberCount = 0;

        for (int i = 1; i < 120; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " is a prime number");
                primeNumberCount++;
                if(primeNumberCount == 3){
                    break;
                }
            }
        }
    }


}
