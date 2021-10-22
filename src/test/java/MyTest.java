import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testBasic() {
        assertEquals(9, Kata.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, Kata.squareSum(new int[]{1, 2}));
        assertEquals(50, Kata.squareSum(new int[]{5, -3, 4}));
    }

    private static class Kata {
        public static int squareSum(int[] n) {
            int sum = 0;
            for (int i = 0; i < n.length; i++) {
                sum += Math.pow(n[i], 2);
            }
            return sum;
        }
    }
}

