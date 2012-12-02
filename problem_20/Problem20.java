import java.math.BigInteger;

public class Problem20{

	public Problem20(){
		BigInteger number = new BigInteger("100");

		BigInteger result = getFactorial(number);

		System.out.println("Result of " + number + "! is: " + result);

		String[] digits = result.toString().split("");
		int sum = 0;
		for(int i = 1; i < digits.length; i++){
			sum += Integer.parseInt(digits[i]);
			System.out.println("Digit: " + digits[i]);
		}
		System.out.println("Sum of the digits is: " + sum);
	}

	public BigInteger getFactorial(BigInteger number){

		if(number.compareTo(new BigInteger("2")) == 0){
			//BigInteger two = new BigInteger("2");
			return number;//two;
		}
		BigInteger nextFactorial = getFactorial(number.subtract(new BigInteger("1")));
		return number.multiply(nextFactorial);
	}

	public static void main(String[] args){
		Problem20 p20 = new Problem20();
	}
}
