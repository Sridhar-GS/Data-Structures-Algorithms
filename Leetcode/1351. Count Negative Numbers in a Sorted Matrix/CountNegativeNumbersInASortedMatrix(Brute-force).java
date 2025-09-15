class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        for(int i=0; i<grid.length; i++){                      // Brute force using two loops
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}
