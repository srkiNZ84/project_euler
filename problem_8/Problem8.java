import java.io.*;
import java.util.ArrayList;

public class Problem8{

	public ArrayList<Integer> numbers;

	public Problem8(){
		try{
			String currentLine;
			numbers = new ArrayList<Integer>();
			BufferedReader br = new BufferedReader(new FileReader("number_file"));

			while((currentLine = br.readLine()) != null){
				//System.out.println(currentLine + " - ");
				String[] temp = currentLine.split("");
				for(int i = 1; i < temp.length; i++){
					//System.out.println(temp[i]);
					numbers.add(Integer.parseInt(temp[i]));
				}
			}
			System.out.println("The final array of numbers has " + numbers.size() + " values.");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

		int greatestProduct = getGreatestProduct(numbers);

		System.out.println("The greatest product is: " + greatestProduct);
	}

	public int getGreatestProduct(ArrayList<Integer> numberList){
		int result = 0;
		int tempResult;

		for(int i = 0; i < numberList.size() - 5; i++){
			tempResult = numberList.get(i) * numberList.get(i+1) * numberList.get(i+2) * numberList.get(i+3) * numberList.get(i+4);
			if(tempResult > result){
				result = tempResult;
			}
		}

		return result;
	}

	public static void main(String[] args){
		Problem8 p8 = new Problem8();
	}
}
