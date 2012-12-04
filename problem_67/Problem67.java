import java.io.*;
import java.util.ArrayList;

public class Problem67{

	public Problem67(){

		int[][] triangle = readFile("triangle.txt");

		for(int i = triangle.length - 2; i >= 0; i--){
			//int[] row = triangle[i];
			System.out.print("row " + i + ":");
			for(int j = 0; j < triangle[i].length; j++){
				System.out.print(triangle[i][j] + " ");
				if(triangle[i+1][j] > triangle[i+1][j+1]){
					triangle[i][j] += triangle[i+1][j];
				}
				else{
					triangle[i][j] += triangle[i+1][j+1];
				}
			}
			System.out.println("\nFinal result is:\t" + triangle[0][0]);
		}
	}

	public int[][] readFile(String filename){
		try{
                        String currentLine;
                        BufferedReader br = new BufferedReader(new FileReader(filename));
                        
			// Get the number of rows in the file
			int numRows = 0;
                        while((currentLine = br.readLine()) != null){
                                numRows++;
                        }
                        br = null;
                        
			int[][] triangle = new int[numRows][];

                        br = new BufferedReader(new FileReader(filename));
                        int rowCount = 0;
                        while((currentLine = br.readLine()) != null){
                                String[] temp = currentLine.split(" ");
                                int[] row = new int[temp.length];
                                for(int i = 0; i < temp.length; i++){
                                        row[i] = Integer.parseInt(temp[i]);
                                }
                                triangle[rowCount] = row;
                                rowCount++;
                        }

			return triangle;
                }
                catch(Exception ex){
                        System.out.println(ex);
			return null;
                }
	}

	public static void main(String[] args){
		Problem67 p67 = new Problem67();
	}
}
