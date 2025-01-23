package _17_01_25;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        int[] arr = {4, 7, -4, 0, 2, -3, -5, 5, 1, -1};
        getMaxElem(arr);
        getMaxElemEvenIndex(arr);
        getSumPositive(arr);
        getAverageArithmetic(arr);
        getLowerNumbers(arr);
        getModulsSum(arr);
        getIndexMinModul(arr);
        getTwoMinElems(arr);
    }

    // #1
    //В массиве найти максимальный элемент
    public static void getMaxElem(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    //#2
    //В массиве найти максимальный элемент с четным индексом
    public static void getMaxElemEvenIndex(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max && i%2 == 0){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    //#3
    //В массиве, содержащем положительные и отрицательные целые числа,
    //вычислить сумму четных положительных элементов
    public static void getSumPositive(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0 && arr[i]%2 == 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    //#4
    //Найти среднее арифметическое от всех элементов массива
    public static void getAverageArithmetic(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double averageAriphmetic = (double) sum / arr.length;
        System.out.println(averageAriphmetic);
    }

    //#5
    //Найти в массиве те элементы, значение которых меньше среднего арифметического,
    //взятого от всех элементов массива
    public static void getLowerNumbers(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double averageAriphmetic = (double) sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(averageAriphmetic > arr[i]){
                count++;
            }
        }
        int[] lowerNumbers = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(averageAriphmetic > arr[i]){
                lowerNumbers[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(lowerNumbers));
    }

    //#6
    //Вычислить сумму модулей элементов массива (для вычисления модуля используйте Math.abs())
    public static void getModulsSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += Math.abs(arr[i]);
        }
        System.out.println(sum);
    }

    //#7
    //Найти номер минимального по модулю элемента массива
    public static void getIndexMinModul(int[] arr){
        int min = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++){
            if(Math.abs(arr[i]) < Math.abs(min)){
                min = Math.abs(arr[i]);
            }
        }
        System.out.println(min);;
    }

    //#8
    //В массиве целых чисел определить два наименьших элемента. Они могут быть как равны
    //между собой (оба являться минимальными), так и различаться
    public static void getTwoMinElems(int[] arr){
        int min1 = arr[0];
        int min2 = arr[1];
        for (int i = 2; i < arr.length; i++){
            if(arr[i] < min1){
                if(min1<min2){
                    min2 = min1;
                }
                min1 = arr[i];
            } else if(arr[i] < min2){
                min2 = arr[i];
            }
        }
        int[] minElems = new int[2];
        minElems[0] = min1;
        minElems[1] = min2;
        System.out.println(Arrays.toString(minElems));
    }
}
