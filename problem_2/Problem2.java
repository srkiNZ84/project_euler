public class Problem2{

	public int totalSum;

	Problem2(){
		totalSum = 2;

		int currentNumber = getFib(1,2);
		int previousNumber = 2;
		while(currentNumber <= 4000000){
			int temp = currentNumber;
			currentNumber = getFib(previousNumber,currentNumber);
			previousNumber = temp;

			if(currentNumber % 2 == 0 && currentNumber <= 4000000){
				totalSum += currentNumber;
			}
		}

		System.out.println("Total final sum is: " + totalSum);
	}

	public static void main(String[] args){
		Problem2 prob2 = new Problem2();
	}

	public int getFib(int firstTerm, int secondTerm){
		
		int thirdTerm = firstTerm + secondTerm;
		//System.out.println("Third term is: " + thirdTerm);
		
		return thirdTerm;
	
	}
}
