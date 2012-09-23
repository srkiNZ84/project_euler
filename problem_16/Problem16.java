import java.math.BigInteger;

public class Problem16{

	public Problem16(){
		BigInteger result = new BigInteger("2");
		result = result.pow(1000);

		System.out.println("Resulting number is: " + result);

		String digits = result.toString();
		int sum = 0;
		for(int i = 0; i < digits.length(); i++){
			sum += Character.digit(digits.charAt(i),10);
		}
		System.out.println("Sum of digits is: " + sum);
	}

	public static void main(String[] args){
		Problem16 p16 = new Problem16();
	}
}
