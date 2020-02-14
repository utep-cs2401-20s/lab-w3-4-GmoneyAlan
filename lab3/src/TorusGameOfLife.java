public class TorusGameOfLife extends GameOfLife {

    public TorusGameOfLife(int[][] loadB) {
        super(loadB);
    }

    //inherit neighbors, oneStep, evolution
    @Override
    public int neighbors(int row, int col) {
        int sum = 0;
        int rowI = row;
        int colI = col;
        //use modulus
        /*
            row (+1 or -1 or +0) % (7)
         */
        if(row - 1 < 0){
            row = (Math.floorMod((row - 1), board.length)) + 1;
        }


        if ((row - 1 >= 0)) {//top row
           if(col - 1 < 0){
               col = (Math.floorMod(col - 1, board[row - 1].length)) + 1;
           }
            if (col - 1 >= 0)
                if (board[row - 1][col - 1] == 1)
                    sum++;//left column top row
            col = colI;
            if(col + 1 > board.length - 1){
                col = ((col)% board.length - 1);
            }
            if (col + 1 < board.length)
                if (board[row - 1][col + 1] == 1)
                    sum++;//right Column top row
            col = colI;
            if (board[row - 1][col] == 1) {
                sum++;
            }// middle column top row
        }//row above value

        row = rowI;
        //left column next to value
        if(col - 1 < 0){
            col = (Math.floorMod(col - 1, board[row].length)) + 1;
        }
        if ((col - 1 >= 0) && (col - 1 < board.length))
            if (board[row][col - 1] == 1)
                sum++;//left Column
        col = colI;
        //right column next to value
        if(col + 1 > board.length - 1){
            col = ((col)% board.length - 1);
        }
        if (col + 1 < board.length) {
            if (board[row][col + 1] == 1) {
                sum++;
            }// right col
        }
        col = colI;
        row = rowI;
        if(row + 1 > board.length - 1){
            row = (Math.floorMod(row,board.length));
        }
        //bot row
        if ((row + 1 >= 0) && (row + 1 < board[row].length)) {
            if(col - 1 < 0){
                col = (Math.floorMod(col - 1, board[row + 1].length)) + 1;
            }
            if ((col - 1 >= 0) && (col - 1 < board.length))
                if (board[row + 1][col - 1] == 1)
                    sum++;//left column bot row
            col = colI;
            if(col + 1 > board.length - 1){
                col = ((col)% board.length - 1);
            }
            if (col + 1 < board.length)
                if (board[row + 1][col + 1] == 1)
                    sum++;//right Column bot row
            if (board[row + 1][col] == 1) {
                sum++;
            }// middle column bot row
        }//row below value
        return sum;
    }
}