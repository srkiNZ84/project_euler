public class Problem14{

	public int[] chainLength;

	public Problem14(){

		chainLength = new int[2];
		chainLength[0] = 0;
		chainLength[1] = 0;
		int chainLen;
		for(int i = 1; i < 1000000; i++){
			chainLen = iteration(i);

			if(chainLen >= chainLength[1]){
				chainLength[0] = i;
				chainLength[1] = chainLen;
				
				System.out.println("Found the next longest chain for number " + i + ", with length " + chainLen);
			}
		
			//System.out.println("The chain length for the number " + i + " is " + chainLen);	
		}
	}

	public int iteration(int number){
		int length = 1;
	
		if(number == 1){
			return length;
		}
		else if(number % 2 == 0){
			int recursiveLength = iteration(number/2);
			return length + recursiveLength;
		}
		else if(number % 2 == 1){
			int recursiveLength = iteration((number*3)+1);
			return length + recursiveLength;
		}
		return length;		
	}

	public static void main(String[] args){
		Problem14 p14 = new Problem14();
	}
}
