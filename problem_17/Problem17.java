import java.util.*;

public class Problem17{

	public Map<Integer,String> numbersMap;
	
	public Problem17(){

		numbersMap = new HashMap<Integer,String>();
		initializeHash();
	
		int sum = 0;
		for(int i = 1; i < 1000;i++){
			sum += getNumLetters(i);
		}
		sum += 11; //Hack to add "one thousand" to the final total
		System.out.println("Total number of letters is: " + sum);
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
			int prefixLength = directLookup(number / 100).length();
                        int hundredLength = directLookup(100).length();

                        return prefixLength + hundredLength;
		}
		return 0;
	}

	public int getTens(int number){
		int remainder = number % 100;
		if(remainder > 19){
			if(remainder != 0){
				return directLookup((remainder / 10) * 10).length();
			}
		}
		return 0;
	}

	public int getOnes(int number){
		int remainder = number % 100;
		if(remainder < 20 && remainder > 0){
			return directLookup(remainder).length();
		}

		remainder = number % 10;
		if(number % 10 != 0){
			return directLookup(number % 10).length();
		}
		return 0;
	}

	public int getNumLetters(int number){

		int hundreds = getHundreds(number);
		int tens = getTens(number);
		int ones = getOnes(number);

		if(number % 100 == 0 || number < 100){
			return hundreds + tens + ones;
		}
		else{
			return hundreds + 3 + tens + ones;
		}

	}

	public String directLookup(int number){
		//System.out.println("Getting: " + numbersMap.get(number));
		return numbersMap.get(number);
	}

	public static void main(String[] args){
		Problem17 p17 = new Problem17();
	}
}
