package tutorial1;

public class ArraysMulti {

	public static void main(String[] args) {
		
		int[][] grid = {
				{23,45,6785},
				{56,98},
				{45,90,12,3689,1}
		};
		for(int row=0;row<grid.length;row++) {
			for(int col=0;col<grid[row].length;col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
        
		String[][] texts = new String[2][3];
		 
		  texts[1][2] = "Alligned Data";
		  System.out.println(texts[1][2]);
		
	}

}
