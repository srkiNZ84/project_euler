import java.util.ArrayList;

public class Problem7 {
	
	public ArrayList<Double> primes;

	public Problem7(){
		primes = new ArrayList<Double>();
		primes.add(2d);
		primes.add(3d);
		primes.add(5d);
		primes.add(7d);
		primes.add(11d);
		primes.add(13d);

		double number = 13d;
		while(true){
			number++;
			if(isPrime(number)){
				primes.add(number);
			}

			//TODO: Check the size of the ArrayList and see if we've gotten to the 10 001st element
		}
	}

	public static void main(String[] args){
		Problem7 p7 = new Problem7();
	}
}
