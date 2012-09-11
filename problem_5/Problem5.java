public class Problem5{
	public Problem5(){
		int number = 20;
		while(true){
			boolean isDivisible = true;
			number++;

			for(int i = 1; i <= 20; i++){
				if(number % i != 0){
					isDivisible = false;
				}
			}
			
			//System.out.println("Number " + number + " is " + isDivisible);

			if(isDivisible){
				System.out.println("Number " + number);
				break;
			}
		}
	}

	public static void main(String[] args){
		Problem5 p5 = new Problem5();
	}
}
