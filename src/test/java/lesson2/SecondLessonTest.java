package lesson2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SecondLessonTest {

    private final SecondLesson secondLesson = new SecondLesson();

    @Test
    public void testLesson() {
        assertEquals(secondLesson.getClass().getSimpleName(), "SecondLesson");
    }

    //todo: я понимаю, что это не боевая задача, но все же как подобные кейсы тестировать?
    @Test
    public void testInvertor() {
        assertEquals(true, Arrays.equals(new int[]{1, 0, 0, 1, 1, 0, 1, 1}, secondLesson.invertor()));
    }

    @Test
    public void testGetBucnh() {
        assertEquals(true, Arrays.equals(new int[]{0, 3, 6, 9, 12, 15, 18, 21}, secondLesson.getBunch()));
    }

    // input [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // desired output [ 2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2 ]
    @Test
    public void testGetSomeSet() {
        assertEquals(true, Arrays.equals(new int[]{2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2}, secondLesson.getSomeSet()));
    }


    @Test
    public void testGetSquare() {
        int size = 10;
        int[][] square = secondLesson.getPieceOfJack(size);
        int[] result = new int[size * 2];
        int resultCounter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && square[i][j] == 1
                        || square[size - 1 - i][j] == 1) {
                    result[resultCounter++] = 1;
                }
            }
        }
        assertEquals(size * 2, Arrays.stream(result).sum());
    }

    @Test
    public void testMaxAndMinInside() {
        assertEquals(new Pair(0, 10), secondLesson.findMaxAndMinInside());
    }


    @Test
    public void testGetBorderOfEquality() {
        assertEquals(true, secondLesson.getBorderOfEquality(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        assertEquals(false, secondLesson.getBorderOfEquality(new int[]{2, 2, 2, 1, 2, 2, 2, 2}));
        assertEquals(true, secondLesson.getBorderOfEquality(new int[]{2, 2, 2, 2}));
        assertEquals(false, secondLesson.getBorderOfEquality(new int[]{2, 2, 2, 3}));
    }

    @Test
    public void testMoveNTimes() {
        assertEquals(true, Arrays.equals(new Integer[]{8, 9, 0, 1, 2, 3, 4, 5, 6, 7},
                secondLesson.moveNtimes(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 2)));

        assertEquals(true, Arrays.equals(new Integer[]{4, 5, 6, 7, 8, 1, 2, 3},
                secondLesson.moveNtimes(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}, 5)));

        assertEquals(true, Arrays.equals(new Integer[]{3, 4, 5, 6, 7, 8, 1, 2},
                secondLesson.moveNtimes(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}, -2)));
    }


}
