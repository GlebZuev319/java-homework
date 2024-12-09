package _05_12_24;

import java.util.Arrays;

public class ArrayTasksWithStringsAndInts {

    // 21. Генерация нового массива из четных чисел.
    public static void task21() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int newArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArrayLength++;
            }
        }
        int[] newArray = new int[newArrayLength];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 22. Генерация нового массива из нечетных чисел.
    public static void task22() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int newArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                newArrayLength++;
            }
        }
        int[] newArray = new int[newArrayLength];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                newArray[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 23. Проверка на палиндром в массиве строк.
    public static void task23() {
        String[] array = {"level", "hello", "radar", "world"};
        for (int i = 0; i < array.length; i++) {
            boolean isPalindrome = false; // посмотрел у чатаГПТ как применять булеан с дупликатами и тп, и стало максимально легко такого рода задачи решать
            int index=0;
            for (int j = array[i].length()-1; j > 0; j--) {
                if(array[i].charAt(index)==array[i].charAt(j)){
                    isPalindrome = true;
                    index++;
                } else {
                    break;
                }
            }
            if(isPalindrome){
                System.out.println(array[i]);
            }
        }
    }

    // 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
    public static void task24() {
        String[] array = {"apple", "application", "banana", "grape"};
        String pattern = "app";
        for (int i = 0; i < array.length; i++) {
            if(array[i].contains(pattern)){
                System.out.println(array[i]);
            }
        }
    }

    // 25. Создание массива чисел с четными индексами.
    public static void task25() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int newArrayLength=0;
        for (int i = 2; i < array.length; i=i+2) {
            newArrayLength++;
        }
        int[] newArray = new int[newArrayLength];
        int index=0;
        for (int i = 2; i < array.length; i=i+2) {
            newArray[index]=array[i];
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 26. Создание массива чисел с нечетными индексами.
    public static void task26() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int newArrayLength=0;
        for (int i = 1; i < array.length; i=i+2) {
            newArrayLength++;
        }
        int[] newArray = new int[newArrayLength];
        int index=0;
        for (int i = 1; i < array.length; i=i+2) {
            newArray[index]=array[i];
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
    public static void  task27(){
        String[] array = {"apple", "banana", "cat", "dog", "elephant"};
        int newArray1Length = 0;
        int newArray2Length = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() %2 == 0){
                newArray1Length++;
            } else{
                newArray2Length++;
            }
        }
        String[] newArray1 = new String[newArray1Length];
        String[] newArray2 = new String[newArray2Length];
        int index1=0;
        int index2=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() %2 == 0){
                newArray1[index1]=array[i];
                index1++;
            } else{
                newArray2[index2]=array[i];
                index2++;
            }
        }
        System.out.println(Arrays.toString(newArray1)+" – массив строк с четной длиной");
        System.out.println(Arrays.toString(newArray2)+" – массив строк с нечетной длиной");
    }

    // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
    public static void task28() {
        String[] array = {"apple", "banana", "level", "radar", "hello"};
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length()-1; j > 0; j--) {
                if(array[i].charAt(0)==array[i].charAt(j)){
                    System.out.println(array[i]);
                    break;
                } else{
                    break;
                }
            }
        }
    }

    // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
    public static void task29() {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i]*array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 30. Создать массив строк, содержащих только уникальные символы.
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cat", "dog", "race"};
        int newArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            boolean hasDuplicates = false;
            for (int j = 0; j < array[i].length(); j++) {
                for (int k = j+1; k < array[i].length(); k++) {
                    if(array[i].charAt(j)==array[i].charAt(k)){
                        hasDuplicates = true;
                        break;
                    }
                }
            }
            if(!hasDuplicates){
                System.out.println(array[i]);
            }
        }
    }
}