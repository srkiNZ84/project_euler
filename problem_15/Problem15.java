import java.text.*;

public class Problem15{

	public Problem15(){
		Double fortyFactorial = getFactorial(40.0);
		Double twentyFactorial = getFactorial(20.0);

		Double result = fortyFactorial/(twentyFactorial*twentyFactorial);
		
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Total number of moves is: " + df.format(result));
	}

	public Double getFactorial(Double number){
                Double result = 1.0;
                for(Double i = number; i >= 1;i--){
                                result *= i;
                }
                return result;
        }

	public static void main(String[] args){
		Problem15 p15 = new Problem15();
	}
}
