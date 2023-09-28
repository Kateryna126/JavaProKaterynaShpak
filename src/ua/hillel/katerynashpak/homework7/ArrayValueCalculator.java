package ua.hillel.katerynashpak.homework7;

public class ArrayValueCalculator {

    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        try {
            int result = doCalc(array);
            System.out.println("Sum of all elements in the array: " + result);
        } catch (ArraySizeException e) {
            System.out.println("ArraySizeException: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("ArrayDataException: " + e.getMessage());
        }
    }

    private static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException("Input array size must be 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data in cell [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
