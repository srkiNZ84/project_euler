import java.util.*;

public class Problem12{
	
	public ArrayList<Integer> primeFactors;
	public Map<Integer,Integer> primeFactorsAndCounts;

	public Problem12(){
		int limit = 8;
		int counter = 1;
		int triangleNumber;
		int numDivisors;
		primeFactors = new ArrayList<Integer>();
		while(true){

			triangleNumber = getTriangle(counter);
			numDivisors = getNumDivisors(triangleNumber);

			if(numDivisors > limit){
				break;
			}
			counter++;
		}
		System.out.println("First to have over " + limit + " divisors is " + triangleNumber + " with " + numDivisors + " divisors.");
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

	public void getPrimeFactorsAndCounts(int number){

		if(isPrime(number)){
			int count = primeFactorsAndCounts.containsKey(number) ? (Integer)primeFactorsAndCounts.get(number) : 0;
                        primeFactorsAndCounts.put(number, count + 1);
			return;
		}

		for(int i = 2; i < number; i++){
			if(number % i == 0 && isPrime(i)){
				int count = primeFactorsAndCounts.containsKey(i) ? (Integer)primeFactorsAndCounts.get(i) : 0;
				primeFactorsAndCounts.put(i, count + 1);

				int tempResult = number/i;

				getPrimeFactorsAndCounts(tempResult);
				break;
			}
		}
	}

	public int getNumDivisors(int number){
		
		primeFactorsAndCounts = new HashMap<Integer,Integer>();

		getPrimeFactorsAndCounts(number);

		System.out.println("Divisors of " + number + " are: " + primeFactorsAndCounts);

		int result = 1;
		int key;
		Set set = primeFactorsAndCounts.keySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			key = (Integer)itr.next();
			result *= primeFactorsAndCounts.get(key)+1;

			System.out.println("Result is: " + result);
		}

		return result;
	}

	public int getTriangle(int number){
		int triangleSum = 0;
		for(int i = 1; i <= number; i++){
			triangleSum += i;
		}
		return triangleSum;
	}

	public static void main(String[] args){
		Problem12 p12 = new Problem12();
	}
}
