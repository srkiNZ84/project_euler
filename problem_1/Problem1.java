
public class Problem1{

	public static void main(String[] args){
		
		System.out.println("Calculating total...");

		int total = 0;

		for(int i = 1; i < 1000; i++){
			if(i % 3 == 0){
				total += i;
				continue;
			}
			if(i % 5 == 0){
				total += i;
				continue;
			}
		}
		System.out.println("Total is: " + total);
	}
}
