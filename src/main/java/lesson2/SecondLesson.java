package lesson2;

import java.util.Arrays;

public class SecondLesson {


    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public int[] invertor() {
        int[] hundred = {0, 1, 1, 0, 0, 1, 0, 0};
        int[] hundredFiftyFive = new int[hundred.length];
        for (int i = 0; i < hundred.length; i++) {
            hundredFiftyFive[i] = hundred[i] == 0 ? 1 : 0;
        }
        return hundredFiftyFive;
    }

    /**
     * 2. Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public int[] getBunch() {
        int[] bunch = new int[8];
        for (int i = 0; i < bunch.length; i++) {
            bunch[i] = 3 * i;
        }
        return bunch;
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public int[] getSomeSet() {
        int[] mockInput = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] output = new int[mockInput.length];
        for (int i = 0; i < mockInput.length; i++) {
            output[i] = mockInput[i] < 6 ? mockInput[i] * 2 : mockInput[i];
        }
        return output;
    }


    /**
     * 4. Создать квадратный двумерный целочисленный массив
     * (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
     * заполнить его диагональные элементы единицами;
     */
    public int[][] getPieceOfJack(int size) { //union jack :D
        int[][] square = new int[size][size];
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (x == y || size - 1 - x == y) {
                    square[x][y] = 1;
                }
            }
        }
        return square;
    }


    /**
     * 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */
    public Pair findMaxAndMinInside() {
        int size = 10;
        int[] input = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int min = input[0];
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            int currentValue = input[i];
            min = currentValue < min ? currentValue : min;
            max = currentValue > max ? currentValue : max;
        }
        return new Pair(min, max);
    }

    public void getPair() {
    }


    /**
     * Написать метод, в который передается не пустой
     * одномерный целочисленный массив, метод должен вернуть
     * true, если в массиве есть место, в котором сумма левой
     * и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
     * checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
     * эти символы в массив не входят.
     */
    public boolean getBorderOfEquality(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (sumOfRange(input, 0, i) == sumOfRange(input, i, input.length)) return true;
        }
        return false;
    }


    /**
     * @param input int[] the array from which will be summed
     * @param from  the initial index of the range to be copied, inclusive
     * @param to    the final index of the range to be copied, exclusive.
     * @return
     */
    private static int sumOfRange(int[] input, int from, int to) {
        int[] output = Arrays.copyOfRange(input, from, to);
        int sum = 0;
        for (int elem : output) {
            sum += elem;
        }
        return sum;
    }

    /**
     * Написать метод, которому на вход подается одномерный массив
     * и число n (может быть положительным, или отрицательным),
     * при этом метод должен сместить все элементымассива на n позиций.
     * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */
    public   <T extends Object> T[] moveNtimes(T[] input, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            input = n >= 0 ? moveRight(input) : moveLeft(input);
        }
        return input;
    }

    /**
     *
     * @param input array to move
     * @param <T> type
     * @return array moved left by 1 cell
     */
    private   <T extends Object> T[] moveLeft(T[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            T temp = input[i];
            input[i] = input[i + 1];
            input[i + 1] = temp;
        }
        return input;
    }

    /**
     *
     * @param input nput array to move
     * @param <T> type
     * @return array moved to right by one cell
     */
    private static <T extends Object> T[] moveRight(T[] input) {
        for (int i = input.length - 2; i >= 0; i--) {
            T temp = input[i];
            input[i] = input[i + 1];
            input[i + 1] = temp;
        }
        return input;
    }

}
