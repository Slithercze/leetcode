import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeInvlTrglsTest {

    @Test
    void removeTriangles() {
        int[][] testcase = new int[][]{{1, 2, 3}, {2,3,4}, {4,5,6}};
        int[][] expect = new int[][]{{2,3,4}, {4,5,6}};

        assertArrayEquals(expect, removeInvlTrgls.removeTriangles(testcase));
    }
}