import java.math.BigInteger;

public class Problem48{

	public Problem48(){
		int limitNumber = 1000;
		BigInteger sum = new BigInteger("0");
		for(int i = 1; i <= limitNumber; i++){
			BigInteger number = new BigInteger("" + i);
			number = number.pow(i);
			sum = sum.add(number);
		}

		System.out.println("Sum of all powers up to " + limitNumber + " is: " + sum);
	}

	public static void main(String[] args){
		Problem48 p48 = new Problem48();
	}
}
