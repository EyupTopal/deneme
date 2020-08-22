public class Gol {

    public static int[][] A_INFINITY_BOARD_9x9 = new int[][]{//
            {0, 0, 0, 1, 1, 1, 0, 0, 0}, // birincisatir
            {0, 0, 1, 0, 0, 0, 1, 0, 0}, //
            {0, 0, 1, 0, 0, 0, 1, 0, 0}, //
            {0, 0, 1, 0, 0, 0, 1, 0, 0}, //
            {0, 0, 1, 1, 1, 1, 1, 0, 0}, //
            {0, 0, 1, 0, 0, 0, 1, 0, 0}, //
            {0, 0, 1, 0, 0, 0, 1, 0, 0}, //
            {0, 0, 1, 0, 0, 0, 1, 0, 0}, //
            {0, 0, 1, 0, 0, 0, 1, 0, 0}};

    public static void main(String[] args) {

        System.out.println("number of alive cells: " + getNumberOfAliveCells(A_INFINITY_BOARD_9x9));

    }

    public static int getNumberOfAliveCells(int[][] board) {
        int aliveCells = 0;//{ 0, 0, 0, 1, 1, 1, 0, 0, 0 }
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 1) {
                    aliveCells = aliveCells + 1;
                }
            }
        }
        return aliveCells;

    }
    public static int getNumberOfAliveCells2(int[][] board) {
        return 0;
    }

    public static void nextGeneration(int board [][], int next [][]){
    int neighbours=0;
       int x = 0,y=0;
        neighbours=getAliveNeighbourCount (x,y,board);

        if ((board [x][y]==1)&& (neighbours<2)) next [x][y]=0; //loneliness
else if ((board [x][y]==1)&&(neighbours>3)) next[x][y]=0; //overpopulation
else if (board [x][y]==0 && (neighbours==3)) next[x][y]=1; //live
        next[x][y]= board[x][y]; //statis
    }
    public static int getAliveNeighbourCount (int i,int j,int[][]grid){
        int sum=0;
        for(int  k=-1;k<2;k++){
            for(int l=-1; l<2;l++){

                sum+=grid[k+i][j+l];}}
  return sum;
    }



    }




