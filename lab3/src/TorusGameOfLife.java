public class TorusGameOfLife extends GameOfLife {

    public TorusGameOfLife(){
        super();
    }
    public TorusGameOfLife(int size){
        super(size);
    }
    public TorusGameOfLife(int[][] loadB)
    {
        super(loadB);
    }

    @Override
    public int neighbors(int row, int col) {

        int sum = 0;

        if(board[Math.floorMod(row - 1,board.length)][Math.floorMod(col - 1, board.length)] == 1) {     //left column
            sum++;
        }
        if(board[Math.floorMod(row - 1, board.length)][Math.floorMod(col, board.length)] == 1) {    //middle column
            sum++;
        }
        if(board[Math.floorMod(row - 1, board.length)][Math.floorMod(col + 1,board.length)] == 1) {     // right column
            sum++;
        }


        // same row //
        if(board[Math.floorMod(row, board.length)][Math.floorMod(col - 1, board.length)] == 1) {    // left column
            sum++;
        }
        if(board[Math.floorMod(row, board.length)][Math.floorMod(col + 1, board.length)] == 1) {    //right column
            sum++;
        }


        // bottom row //
        if(board[Math.floorMod(row + 1, board.length)][Math.floorMod(col - 1, board.length)] == 1) {    // left column
            sum++;
        }
        if(board[Math.floorMod(row + 1, board.length)][Math.floorMod(col, board.length)] == 1) {    //middle column
            sum++;
        }
        if(board[Math.floorMod(row + 1, board.length)][Math.floorMod(col + 1, board.length)] == 1) {    // right column
            sum++;
        }

        return sum;
    }




}