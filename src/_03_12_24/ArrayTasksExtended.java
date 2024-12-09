package _03_12_24;

import java.util.Arrays;

public class ArrayTasksExtended {

    // 16. Найти все пары элементов, сумма которых равна заданному числу.
    public static void task16() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==target){
                    System.out.println(array[i]+" and "+array[j]);
                }
            }
        }
    }

    // 17. Проверить, есть ли в массиве дубликаты.
    public static void task17() {
        int[] array = {1, 2, 3, 4, 2};
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    hasDuplicates = true;
                    break;
                }
            }
            if(hasDuplicates){
                System.out.println("В массиве есть дупликаты");
                break;
            }
        }
        if(!hasDuplicates){
            System.out.println("В массиве нет дупликатов");
        }
    }

    // 18. Удалить все нули из массива и сдвинуть элементы влево.
    public static void task18() {
        int[] array = {0, 1, 0, 3, 0};
        int newArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                newArrayLength++;
            }
        }
        int[] newArray = new int[newArrayLength];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                newArray[index]=array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 20. Найти количество чисел, делящихся на заданное число без остатка.
    public static void task20() {
        int[] array = {10, 15, 20, 25, 30};
        int divisor = 5;
        int count=0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % divisor == 0){
            count++;
            }
        }
        System.out.println(count);
    }

    // 21. Упорядочить массив по возрастанию.
    public static void task21() {
        int[] array = {4, 2, 7, 1, 3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    // 22. Найти индекс первого отрицательного элемента.
    public static void task22() {

        int[] array = {1, 2, -3, 4, -5};
        for (int i = 0; i < array.length; i++){
            if(array[i]<0){
                System.out.println(i);
                break;
            }
        }
    }

    // 23. Подсчитать сумму чисел на четных индексах.
    public static void task23() {

        int[] array = {1, 2, 3, 4, 5};
        int sum=0;
        for (int i = 0; i < array.length; i++){
            if(i % 2 == 0 && i!=0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }

    // 24. Найти произведение всех элементов массива.
    public static void task24() {
        int[] array = {1, 2, 3, 4};
        int x=1;
        for (int i = 0; i < array.length; i++) {
            x=x*array[i];
        }
        System.out.println(x);
    }

    // 25. Переместить все отрицательные числа в конец массива.
    public static void task25() {
        int[] array = {1, -2, 3, -4, 5};
        int newArrayLength1 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=0){
                newArrayLength1++;
            }
        }
        int[] newArray1 = new int[newArrayLength1];
        int index1=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=0){
                newArray1[index1]=array[i];
                index1++;
            }
        }
        int newArrayLength2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                newArrayLength2++;
            }
        }
        int[] newArray2 = new int[newArrayLength1];
        int index2=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                newArray2[index2]=array[i];
                index2++;
            }
        }
        int[] newArray = new int[array.length];
        int index=0;
        for (int i = 0; i < newArray1.length; i++) {
            newArray[index]=newArray1[i];
            index++;
        }
        for (int i = 0; i < newArray2.length && index<newArray.length; i++) {
            newArray[index]=newArray2[i];
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 26. Найти количество уникальных элементов в массиве.
    public static void task26() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int count=0;
        for (int i = 0; i < array.length; i++) {
            boolean hasDuplicates = false;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    hasDuplicates = true;
                    break;
                }
            }
            if(!hasDuplicates){
                count++;
            }
        }
        System.out.println(count);
    }

    // 27. Переставить минимальный элемент массива в начало.
    public static void task27() {
        int[] array = {3, 2, 1, 4, 5};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min>array[i]){
                min=array[i];
            }
        }
        int[] newArray = new int[array.length];
        newArray[0]=min;
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=min){
                newArray[index]=array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 28. Найти длину самой длинной последовательности одинаковых элементов.
    public static void task28() {
        int[] array = {1, 1, 2, 2, 2, 3, 3, 2, 2};
        int maxCount=1;
        for (int i = 0; i < array.length; i++) {
            int count=1;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    count++;
                } else{
                    break;
                }
            }
            if(count>maxCount){
                maxCount=count;
            }
        }
        System.out.println(maxCount);
    }

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
    public static void task29() {
        int[] array = {1, -2, 3, 4, -5, 4};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                for (int j = i+1; j < array.length; j++) {
                    if(array[j]>0){
                        sum=sum+array[j];
                    }
                    if(array[j]<=0){
                        break;
                    }
                }
                break;
            }
        }
        System.out.println(sum);
    }

    // 30. Удалить все дубликаты из массива.
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int newArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            boolean hasDuplicates = false;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    hasDuplicates=true;
                }
            }
            if(!hasDuplicates) {
                newArrayLength++;
            }
        }
        int[] newArray = new int[newArrayLength];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            boolean hasDuplicates = false;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    hasDuplicates=true;
                }
            }
            if(!hasDuplicates) {
                newArray[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}