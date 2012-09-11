public class Problem4{

	public int largestPalindrome;

	public Problem4(){

		System.out.println(isPalindrome(5233));
		System.out.println(isPalindrome(9009));

		largestPalindrome = 0;

		System.out.println("Largest palindrome is: " + getLargestPalindrome());
	}

	public int getLargestPalindrome(){
		for(int i = 999; i > 1; i--){
			for(int j = 999; j > 1; j--){
				int result = i * j;
				//System.out.println("Checking if " + i + " * " + j + " = " + result + " is a palindrome.");
				if(isPalindrome(result) && result > largestPalindrome){
					System.out.println("Got a new high: " + result + ". Product of " + i + " and " + j);
					largestPalindrome = result;
				}
			}	
		}
		return largestPalindrome;
	}

	public boolean isPalindrome(int number){
		char[] digits = Integer.toString(number).toCharArray();

		//System.out.println("Length is: " + digits.length);

		for(int i = 0; i <= digits.length - 1; i++){

			//System.out.println("Comparing digits " + digits[i] + " and " + digits[digits.length - 1 - i]);
			if(digits[i] != digits[digits.length - 1 - i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
	
		Problem4 p4 = new Problem4();

		
	}
}
