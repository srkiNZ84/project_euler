public class Problem14{

	public Problem14(){
		long[] chainLength = new long[2];
		chainLength[0] = 0;
		chainLength[1] = 0;
		long chainLen;

		for(long i = 1000000; i > 1; i--){
			chainLen = iteration(i);

			if(chainLen > chainLength[1]){
				chainLength[0] = i;
				chainLength[1] = chainLen;
			}
		}
		System.out.println("The greatest chain length is for the number " + chainLength[0] + ", which has a chain length of " + chainLength[1]);
	}

	public long iteration(long number){
		long length = 1;
	
		if(number == 1){
			return length;
		}
		else if(number % 2 == 0){
			long recursiveLength = iteration(number/2);
			return length += recursiveLength;
		}
		else if(number % 2 == 1){
			long recursiveLength = iteration((number*3)+1);
			return length += recursiveLength;
		}
		return 0;
	}

	public static void main(String[] args){
		Problem14 p14 = new Problem14();
	}
}
