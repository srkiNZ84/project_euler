import java.util.ArrayList;

public class Problem3 {

	ArrayList<Long> primeFactors;

	public Problem3(){

		primeFactors = new ArrayList<Long>();

		/*isPrime(2);
		isPrime(3);
		isPrime(4);
		isPrime(5);
		isPrime(6);
		isPrime(7);
		isPrime(8);
		isPrime(9);
		isPrime(10);
		isPrime(11);
		isPrime(12);
		isPrime(13);
		isPrime(18);*/

		long number = 600851475143L;

		getPrimeResult(number);

		System.out.println("Factors of " + number + "  are: " + primeFactors);

	}

	public static void main(String[] args){
		Problem3 p3 = new Problem3();
	}

	public long getPrimeResult(long number){
		for(long i = 2; i < number; i++){
			if(number % i == 0){
				// We have found a factor
				if(isPrime(i)){
					// Add it to the list of primes
					primeFactors.add(i);
				}

				long result = number/i;

				if(isPrime(result)){
					primeFactors.add(result);
					return result;
				}

				return getPrimeResult(result);
			}
		}
		return 0;
	}

	public boolean isPrime(long number){
		for(long i = 2; i < number; i++){
			if(number % i == 0 && number != i){
				//System.out.println(number + " is not a prime. Is divisible by " + i);
				return false;
			}
		}
		//System.out.println(number + " is a prime.");
		return true;
	}
}
