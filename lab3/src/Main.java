
public class Main {
    public static void main(String[] args) {
        GameOfLife g;
        GameOfLife p;

        int[][] q = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        p = new TorusGameOfLife(q);

        int[][] a = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        //g = new GameOfLife(a);

        //g.evolution(4);

        p.evolution(5);
    }
}
