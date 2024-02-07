package edu.ncl.csc1035.exceptions;

public class UsingEmptyArrayException {

    public static int findMinimum(int[] array) throws EmptyArrayException {
        // recognise the problem i.e. detect an error
        if (array.length == 0) {
            // report the empty array i.e. throw an exception
            throw new EmptyArrayException("Array should not be empty");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println(findMinimum(array));
        }
        catch(EmptyArrayException e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] array = new int[0];
            System.out.println(findMinimum(array));
        }
        // deal with the problem i.e. catch
        catch(EmptyArrayException e) {
            System.out.println(e.getMessage());
        }
    }
}
