import java.util.ArrayList;

public class Problem12{
	
	public ArrayList<Integer> primeFactors;

	public Problem12(){
		int limit = 500;
		int counter = 1;
		int triangleNumber;
		int numDivisors;
		primeFactors = new ArrayList<Integer>();
		while(true){
			if(counter % 10000 == 0){
				System.out.println("----Trying " + counter);
			}

			triangleNumber = getTriangle(counter);
			numDivisors = getNumDivisors(triangleNumber);

			if(numDivisors > limit){
				break;
			}
			counter++;
		}
		System.out.println("First to have over " + limit + " divisors is " + triangleNumber + " with " + numDivisors + " divisors.");
	}

	public void getPrimeFactors(int number){

		

	}

	public int getNumDivisors(int number){
		int result = 0;
		for(int i = 1; i < number; i++){
			if(number % i == 0){
				result++;
			}
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
