

public class GameOfLife {
   // int sizeRow = 1;
    //int sizeCol = 1;
    int[][] board;
    int[][] previous;

    GameOfLife(){
        board = new int[3][3];
        previous = new int[3][3];
    }

    GameOfLife(int inputSize){
        board = new int[inputSize][inputSize];
        previous = new int[inputSize][inputSize];
    }

    GameOfLife(int[][] loadBoard){
        board = new int[loadBoard.length][loadBoard[0].length];
        previous = new int[loadBoard.length][loadBoard[0].length];

        for(int r = 0; r < loadBoard.length; r++){
            for(int c = 0; c < loadBoard[r].length; c++){
                board[r][c] = loadBoard[r][c];
            }
        }

        for(int r = 0; r < loadBoard.length; r++){
            for(int c = 0; c < loadBoard[r].length; c++){
                previous[r][c] = loadBoard[r][c];
            }
        }

        printCBoard();
    }

    public int[][] getBoard(){
        return board;
    }

    public void oneStep(){
        //transform game to next evolution
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                previous[r][c] = board[r][c];
            }
        }

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                board[r][c] = neighbors(r,c);
            }
        }

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                if(board[r][c] < 2 && board[r][c] > 0){
                    board[r][c] = 0;
                    break;
                }
                if(board[r][c] == 2 || board[r][c] == 3){
                    board[r][c] = 1;
                    break;
                }
                if(board[r][c] > 3){
                    board[r][c] = 0;
                }
            }
        }//outside loop
            printBoard();
    }

    public int neighbors(int row, int col){
        //find the neighbors of an index in the 2D array
        int sum = 0;
        boolean[] valueExists = new boolean[4];

        if((row - 1 >= 0) && (row - 1 < board.length)){
            valueExists[0] = true; //top col
        }
        if((row + 1 >= 0) && (row + 1 < board.length)){
            valueExists[1] = true;//bot col
        }
        if((col - 1 >= 0) && (col - 1 < board.length)){
            valueExists[2] = true;//left col
        }
        if((col + 1 >= 0) && (col + 1 < board.length)){
            valueExists[3] = true;// right col
        }


        for(int r = 0; r < board.length;r++){
            for(int c = 0; c < board[r].length;c++){
                if(valueExists[0]){
                    if(valueExists[2])
                        if(board[row - 1][col - 1] == 1)
                            sum++;//left column top row
                    if(valueExists[3])
                        if(board[row - 1][col + 1] == 1)
                            sum++;//right Column top row
                    if(board[row - 1][col] == 1){
                        sum++;
                    }// middle column top row
                }//row above value

                //left column next to value
                if(valueExists[2])
                    if(board[row][col - 1] == 1)
                        sum++;//right Column bot row

                //right column next to value
                if(valueExists[3]) {
                    if (board[row][col + 1] == 1) {
                        sum++;
                    }// middle column bot row
                }
                if(valueExists[1]){
                    if(valueExists[2])
                        if(board[row + 1][col - 1] == 1)
                            sum++;//left column bot row
                    if(valueExists[3])
                        if(board[row + 1][col + 1] == 1)
                            sum++;//right Column bot row
                    if(board[row + 1][col] == 1){
                        sum++;
                    }// middle column bot row
                }//row below value

            }
        }
        return sum;
    }

    public void evolution(int n){
        //call oneStep n times
        for(int i = 0; i < n; i++) {
            oneStep();
        }
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

    public void printPboard(){
        System.out.println("Previous Board");
        System.out.println();
        for(int r = 0; r < board.length;r++){
            for(int c = 0; c < board[0].length;c++){
                System.out.print(previous[r][c] + " ");
            }
            System.out.println();
        }
    }

    public void printCBoard(){
        System.out.println("Current Board");
        System.out.println();
        for(int r = 0; r < board.length;r++){
            for(int c = 0; c < board[0].length;c++){
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }

}//end class
