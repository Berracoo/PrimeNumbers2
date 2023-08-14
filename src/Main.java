import java.util.Scanner;

public class Main {
    static boolean primeNumbers(int n){
        if(n <= 1){
            return false;
        }
        // I should start from 2 because if it starts from 1, it won't count it as a prime number since it can be divided for a value of i
        // we used Math.sqrt() method to check all the factors of the n up to its square root, in that sense
        // we will be able to find if n is divisible with numbers that are less than its square root or greater than its square root
        //If we did not use Math.sqrt(), we would have to check for factors up to the maximum value of i,(in a way that we use n%i == 0)
        // which could be very large for large numbers. This would make the code slower and less efficient.
        for(int i = 2; i <= Math.sqrt(n); i++){
          if(n % i == 0)
              return false;
        }

        return true;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scanner.nextInt();
        if(primeNumbers(number)){
            System.out.println(number + " " + "is a prime number.");
        }else{
            System.out.println(number + " " + "is not a prime number.");
        }

    }
}