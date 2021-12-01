package ru.mirea.task12.twolitstonesort;

import java.util.Arrays;

public class MergeSortClass
{
    public static void mergeSort(int[] arr, int lenthOfArray) {
        if (lenthOfArray < 2) {return;}
        int mid = lenthOfArray / 2;
        int[] left = new int[mid];
        int[] right = new int[lenthOfArray - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < lenthOfArray; i++) {
            right[i - mid] = arr[i];
        }
        mergeSort(left, mid);
        mergeSort(right, lenthOfArray - mid);
        merge(arr, left, right, mid, lenthOfArray - mid);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    public int[] combine(int[] aArr, int[] bArr){
        int first = aArr.length;
        int second= bArr.length;
        int [] res = new int[first+second];
        System.arraycopy(aArr, 0, res, 0, first);
        System.arraycopy(bArr, 0, res, first, second);
        mergeSort(res, first+second);
        return res;
    }
    public static void main(String[]args)
    {
        MergeSortClass  testObj = new MergeSortClass();
        int[] firstList = {7,1,5,4};
        int[] secondList = {9,3,8,2};
        int[] output = testObj.combine(firstList, secondList);
        System.out.println(Arrays.toString(output));
    }
}