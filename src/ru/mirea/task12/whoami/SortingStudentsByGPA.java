package ru.mirea.task12.whoami;
import java.util.Arrays;

public class SortingStudentsByGPA implements ru.mirea.task12.whoami.Comparator
{
    public void quickSort(int[] source, int leftBorder, int rightBorder)
    {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

    public void turn(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[]args)
    {
        SortingStudentsByGPA markList = new SortingStudentsByGPA();
        int[] input = {4,2,6,7,3};
        markList.quickSort(input,0,8);
        markList.turn(input);
        System.out.println(Arrays.toString(input));
    }
}