import java.util.List;
import java.util.ArrayList;

public class Problem23{

	public Problem23(){
		int limit = 28123;
		List<Integer> abundantNumbers = new ArrayList<Integer>();
		for(int i = 1; i <= limit; i++){
			if(isAbundant(i)){
				abundantNumbers.add(i);
				//System.out.println(i + " is an abundant number!");
			}
			//else{
			//	System.out.println(i + " is a deficient number!");
			//}
		}
		System.out.println("There are a total of " + abundantNumbers.size() + " abundant numbers.");

		boolean[] abundantSums = new boolean[limit];
		for(int i = 0; i < abundantNumbers.size(); i++){
			for(int j = 0; j < abundantNumbers.size(); j++){
				int sum = abundantNumbers.get(i) + abundantNumbers.get(j);
				if(sum < 28123){
					//System.out.println(sum + " is a sum of " + abundantNumbers.get(i) + " and " + abundantNumbers.get(j));
					abundantSums[sum] = true;
				}
			}
		}

		int totalSum = 0;
		for(int i = 0; i < abundantSums.length; i++){
			if(abundantSums[i] != true){
				totalSum += i;
				System.out.println(i + " is not able to be written as a sum of two abundant numbers.");
			}
		}

		System.out.println("Sum of all non abundant sums is: " + totalSum);
	}

	public boolean isAbundant(int number){
		Integer[] divisors = getDivisors(number);
		int total = 0;
		for(Integer i : divisors){
			total += i;
		}
		
		if(number < total){
			return true;
		}
		else if(number > total){
			return false;
		}
		return false;
	}

	public Integer[] getDivisors(int number){
		List<Integer> divisors = new ArrayList<Integer>();
		for(int i = 1; i < number; i++){
			if(number % i == 0){
				divisors.add(i);
			}
		}
		Integer[] returnDivisors = new Integer[divisors.size()];
		returnDivisors = divisors.toArray(returnDivisors);
		return returnDivisors;
	}

	public static void main(String[] args){
		Problem23 p23 = new Problem23();
	}
}
