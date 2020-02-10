

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
        int sum = 0;

        for(int r = 0; r < board.length;r++){
            for(int c = 0; c < board[r].length;c++){
                
            }
        }
        return sum;
    }

    public void evolution(int n){
        //call oneStep n times
        oneStep();
    }

    public void printBoard(){
        System.out.println("Current Board");
        System.out.println();
        for(int r = 0; r < board.length;r++){
            for(int c = 0; c < board[0].length;c++){
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("Previous Board");
        System.out.println();
        for(int r = 0; r < board.length;r++){
            for(int c = 0; c < board[0].length;c++){
                System.out.print(previous[r][c] + " ");
            }
            System.out.println();
        }
    }

}//end class
