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
            GameOfLife test1 = new TorusGameOfLife(b1);
            test1.neighbors(1,2);
            //expected output:
            assertEquals(3, test1.neighbors(1,2));
        }

        @Test
        public void testNeighbors2(){
            GameOfLife test1 = new TorusGameOfLife(b2);
            test1.neighbors(2,3);
            //expected output:
            assertEquals(4, test1.neighbors(2,3));
        }

        @Test
        public void testNeighbors3(){
            GameOfLife test1 = new TorusGameOfLife(b3);
            test1.neighbors(0,0);
            //expected output:
            assertEquals(1, test1.neighbors(0,0));
        }

        @Test
        public void testNeighbors4(){
            GameOfLife test1 = new TorusGameOfLife(b4);
            test1.neighbors(9,5);
            //expected output:
            assertEquals(1, test1.neighbors(9,5));
        }

        @Test
        public void testNeighbors5(){
            GameOfLife test1 = new TorusGameOfLife(b1);
            test1.neighbors(4,4);
            //expected output:
            assertEquals(0, test1.neighbors(4,4));
        }

    /*
        Next method is oneStep()
     */

        @Test
        public void testOneStep1(){
            GameOfLife test1 = new TorusGameOfLife(b4);
        }

        @Test
        public void testOneStep2(){
            GameOfLife test1 = new TorusGameOfLife(b4);
        }

        @Test
        public void testOneStep3(){
            GameOfLife test1 = new TorusGameOfLife(b4);
        }

        @Test
        public void testOneStep4(){
            GameOfLife test1 = new TorusGameOfLife(b4);
        }

        @Test
        public void testOneStep5(){
            GameOfLife test1 = new TorusGameOfLife(b4);
        }

        /*
        Final method is evolution()
         */
        @Test
        public void testEvolution1(){
            GameOfLife test1 = new TorusGameOfLife(b4);
        }

        @Test
        public void testEvolution2(){
            GameOfLife test1 = new TorusGameOfLife(b4);
        }

        @Test
        public void testEvolution3(){
            GameOfLife test1 = new TorusGameOfLife(b4);
        }

        @Test
        public void testEvolution4(){
            GameOfLife test1 = new TorusGameOfLife(b4);
        }

        @Test
        public void testEvolution5(){
            GameOfLife test1 = new TorusGameOfLife(b4);
        }

}


