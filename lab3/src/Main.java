
public class Main {
    public static void main(String[] args) {
        GameOfLife g;
        GameOfLife p;

        int[][] q = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
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
        int e = Math.abs(3) % 3;
        int jh = Math.floorMod(-1,3);
        System.out.println(jh + " " + e);
        p.evolution(5);
    }
}
