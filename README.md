# PrimeNumbers2
Finding prime numbers with recursive methods.

For a better understanding  we can add another method that takes the result from isPrime method.
 
 static void primeNumbers(){
        int start = 1,result = 1;
        int end = 20;

  System.out.println("Prime numbers between " + start + " and " + end + " are : ");
  for(int number = start; number <= end; number++){
  if(isPrime(number)){
          result *= number;
          System.out.println(number + " " + result);
   }
  }
 }
with this code, we will be able to return the numbers that result in true in the first method. This code scope can be added to the main method with some changes, or you can just call primeNumbers method in the main method without calling isPrime.
