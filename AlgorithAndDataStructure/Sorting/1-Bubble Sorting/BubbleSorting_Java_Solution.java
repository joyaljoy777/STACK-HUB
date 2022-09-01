/*	
	How to run the program via cmd
	
	*)	javac BubbleSorting_Java_Solution.java (Will compile and generate byteclass file)
	*)	java BubbleSorting_Java_Solution (Will execute the code)
	
	Please check package decleration if any error came will executing.

*/

public class BubbleSorting_Java_Solution {

    public static void main(String[] args) {
        int[] testArray = {7, 4, -9, -6, 2};
        for (int i : bubbleSort(testArray)) {
            System.out.print(i + " ");
        }
    }

    public static int[] bubbleSort(int[] array) {

        int arraySize = array.length;
        if(arraySize == 0) {
            return new int[] {};
        }
        for(int i=0; i < arraySize -1; i++) {
            for(int j=0 ; j < arraySize - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] =  temp;
                }
            }
        }
        return array;
    }
}