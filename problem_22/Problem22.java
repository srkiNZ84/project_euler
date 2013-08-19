import java.io.*;

public class Problem22{

	public Problem22(){
		try{
			String currentLine;
                        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
                        String[] namesArray;
                        
                        while((currentLine = br.readLine()) != null){
				namesArray = currentLine.split(",");
				//System.out.println("There are a total of " + temp.length + " names.");
                                for(int i = 0; i < namesArray.length; i++){
                                        namesArray[i] = stripQuotes(namesArray[i]);
                                }
			}
			
			// TODO: Sort the list
			String[] orderedNamesArray = orderNames(namesArray);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	private String[] orderNames(String[] namesArray)
		int pivot = namesArray.length();
		
		for(int i = 0; i < namesArray.length(); i++){
			if(namesArray[i].compareTo(namesArray[pivot]) < 0){
				// the string being compared is less and should go "in front" of the pivot
			}
			else if(namesArray[i].comparedTo(namesArray[pivot]) > 0){
				// the string being compared is greater and should go "behind" the pivot
			}
			else{
				// the string being compared is the same. Nothing to be done
			}
		}
	}
	
	private String stripQuotes(String name){
		name = name.substring(1, name.length() -1);
		return name;
	}

	public static void main(String[] args){
		Problem22 p22 = new Problem22();
	}
}
