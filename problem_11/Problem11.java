import java.io.*;

public class Problem11{

	public int[][] grid;
	int largestProduct;

	public Problem11(){
		grid = new int[20][20];
		largestProduct = 0;
		initializeGrid();

		//Work out vertical products
		getVerticalProducts();
		//Work out horizontal sums
		getHorizontalProducts();
		//Work out diagonal sums
		getDiagonalProducts();
		//Work out other diagonal sums
		getOtherDiagonalProducts();
		System.out.println("Greatest product is: " + largestProduct);
	}

	public void getOtherDiagonalProducts(){
		int product;
		for(int x = 0; x < 17; x++){
			for(int y = 0; y < 17; y++){
				product = grid[x][y+3] * grid[x+1][y+2] * grid[x+2][y+1] * grid[x+3][y];
				if(product > largestProduct){
					System.out.println("Found new heigh. Product of: " + grid[x][y+3] + "," + grid[x+1][y+2] + "," + grid[x+2][y+1] + "," + grid[x+3][y]);
					largestProduct = product;
				}
			}
		}
	}

	public void getDiagonalProducts(){
		int product;
		for(int x = 0; x < 17; x++){
			for(int y = 0; y < 17; y++){
				product = grid[x][y] * grid[x+1][y+1] * grid[x+2][y+2] * grid[x+3][y+3];
				if(product > largestProduct){
					System.out.println("Found new heigh. Product of: " + grid[x][y] + "," + grid[x+1][y+1] + "," + grid[x+2][y+2] + "," + grid[x+3][y+3]);
					largestProduct = product;
				}
			}
		}
	}

	public void getHorizontalProducts(){
		int product;
		for(int y = 0; y < 20; y++){
			for(int x = 0; x < 17; x++){
				product = grid[x][y] * grid[x+1][y] * grid[x+2][y] * grid[x+3][y];
				if(product > largestProduct){
					System.out.println("Found new hight. Product of: " + grid[x][y] + "," + grid[x+1][y] + "," + grid[x+2][y] + "," + grid[x+3][y]);
					largestProduct = product;
				}
			}
		}
	}

	public void getVerticalProducts(){
		int product;
		//For each row
		for(int x = 0; x < 20; x++){
			for(int y = 0; y < 17; y++){
				product = grid[x][y] * grid[x][y+1] * grid[x][y+2] * grid[x][y+3];
				if(product > largestProduct){
					System.out.println("Found new high. Product of: " + grid[x][y] + "," + grid[x][y+1] + "," + grid[x][y+2] + "," + grid[x][y+3]);
					largestProduct = product;
				}
			}
		}
	}

	public void initializeGrid(){
		try{
			String currentLine;
			BufferedReader br = new BufferedReader(new FileReader("number_file"));
			int xValue = 0;
			while((currentLine = br.readLine()) != null){
				String[] temp = currentLine.split(" ");
				for(int i = 0; i < temp.length; i++){
					grid[i][xValue] = Integer.parseInt(temp[i]);
				}
				xValue++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//for(int x = 0; x < 20; x++){
		//	for(int y = 0; y < 20; y++){
		//		System.out.print(grid[x][y]);
		//	}
		//	System.out.print("\n");
		//}
	}

	public static void main(String[] args){
		Problem11 p11 = new Problem11();
	}
}
