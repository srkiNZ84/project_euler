import java.lang.Math;

public class Problem9{

	public Problem9(){
		for(int c = 1000; c > 0; c--){
			for(int b = c-1; b > 0; b--){
				for(int a = b-1; a > 0; a--){
					if(a + b + c == 1000){
						//System.out.println("Numbers add up to 1000. a = " + a + ", b = " + b + ", c = " + c);
						int sumOfSquares = (int)java.lang.Math.pow(a,2) + (int)java.lang.Math.pow(b,2);
						int cSquared = (int)java.lang.Math.pow(c,2);
						if(sumOfSquares == cSquared){
							System.out.println("Pythagorean triple! a = " + a + ", b = " + b + ", c = " + c);
							int product = a * b * c;
							System.out.println("Product of abc is: " + product);
							break;
						}
					}
				}
			}
		}
	}

	public static void main(String[] args){
		Problem9 p9 = new Problem9();
	}
}
