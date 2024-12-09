package _05_12_24;

import java.util.Arrays;

public class ArrayTasksWithStringsAndIntsB {

    // 11. Отсортировать массив строк по длине.
    public static void task11 () {
        String[] array = {"elephant", "cat", "dog"};
        Arrays.sort(array, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(Arrays.toString(array));
    }

    // 12. Найти и вывести все строки одинаковой длины.
    public static void task12() {
        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
        String strings = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i].length()==array[j].length()){
                    strings=strings+array[i]+" and "+array[j]+"; ";
                }
            }
        }
        System.out.println(strings);
    }

    // 13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        if(array1.length!= array2.length){
            System.out.println("Массивы не равны");
        } else{
            int goal=0;
            for (int i = 0; i < array1.length; i++) {
               if(array1[i]!=array2[i]){
                   goal++;
               }
            }
            if(goal==0){
                System.out.println("Массивы равны");
            } else{
                System.out.println("Массивы не равны");
            }
        }
    }

    // 14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] newArray=new int[array1.length];
        int index=0;
        for (int i = 0; i < array1.length; i++) {
            newArray[index]=array1[i]+array2[i];
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
        String strings = "";
        int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length && i!=j; j++) {
                if(array[i].equals(array[j])){
                    count++;
                }
            }
            if(count==0){
                strings=strings.trim()+" "+array[i];
            }
            count=0;
        }
        System.out.println(strings);
    }

    // 16. Удалить дубликаты из массива строк.
    public static void task16() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        int newArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            int goal=0;
            for (int j = i+1; j < array.length; j++) {
                if(array[i].equals(array[j])){
                    goal++;
                    break;
                }
            }
            if(goal==0){
                newArrayLength++;
            }
        }
        String[] newArray = new String[newArrayLength];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            int goal1=0;
            for (int j = i+1; j < array.length; j++) {
                if(array[i].equals(array[j])){
                    goal1++;
                    break;
                }
            }
            if(goal1==0){
                newArray[index]=array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 17. Объединить два массива строк в один.
    public static void task17() {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};
        int newArrayLength = array1.length+array2.length;
        String[] newArray = new String[newArrayLength];
        int index=0;
        for (int i = 0; i < array1.length; i++) {
            newArray[index]=array1[i];
            index++;
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[index]=array2[i];
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }

    // 18. Проверить, упорядочен ли массив строк по алфавиту.
    public static void task18() {
        String[] array = {"apple", "banana", "cherry"};
        int goal=0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i].compareTo(array[i+1])<0){
                goal++;
            }
        }
        if(goal==array.length-1){
            System.out.println("Массив упорядочен по алфавиту");
        } else{
            System.out.println("Массив не упорядочен по алфавиту");
        }
    }

    // 19. Найти строки, начинающиеся с заданной буквы.
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "apricot", "cherry"};
        char target = 'a';
        String strings = "";
        for (int i = 0; i < array.length; i++) {
            if(array[i].charAt(0)==target){
                strings=strings.trim()+" "+array[i];
            }
        }
        System.out.println(strings);
    }

    // 20. Создать массив строк из первых букв элементов другого массива.
    public static void task20() {
        String[] array = {"apple", "banana", "cherry"};
        String[] newArray = new String[array.length];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            newArray[index]=String.valueOf(array[i].charAt(0));
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}