import java.util.Arrays;
import java.util.Random;

public class ArrayProcessor {
    public static void main(String[] args) {
        final int arraySize = 3;


        int[] anArray = new int[arraySize];
        getArray(anArray);

        showArray(anArray);


    }


    private static void getArray(int[] anArray) {

        Random arrayNumbers;
        arrayNumbers = new Random();

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = arrayNumbers.nextInt(10) + 1;
        }
    }


    private static void showArray(int[] anArray) {
        System.out.println("This is the Original Array.");
        for (int i = 0; i < anArray.length; i++) {

            System.out.println("entry " + i + " is " + anArray[i] + " ");

        }
        System.out.println();
        System.out.println("This is the sorted Array.");
        sort3IntArray(anArray);
        for (int i = 0; i < anArray.length; i++) {
            System.out.println("entry " + i + " is " + anArray[i] + " ");
        }
        System.out.println();
        System.out.println("This is the reverse sorted Array.");
        reverse3IntArray(anArray);
        int c = 0;
        for (int i = 2; i  > -1; i--) {
            System.out.println("entry " + c + " is " + anArray[i] + " ");
            c++;
        }


    }

    private static void sort3IntArray(int[] anArray) {
        Arrays.sort(anArray);
    }
    private static void reverse3IntArray(int[] anArray)
    {
        Arrays.sort(anArray);

    }
    }






