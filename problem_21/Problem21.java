public class Problem21 {
	private int[] sumsDivisors;

	public Problem21(){
		Integer[] sumsDivisors = new Integer[10000];
		int sumOfAmicableNumbers = 0;
		int tempSum = 0;
		
		for(int i = 1; i < 10000; i++){
			tempSum = sumsDivisors[i] != null ? sumsDivisors[i] : getSumProperDivisors(i);
			sumsDivisors[i] = tempSum;
			
			if(tempSum < 9999){
				sumsDivisors[tempSum] = sumsDivisors[tempSum] != null ? sumsDivisors[tempSum] : getSumProperDivisors(tempSum);

				if(sumsDivisors[i] == tempSum && sumsDivisors[tempSum] == i && tempSum != i){
					System.out.println("Amicable numbers " + i + " and " + tempSum + " have been found.");
					sumOfAmicableNumbers += i;
				}
			}
		}
		System.out.println("The sum of all amicable numbers below 10,000 is: " + sumOfAmicableNumbers);
	}

	public int getSumProperDivisors(int number){
		Integer[] divisors = getProperDivisors(number);
		int returnSum = 0;

		//System.out.println("Divisors for number " + number + " are:");
		for(int i = 0; i < divisors.length; i++){
			//System.out.println(divisors[i]);
			returnSum += divisors[i];
		}
		//System.out.println("Sum of divisors for " + number + " is: " + returnSum);
		return returnSum;
	}

	public Integer[] getProperDivisors(int number){
		List<Integer> divisors = new ArrayList<Integer>();

		for(Integer i = 1; i <= number/2; i++){
			if(number % i == 0){
				divisors.add(i);
			}
		}

		Integer[] returnDivisors = new Integer[divisors.size()];
		divisors.toArray(returnDivisors);

		return returnDivisors;
	}

	public static void main(String[] args){
		Problem21 p21 = new Problem21();
	}
}
