import java.io.*;

public class Problem22{

	public Problem22(){
		try{
			BufferedReader br = new BufferedReader(new FileReader("names.txt"));
			String line = br.readLine();

			System.out.println("Line was: " + line);

			String[] names = line.split(",");
			for(int i = 0; i < names.length; i++){
				names[i] = names[i].replace("\"", "");
				System.out.println("Name: " + names[i]);
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}

	public static void main(String[] args){
		Problem22 p22 = new Problem22();
	}
}
