import java.util.*;

public class Problem17{

	public Map<Integer,String> numbersMap;
	
	public Problem17(){

		numbersMap = new HashMap<Integer,String>();
		initializeHash();
	
		int sum = 0;
		for(int i = 1; i <= 30;i++){
			sum += getNumLetters(i);
		}
		System.out.println("Total number of letters is: " + sum);

		System.out.println("Number of letters in 300 (three hundred) should be 12: " + getNumLetters(300));
		System.out.println("Number of letters in 42 (forty-two) should be 8: " + getNumLetters(42));
		System.out.println("Number of letters in 342 (three hundred and forty-two) should be 23: " + getNumLetters(342));

	}

	public void initializeHash(){
		numbersMap.put(1,"one");
		numbersMap.put(2,"two");
		numbersMap.put(3,"three");
		numbersMap.put(4,"four");
		numbersMap.put(5,"five");
		numbersMap.put(6,"six");
		numbersMap.put(7,"seven");
		numbersMap.put(8,"eight");
		numbersMap.put(9,"nine");
		numbersMap.put(10,"ten");
		numbersMap.put(11,"eleven");
		numbersMap.put(12,"twelve");
		numbersMap.put(13,"thirteen");
		numbersMap.put(14,"fourteen");
		numbersMap.put(15,"fifteen");
		numbersMap.put(16,"sixteen");
		numbersMap.put(17,"seventeen");
		numbersMap.put(18,"eighteen");
		numbersMap.put(19,"nineteen");
		numbersMap.put(20,"twenty");
		numbersMap.put(30,"thirty");
		numbersMap.put(40,"forty");
		numbersMap.put(50,"fifty");
		numbersMap.put(60,"sixty");
		numbersMap.put(70,"seventy");
		numbersMap.put(80,"eighty");
		numbersMap.put(90,"ninety");
		numbersMap.put(100,"hundred");
	}

	public int getHundreds(int number){
		if(number > 99){
			int prefixLength = directLookup(number/100).length();
                        int hundredLength = directLookup(100).length();

                        return prefixLength + hundredLength;
		}
		
		return 0;
	}

	public int getTens(int number){
		if(number > 19){

		}
		return 0;
	}

	public int getNumLetters(int number){

		int hundreds = getHundreds(number);
		int tens = getTens(number);
		int ones = getOnes(number);

		if(hundreds > 0 && (tens + ones) > 0){
			hundreds += 3;
		}

		return getHundreds(number) + 3 + getTens(number) + getOnes(number);

		if(number < 20){
			return directLookup(number).length();
		}
		else if(number % 100 == 0){
			int prefixLength = directLookup(number/100).length();
			int hundredLength = directLookup(100).length();

			return prefixLength + hundredLength;
		}
		else if(number % 10 == 0 && number < 100){
			return directLookup(number).length();
		}
		else if(number > 20 && number < 100){
			int prefixLength = directLookup((number/10)*10).length();
			int suffixLength = directLookup(number%10).length();

			return prefixLength + suffixLength;
		}
		else{
			int hundredLength = directLookup((number/100)*100).length();
			int  
		}

		return 0;
	}

	public String directLookup(int number){
		System.out.println("Getting: " + numbersMap.get(number));
		return numbersMap.get(number);
	}

	public static void main(String[] args){
		Problem17 p17 = new Problem17();
	}
}
