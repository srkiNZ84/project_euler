import java.lang.Math.*;

public class Problem6 {

	public Problem6(){

		double test = java.lang.Math.pow(5,2);
		System.out.println(test);

		double sumOfSquares = getSumOfSquares(100);
		double squareOfSums = getSquareOfSums(100);
		double result = squareOfSums - sumOfSquares;

		System.out.println("Sum of squares is: " + sumOfSquares + ", square of sums is: " + squareOfSums + ". Difference is: " + (int)result);
	}

	public double getSumOfSquares(double number){
		double total = 0;

		for(double i = 1; i <= number; i++){
			total += java.lang.Math.pow(i,2);
		}

		return total;
	}

	public double getSquareOfSums(double number){
		double total = 0;
		for(double i = 1; i <= number; i++){
			total += i;
		}
		return java.lang.Math.pow(total,2);
	}

	public static void main(String[] args){
		Problem6 p6 = new Problem6();
	}
}
