import java.text.DecimalFormat;

public class Problem10{

	public double totalSum;

	public Problem10(){
		totalSum = 0d;
		int currentNumber = 2;
		int limit = 2000000;
		while(true){
			if(currentNumber >= limit){
				break;
			}
			if(isPrime(currentNumber)){
				totalSum += currentNumber;
				//System.out.println("Found prime " + currentNumber + ". Total sum is " + totalSum);
			}
			if(currentNumber % 100000 == 0){
				System.out.println("Up to " + currentNumber);
			}
			currentNumber++;
		}
		System.out.println("Total sum of all primes below " + limit + " is: " + totalSum);
		String formatted = new DecimalFormat("#").format(totalSum);
		System.out.println("Formatted: " + formatted);
	}

	public boolean isPrime(int number){
		boolean isPrime = true;

		for(int i = 2; i <= number; i++){
			if(number % i == 0 && i != number){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args){
		Problem10 p10 = new Problem10();
	}
}
