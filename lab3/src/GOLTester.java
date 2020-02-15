import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GOLTester {
        /*
        The following boards will be used to test the methods
            in GameOfLife and the torus version
         */
        int[][] b1 = {

                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        int[][] b2 = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
        };
        int[][] b3 = {
                {0,0,0,0,0,0},
                {0,1,1,0,0,0},
                {0,1,1,0,0,0},
                {0,0,0,1,1,0},
                {0,0,0,1,1,0},
                {0,0,0,0,0,0},
        };
        int[][] b4 = {
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
        };
        /*
            The following test cases are going to be for Game Of Life
            Starting off with neighbors()
         */
        @Test
        public void testNeighbors1(){
            GameOfLife test1 = new GameOfLife(b1);
            test1.neighbors(1,2);
            //expected output:
            assertEquals(3, test1.neighbors(1,2));
        }

        @Test
        public void testNeighbors2(){
            GameOfLife test1 = new GameOfLife(b2);
            test1.neighbors(2,3);
            //expected output:
            assertEquals(4, test1.neighbors(2,3));
        }

        @Test
        public void testNeighbors3(){
            GameOfLife test1 = new GameOfLife(b3);
            test1.neighbors(0,0);
            //expected output:
            assertEquals(1, test1.neighbors(0,0));
        }

        @Test
        public void testNeighbors4(){
            GameOfLife test1 = new GameOfLife(b4);
            test1.neighbors(9,5);
            //expected output:
            assertEquals(1, test1.neighbors(9,5));
        }

        @Test
        public void testNeighbors5(){
            GameOfLife test1 = new GameOfLife(b1);
            test1.neighbors(4,4);
            //expected output:
            assertEquals(0, test1.neighbors(4,4));
        }

    /*
        Next method is oneStep()
     */

        @Test
        public void testOneStep1(){
            GameOfLife test1 = new GameOfLife(b1);
            test1.printCBoard();
            test1.oneStep();
            //expected Output:
            test1.printCBoard();
        }

        @Test
        public void testOneStep2(){
            GameOfLife test1 = new GameOfLife(b3);
            test1.printCBoard();
            test1.oneStep();
            test1.printCBoard();
            test1.oneStep();
            //expected Output:
            test1.printCBoard();
        }

        @Test
        public void testOneStep3(){
            GameOfLife test1 = new GameOfLife(b2);
            test1.printCBoard();
            for(int i = 1; i < 4; i++){
                test1.printCBoard();
                test1.oneStep();
            }
            //Expected Output:
            test1.printCBoard();
        }

        @Test
        public void testOneStep4(){
            GameOfLife test1 = new GameOfLife(b2);
            for(int i = 1; i < 15; i++){
                test1.printCBoard();
                test1.oneStep();
            }
            //Expected Output:
            test1.printCBoard();
        }

        @Test
        public void testOneStep5(){
            GameOfLife test1 = new GameOfLife(b4);
            for(int i = 1; i < 30; i++){
                if(i % 5 == 0) {
                    test1.printCBoard();
                }
                test1.oneStep();
            }
            //Expected Output:
            test1.printCBoard();
        }

        /*
        Final method is evolution()
         */
        @Test
        public void testEvolution1(){
            GameOfLife test1 = new GameOfLife(b4);
            test1.printCBoard();
            test1.evolution(1);
            test1.printCBoard();
        }

        @Test
        public void testEvolution2(){
            GameOfLife test1 = new GameOfLife(b3);
            test1.printCBoard();
            test1.evolution(4);
            test1.printCBoard();
        }

        @Test
        public void testEvolution3(){
            GameOfLife test1 = new GameOfLife(b2);
            test1.printCBoard();
            test1.evolution(10);
            test1.printCBoard();
        }

        @Test
        public void testEvolution4(){
            GameOfLife test1 = new GameOfLife(b1);
            test1.printCBoard();
            test1.evolution(100);
            test1.printCBoard();
        }

        @Test
        public void testEvolution5(){
            GameOfLife test1 = new GameOfLife(b1);
            test1.printCBoard();
            test1.evolution(25);
            test1.printCBoard();
        }

        /*
            The following test cases are going to be for Torus Game Of Life
            Starting off with neighbors()
         */
        @Test
        public void testNeighborsTorus1(){
            GameOfLife test1 = new TorusGameOfLife(b1);
            test1.neighbors(1,2);
            //expected output:
            assertEquals(3, test1.neighbors(1,2));
        }

    @Test
    public void testNeighborsTorus2(){
        GameOfLife test1 = new TorusGameOfLife(b2);
        test1.neighbors(2,3);
        //expected output:
        assertEquals(4, test1.neighbors(2,3));
    }

    @Test
    public void testNeighborsTorus3(){
        GameOfLife test1 = new TorusGameOfLife(b3);
        test1.neighbors(0,0);
        //expected output:
        assertEquals(1, test1.neighbors(0,0));
    }

    @Test
    public void testNeighborsTorus4(){
        GameOfLife test1 = new TorusGameOfLife(b4);
        test1.neighbors(9,5);
        //expected output:
        assertEquals(1, test1.neighbors(9,5));
    }

    @Test
    public void testNeighborsTorus5(){
        GameOfLife test1 = new TorusGameOfLife(b1);
        test1.neighbors(4,4);
        //expected output:
        assertEquals(0, test1.neighbors(4,4));
    }

    /*
        Next method is oneStep()
     */

    @Test
    public void testOneStepTorus1(){
        GameOfLife test1 = new TorusGameOfLife(b1);
        test1.printCBoard();
        test1.oneStep();
        //expected Output:
        test1.printCBoard();
    }

    @Test
    public void testOneStepTorus2(){
        GameOfLife test1 = new TorusGameOfLife(b3);
        test1.printCBoard();
        test1.oneStep();
        test1.printCBoard();
        test1.oneStep();
        //expected Output:
        test1.printCBoard();
    }

    @Test
    public void testOneStepTorus3(){
        GameOfLife test1 = new TorusGameOfLife(b2);
        test1.printCBoard();
        for(int i = 1; i < 4; i++){
            test1.printCBoard();
            test1.oneStep();
        }
        //Expected Output:
        test1.printCBoard();
    }

    @Test
    public void testOneStepTorus4(){
        GameOfLife test1 = new TorusGameOfLife(b2);
        for(int i = 1; i < 15; i++){
            test1.printCBoard();
            test1.oneStep();
        }
        //Expected Output:
        test1.printCBoard();
    }

    @Test
    public void testOneStepTorus5(){
        GameOfLife test1 = new TorusGameOfLife(b4);
        for(int i = 1; i < 30; i++){
            if(i % 5 == 0) {
                test1.printCBoard();
            }
            test1.oneStep();
        }
        //Expected Output:
        test1.printCBoard();
    }

    /*
    Final method is evolution()
     */
    @Test
    public void testEvolutionTorus1(){
        GameOfLife test1 = new TorusGameOfLife(b4);
        test1.printCBoard();
        test1.evolution(1);
        test1.printCBoard();
    }

    @Test
    public void testEvolutionTorus2(){
        GameOfLife test1 = new TorusGameOfLife(b3);
        test1.printCBoard();
        test1.evolution(4);
        test1.printCBoard();
    }

    @Test
    public void testEvolutionTorus3(){
        GameOfLife test1 = new TorusGameOfLife(b2);
        test1.printCBoard();
        test1.evolution(10);
        test1.printCBoard();
    }

    @Test
    public void testEvolutionTorus4(){
        GameOfLife test1 = new TorusGameOfLife(b1);
        test1.printCBoard();
        test1.evolution(100);
        test1.printCBoard();
    }

    @Test
    public void testEvolutionTorus5(){
        GameOfLife test1 = new TorusGameOfLife(b1);
        test1.printCBoard();
        test1.evolution(25);
        test1.printCBoard();
    }

}


