package _03_12_24;

import java.util.Arrays;

public class ArrayTasks {
    // 1. Найти сумму элементов массива.
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        int x=0;
        for (int i = 0; i < array.length; i++){
            x=x+array[i];
        }
        System.out.println(x);
    }

    // 2. Найти минимальный элемент массива.
    public static void task2() {
        int[] array = {4, 2, -1, 7};
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (min>array[i]){
                min=array[i];
            }
        }
    }

    // 3. Найти максимальный элемент массива.
    public static void task3() {
        int[] array = {4, 2, -1, 7};
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
    }

    // 4. Найти индекс минимального элемента массива.
    public static void task4() {
        int[] array = {4, 2, -1, 7};
        int min = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]<min){
                index = i;
            }
        }
    }

    // 5. Найти индекс максимального элемента массива.
    public static void task5() {
        int[] array = {4, 2, -1, 7};
        int max=0;
        int index=0;
        for (int i = 0; i < array.length; i++){
            if(array[i]>max){
                index=i;
            }
        }
    }

    // 6. Посчитать количество положительных элементов.
    public static void task6() {
        int[] array = {4, -2, 0, 7};
        int count=0;
        for (int i = 0; i < array.length; i++){
            if(array[i]>0){
                count=count+1;
            }
        }
    }

    // 7. Посчитать количество отрицательных элементов.
    public static void task7() {
        int[] array = {4, -2, 0, -7};
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count = count + 1;
            }
        }
    }

    // 8. Посчитать количество четных элементов.
    public static void task8() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] %2 == 0){
                count++;
            }
        }
    }

    // 9. Посчитать количество нечетных элементов.
    public static void task9() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] %2 != 0){
                count++;
            }
        }
    }

    // 10. Проверить, есть ли в массиве заданное число.
    public static void task10() {
        int[] array = {4, -2, 0, 7};
        int target = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == target){
                System.out.println("есть");
            } else{
                System.out.println("нет");
            }
        }
    }

    // 11. Найти среднее арифметическое элементов массива.
    public static void task11() {
        int[] array = {1, 2, 3, 4};
        int sum=0;
        for (int i = 0; i < array.length; i++){
            sum=sum+array[i];
        }
        System.out.println(sum/array.length);
    }

    // 12. Вывести все элементы массива, которые больше среднего значения.
    public static void task12() {
        int[] array = {1, 2, 3, 4};
        int sum=0;
        for (int i = 0; i < array.length; i++){
            sum=sum+array[i];
        }
        int avg=sum/array.length;
        for (int i = 0; i < array.length; i++){
            if(array[i]>avg){
                System.out.println(array[i]);
            }
        }
    }

    // 13. Проверить, упорядочен ли массив по возрастанию.
    public static void task13(){
        int[] array = {1, 2, 3, 4};
        int goal=0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]){
                goal++;
            }
        }
        if(goal==0){
            System.out.println("Массив упорядочен по возрастанию");
        } else{
            System.out.println("Массив не упорядочен по возрастанию");
        }
    }

    // 14. Найти второй по величине элемент массива.
    public static void task14() {
        int[] array = {1, -2, 3, -4};
        int min=0;
        int x=0;
        for (int i = 0; i < array.length; i++){
            if(array[i]<min){
                x=min;
                min=array[i];
            }
            if(array[i]<x && array[i]>min){
                x=array[i];
            }
        }
        System.out.println(x);
    }

    // 15. Переставить элементы массива в обратном порядке.
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] newArray = new int[array.length];
        int index=0;
        for (int i = array.length-1; i >= 0; i--) {
            newArray[index]=array[i];
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
