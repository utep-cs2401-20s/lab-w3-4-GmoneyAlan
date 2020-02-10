

public class GameOfLife {
    int sizeRow = 1;
    int sizeCol = 1;
    int[][] board = new int[sizeRow][sizeCol];
    int[][] previous = new int[sizeRow][sizeCol];

    GameOfLife(){
        sizeRow = 1;
        sizeCol = 1;
    }

    GameOfLife(int inputSize){
        sizeRow = inputSize;
        sizeCol = inputSize;
    }

    GameOfLife(int[][] loadBoard){
        sizeRow = loadBoard.length;
        sizeCol = loadBoard[0].length;

        for(int r = 0; r < loadBoard.length; r++){
            for(int c = 0; c < loadBoard[r].length; c++){
                previous[r][c] = loadBoard[r][c];
            }
        }
    }

    public int[][] getBoard(){
        return board;
    }

    public void oneStep(){
        //transform game to next evolution
    }

    public int neighbors(int row, int col){
        //find the neighbors of an index in the 2D array
        return 0;
    }


}//end class
