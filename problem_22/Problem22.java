import java.io.*;
import java.util.*;

public class Problem22{

	public Problem22(){
		try{
			BufferedReader br = new BufferedReader(new FileReader("names.txt"));
			String line = br.readLine();

			//System.out.println("Line was: " + line);

			String[] names = line.split(",");
			for(int i = 0; i < names.length; i++){
				names[i] = names[i].replace("\"", "");
				//System.out.println("Name: " + names[i]);
			}

			List<String> sortedNames = quickSort(Arrays.asList(names));
			
			int grandTotal = 0;
			for(int i = 0; i < sortedNames.size(); i++){
				//System.out.println((i+1) + " Sorted name: " + sortedNames.get(i));
				int letterSum = getSumLetters(sortedNames.get(i));
				//System.out.println("Sum for name " + sortedNames.get(i) + " = " + letterSum);
				grandTotal = grandTotal + (letterSum * (i+1));
				//System.out.println("Grand total so far is " + grandTotal);	
			}

			System.out.println("Final grand total is: " + grandTotal);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}

	public int getSumLetters(String name){
		char[] chr = name.toCharArray();

		int total = 0;

		for(int i = 0; i < chr.length; i++){
			int charNum = (int)chr[i];
			int alphaConstant = 64;
			if(charNum <= 90 & charNum >= 64){
				//System.out.println("Character " + chr[i] + " = " + (charNum - alphaConstant));
				total += charNum - alphaConstant;
			}
		}
		return total;
	}

	public List<String> quickSort(List<String> toSort){
		//System.out.println("Size of list is: " + toSort.size());
		if(toSort.size() == 1){
			return toSort;
		}
		if(toSort.size() == 0){
			return new ArrayList<String>();
		}
		int pivot = toSort.size()/2;
		//System.out.println("Pivot is: " + pivot + ", with the word being: " + toSort.get(pivot));
		List<String> less = new ArrayList<String>();
		List<String> greater = new ArrayList<String>();
		for(int i = 0; i < toSort.size(); i++){
			if(i != pivot){
				if(toSort.get(i).compareTo(toSort.get(pivot)) < 0){
					//System.out.println("Comparing " + toSort.get(i) + " and " + toSort.get(pivot) + " finds that " + toSort.get(i) + " comes first.");
					less.add(toSort.get(i));
				}
				else if(toSort.get(i).compareTo(toSort.get(pivot)) > 0){
					//System.out.println("Comparing " + toSort.get(i) + " and " + toSort.get(pivot) + " finds that " + toSort.get(i) + " comes after.");
					greater.add(toSort.get(i));
				}
			}
		}

		//System.out.println("Size of the lesser list is: " + less.size());
		//System.out.println("Size of the greater list is: " + greater.size());
		less = quickSort(less);
		greater = quickSort(greater);
		less.add(toSort.get(pivot));
		List<String> returnList = less;
		returnList.addAll(greater);
		
		return returnList;
	}

	public static void main(String[] args){
		Problem22 p22 = new Problem22();
	}
}
