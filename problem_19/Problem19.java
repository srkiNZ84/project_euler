public class Problem19{

	public Problem19(){
		int sumOfSundays = getSumFirstSundays(2, 1901);
		System.out.println("The total number of Sundays that fell on the 1st day of the month during the 20th century is: " + sumOfSundays);
	}

	public int getSumFirstSundays(int yearOffset, int year){
		if(year == 2001){
			return 0;
		}

		int leapYearOffset = 0;
		if(isLeapYear(year)){
			leapYearOffset = 1;
		}
		
		int totalSundayFirsts = 0;

		int[] firstsOfMonth = {1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};

		// Work out Sunday Firsts for this year
		for(int i = 0; i < firstsOfMonth.length; i++){
			if(i < 2){
				if((firstsOfMonth[i] + yearOffset) % 7 == 1){
					//System.out.println(year + " - Day " + firstsOfMonth[i] + " is a first of Month and a Sunday");
					totalSundayFirsts++;
				}
			}
			else{
				if((firstsOfMonth[i] + yearOffset + leapYearOffset) % 7 == 1){
					//System.out.println(year + " - Day " + firstsOfMonth[i] + " is a first of Month and a Sunday");
					totalSundayFirsts++;
				}
			}
		}
		//System.out.println("Year " + year + " has " + totalSundayFirsts + " Sundays which fall on the first of the month.");

		// Work out year Offset for next year
		int nextYearOffset = (yearOffset + (365 + leapYearOffset)) % 7;

		return totalSundayFirsts + getSumFirstSundays(nextYearOffset, year + 1);
	}

	public boolean isLeapYear(int year){
		if(year % 4 == 0 ){
			if(year % 100 == 0 && year % 400 != 0){
				//System.out.println(year + " is not a leap year.");
				return false;
			}
			//System.out.println(year + " is a leap year.");
			return true;
		}
		//System.out.println(year + " is not a leap year.");
		return false;
	}

	public static void main(String[] args){
		Problem19 p19 = new Problem19();
	}
}
