public class Solution {
	public static void main(String[] args) {
		char numI[][]={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
	int result=numIslands(numI);
	System.out.println(result);
	}
    public static int numIslands(char[][] grid) {
        int count = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    getRegions(grid, i, j);
                }
            }
        }
        return count;
    }
    
    public static void getRegions(char[][] grid,int row,int column)
    {
        if(row<0 || row>=grid.length || column<0 || column>=grid[row].length || grid[row][column]=='0')
            return;
       
        grid[row][column]=0;
        
                getRegions(grid,row+1,column);
               getRegions(grid,row-1,column);
               getRegions(grid,row,column-1);
              getRegions(grid,row,column+1);
        return;
                
    }
}
