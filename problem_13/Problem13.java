import java.io.*;

public class Problem13{

	public Problem13(){

		Double[] numbers = new Double[100];

		Double sum = 0.0;

		try{
			String currentLine;
                        BufferedReader br = new BufferedReader(new FileReader("number_file"));
			int index = 0;
                        while((currentLine = br.readLine()) != null){
				System.out.println("Current Line: " + currentLine);
				//numbers[index] = Float.parseFloat(currentLine);
				sum += Double.parseDouble(currentLine);
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}

		System.out.println("Sum of numbers is: " + sum);
	}

	public static void main(String[] args){
		Problem13 p13 = new Problem13();
	}
}
