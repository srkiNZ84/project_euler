import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;

public class Problem25{

	public Problem25(){
		System.out.println("F1 is: 1\t1");
		System.out.println("F2 is: 1\t1");
		fibionacci();
	}

	public void fibionacci(){
		BigInteger n = new BigInteger("3");
		BigInteger nminus1 = new BigInteger("1");
		BigInteger nminus2 = new BigInteger("1");
		BigInteger funcResult = new BigInteger("0");
		
		BigInteger limit = new BigInteger("10");
		limit = limit.pow(999);
		//System.out.println("Limit is: " + limit);

		while(true){
			if(funcResult.compareTo(limit) >= 0){
				System.out.println("Hit limt. Exiting.");
				System.exit(0);
			}
			funcResult = nminus1.add(nminus2);
			System.out.println("F" + n);
			nminus2 = nminus1;
			nminus1 = funcResult;
			n = n.add(BigInteger.ONE);
		}
	}

	public static void main(String[] args){
		Problem25 p25 = new Problem25();
	}
}
