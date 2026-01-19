package ru.courses.basics;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] arr = {4,2,7,5,7,1,5};
        System.out.println(findFirst(arr,5));

        int[] arr2 = {4, 7, 5, 2, 1, 5, 3};
        System.out.println(findLast(arr2, 5));

        int[] arr3 = {4,6,2,-7};
        System.out.println(maxAbs(arr3));

        int[] arr4 = {4, 1, 2, -7, 8};
        System.out.println(countPositive(arr4));

        int[] arr5 = {6, 4, 7, 2, 7, 4, 6};
        System.out.println(palindrom(arr5));

        int[] arr6 = {4,6,8,3};
        reverse(arr6);

        int[] arr7 = {4,7,2,6};
        System.out.println(Arrays.toString(reverseBack(arr7)));

        int[] arr8 = {1, 2, 3};
        int[] arr8_1 = {7, 8, 9};
        System.out.println(Arrays.toString(concat(arr8, arr8_1)));

        int[] arr9 = {1, 2, 3, 2, 6, 7, 2};
        System.out.println(Arrays.toString(findAll(arr9, 2)));

        int[] arr10 = {1, 2, -3, -2, 6, 7, -2};
        System.out.println(Arrays.toString(deleteNegative(arr10)));

        int[] arr11 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(add(arr11, 99, 3)));

        int[] arr12 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr12_1 = {98, 99, 100};
        System.out.println(Arrays.toString(addMas(arr12, arr12_1, 3)));
    }


    public static int findFirst(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static int maxAbs(int[] arr){
        int resMaxAbs = Math.abs(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > resMaxAbs) resMaxAbs = Math.abs(arr[i]);
        }
        return resMaxAbs;
    }

    public static int countPositive(int[] arr) {
        int resCountPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) resCountPositive++;
        }
        return resCountPositive;
    }

    public static boolean palindrom(int[] arr) {
        int countPalindrom = arr.length - 1;
        boolean boolPalindrom = false;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[countPalindrom]) {
                countPalindrom--;
                boolPalindrom = true;
            } else {
                boolPalindrom = false;
                break;
            }
        }
        return boolPalindrom;
    }

    public static void reverse(int[] arr){
        int[] tempReverse = new int[arr.length];
        int countReverse = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            tempReverse[countReverse]=arr[i];
            countReverse--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=tempReverse[i];
        }
        System.out.println(Arrays.toString(arr));;
    }

    public static int[] reverseBack(int[] arr){
        int[] resReverseBack = new int[arr.length];
        int countReverseBack = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            resReverseBack[countReverseBack]=arr[i];
            countReverseBack--;
        }
        return resReverseBack;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] resConcat = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            resConcat[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            resConcat[arr1.length + i] = arr2[i];
        }
        return resConcat;
    }

    public static int[] findAll(int[] arr, int x) {
        int[] tempFindAll = new int[arr.length];
        int countFindAll = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                tempFindAll[countFindAll]=i;
                countFindAll++;
            }
        }
        int[] resFindAll = new int[countFindAll];
        for (int i = 0; i < countFindAll; i++) {
            resFindAll[i]=tempFindAll[i];
        }
        return resFindAll;
    }

    public static int[] deleteNegative(int[] arr){
        int[] tempDelNeg = new int[arr.length];
        int countDelNeg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                tempDelNeg[countDelNeg]=arr[i];
                countDelNeg++;
            }
        }
        int[] resDelNeg = new int[countDelNeg];
        for (int i = 0; i < countDelNeg; i++) {
            resDelNeg[i]=tempDelNeg[i];
        }
        return resDelNeg;
    }

    public static int[] add(int[] arr, int x, int pos) {
        int[] resAdd = new int[arr.length + 1];
        for (int i = 0; i <= pos; i++) {
            if (i == pos) {
                resAdd[i] = x;
                resAdd[i + 1] = arr[i];
            } else {
                resAdd[i] = arr[i];
            }
        }
        for (int i = pos + 1; i < resAdd.length; i++) {
            resAdd[i] = arr[i - 1];
        }
        return resAdd;
    }

    public static int[] addMas(int[] arr, int[] ins, int pos) {
        int[] resAddMas = new int[arr.length + ins.length];
        for (int i = 0; i <= pos; i++) {
            if (i == pos) {
                for (int j = 0; j < ins.length; j++) {
                    resAddMas[i] = ins[j];
                    i++;
                }
                resAddMas[i + 1] = arr[i];
            } else {
                resAddMas[i] = arr[i];
            }
        }
        for (int i = pos + ins.length; i < resAddMas.length; i++) {
            resAddMas[i] = arr[i - ins.length];
        }
        return resAddMas;
    }
}
