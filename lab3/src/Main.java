
public class Main {
    public static void main(String[] args) {
        GameOfLife g;

        int[][] a = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        g = new GameOfLife(a);

        g.evolution(3);
        g.printCBoard();
    }
}
