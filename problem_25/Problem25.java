import java.util.List;
import java.util.ArrayList;

public class Problem25{

	public Problem25(){
		System.out.println("F1 is: 1\t1");
		System.out.println("F2 is: 1\t1");
		fibionacci();
	}

	public void fibionacci(){
		int n = 3;
		int nold = 1;
		int noldold = 1;
		int funcResult = 0;
		int numDigits = 0;
		double divisor = 0;

		while(true){
			if(n >= 50){
				System.out.println("Hit limt. Exiting.");
				System.exit(0);
			}
			funcResult = nold + noldold;
			numDigits = getDigits(funcResult);
			divisor = (n/5)+0.5;
			System.out.println("F" + n + " is: " + funcResult + "\t" + getDigits(funcResult) + "\t" + divisor);
			noldold = nold;
			nold = funcResult;
			n++;
		}
	}

	public int getDigits(int n){
		int length = 0;
		length = Integer.toString(n).length();
		return length;
	}

	public static void main(String[] args){
		Problem25 p25 = new Problem25();
	}
}
