import java.util.ArrayList;

public class Problem7{
	
	public ArrayList<Integer> primes;

	public Problem7(){

		primes = new ArrayList<Integer>();

		for(int i = 2; primes.size() < 10001; i++){
			if(isPrime(i)){
				primes.add(i);
				//System.out.println("Added prime " + i + " at position " + primes.size());
			}
		}
		System.out.println("10,001st prime is: " + primes.get(primes.size() - 1));
	}

	public boolean isPrime(int number){
		boolean isPrime = true;

		for(int i = 2; i <= number; i++){
			if(number % i == 0 && i != number){
				isPrime = false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args){
		Problem7 p7 = new Problem7();
	}
}
