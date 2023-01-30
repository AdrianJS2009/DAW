package com.politecnicomalaga.ejerciciosadela;

public class PosicionyVector {

    int[] arr;
    int start, end;

    public void setValues(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public int[] getSubArray() {
        int[] subArr = new int[end - start];
        for (int i = start, j = 0; i < end; i++, j++) {
            subArr[j] = arr[i];
        }
        return subArr;
    }
}