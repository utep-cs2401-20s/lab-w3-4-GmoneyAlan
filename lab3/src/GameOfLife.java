public class GameOfLife {
    int size;
    int[][] board;
    int[][] previous;

    GameOfLife() {
        size = 3;
        board = new int[size][size];
        previous = new int[size][size];
    }

    GameOfLife(int inputSize) {
        size = inputSize;
        board = new int[inputSize][inputSize];
        previous = new int[inputSize][inputSize];
    }

    GameOfLife(int[][] loadBoard) {
        board = new int[loadBoard.length][loadBoard[0].length];
        previous = new int[loadBoard.length][loadBoard[0].length];

        for (int r = 0; r < loadBoard.length; r++) {
            for (int c = 0; c < loadBoard[r].length; c++) {
                board[r][c] = loadBoard[r][c];
            }
        }

        for (int r = 0; r < loadBoard.length; r++) {
            for (int c = 0; c < loadBoard[r].length; c++) {
                previous[r][c] = loadBoard[r][c];
            }
        }
        printCBoard();
        System.out.println();
    }

    public int[][] getBoard() {
        return board;
    }

    public void oneStep() {
        //transform game to next evolution
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                previous[r][c] = board[r][c];
            }
        }

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                previous[r][c] = neighbors(r, c);
            }
        }

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (previous[r][c] == 1) {
                    board[r][c] = 0;

                } else if (previous[r][c] == 2 || previous[r][c] == 3) {
                    board[r][c] = 1;

                } else if (previous[r][c] > 3 && board[r][c] == 0){
                    board[r][c] = 1;
                }
                else if (previous[r][c] > 3) {
                    board[r][c] = 0;
                }
                if((previous[r][c] == 0) && board[r][c] == 1){
                    board[r][c] = 0;
                }

            }
        }//outside loop
        transformB();
    }

    public void transformB() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0) {
                    board[i][j] = 1;
                }
            }
        }
    }

    public int neighbors(int row, int col) {
        //find the neighbors of an index in the 2D array
        int sum = 0;

        if ((row - 1 >= 0) && (row - 1 < board[row].length)) {//top row
            if ((col - 1 >= 0) && (col - 1 < board.length))
                if (board[row - 1][col - 1] == 1)
                    sum++;//left column top row
            if (col + 1 < board.length)
                if (board[row - 1][col + 1] == 1)
                    sum++;//right Column top row
            if (board[row - 1][col] == 1) {
                sum++;
            }// middle column top row
        }//row above value


        //left column next to value
        if ((col - 1 >= 0) && (col - 1 < board.length))
            if (board[row][col - 1] == 1)
                sum++;//left Column

        //right column next to value
        if (col + 1 < board.length) {
            if (board[row][col + 1] == 1) {
                sum++;
            }// right col
        }


        //bot row
        if ((row + 1 >= 0) && (row + 1 < board[row].length)) {
            if ((col - 1 >= 0) && (col - 1 < board.length))
                if (board[row + 1][col - 1] == 1)
                    sum++;//left column bot row
            if (col + 1 < board.length)
                if (board[row + 1][col + 1] == 1)
                    sum++;//right Column bot row
            if (board[row + 1][col] == 1) {
                sum++;
            }// middle column bot row
        }//row below value

        return sum;
    }

    public void evolution(int n) {
        //call oneStep n times
        for (int i = 0; i < n; i++) {
            printCBoard();
            oneStep();
            printPboard();
        }
    }

    public void printPboard() {
        System.out.println("Previous Board");
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(previous[r][c] + " ");
            }
            System.out.println();
        }
    }

    public void printCBoard() {
        System.out.println("Current Board");
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }

}//end class
