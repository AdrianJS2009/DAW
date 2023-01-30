package com.politecnicomalaga.ejerciciosadela;

class Main {
    public static void main(String[] args) {
        int[] myArr = { 1, 2, 3, 4, 5 };
        PosicionyVector subArray = new PosicionyVector();
        subArray.setValues(myArr, 1, 3);
        int[] subArr = subArray.getSubArray();
        for (int i : subArr) {
            System.out.print(i + " ");
        }
    }
}