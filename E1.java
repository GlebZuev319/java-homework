package _19_12_2024;

import java.util.HashSet;

public class E1 {
     /**
     * 1. Напишите метод, который принимает два массива строк одинаковой длины и возвращает массив,
     * содержащий строки, составленные из соответствующих строк двух массивов в обратном порядке.
     */

    String[] array11 = {"1", "2", "3", "4", "5"};
    String[] array12 = {"6", "7", "8", "9", "0"};

    public static String[] reverseAdd(String[] array11, String[] array12) {

        if (array11.length != array12.length) {
            System.out.println("Массивы разной длины");
            return new String[0];
        }

        String[] array = new String[array11.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = array12[i] + " " + array11[i];
        }

        return array;
    }

    /**
    * 2. Напишите метод, который принимает массив целых чисел и массив строк,
    * и возвращает количество строк, чья длина больше, чем соответствующее число в массиве чисел.
    */

    String[] array21 = {"elephant", "dog", "block"};
    int[] array22 = {4, 7, 1};

    public static int lengthLetter(String[] array21, int[] array22){

        if (array21.length != array22.length) {
            System.out.println("Массивы разной длины");
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < array21.length; i++) {
            if(array21[i].length()>array22[i]){
                sum++;
            }
        }
        return sum;
    }

    /**
    * 3. Напишите метод, который принимает массив символов и массив строк,
    * и возвращает массив, где строки содержат только символы из соответствующего элемента массива символов.
    */

    char[] array31 = {'a', 'b', 'c', 'd', 't', 'g', 'l', 'o'};
    String[] array32 = {"cat", "dog", "block"};

    public static String[] onlyCharsFromMasive(char[] array31, String[] array32){

        int arrayLength = 0;
        for (int i = 0; i < array32.length; i++){
            int count = 0;
            for (int j = 0; j < array32[i].length(); j++){
                for (int k = 0; k < array31.length; k++) {
                    if(array32[i].charAt(j) == array31[k]){
                        count++;
                        break;
                    }
                }
            }
            if(count == array32[i].length()){
                arrayLength++;
            }
            count=0;
        }

        String[] array = new String[arrayLength];
        int index = 0;

        for (int i = 0; i < array32.length; i++){
            int count = 0;
            for (int j = 0; j < array32[i].length(); j++){
                for (int k = 0; k < array31.length; k++) {
                    if(array32[i].charAt(j) == array31[k]){
                        count++;
                        break;
                    }
                }
            }
            if(count == array32[i].length()){
                array[index]=array32[i];
                index++;
            }
            count=0;
        }
        return array;
    }

    /**
    * 4. Напишите метод, который принимает два массива целых чисел одинаковой длины
    * и возвращает массив, содержащий разность квадратов соответствующих чисел.
    */

    int[] array41 = {1, 4, 9};
    int[] array42 = {5, 8, 13};

    public static int[] difSquares(int[] array41, int[] array42){

        if(array41.length != array42.length){
            System.out.println("Длины массивов не равны");
            return new int[0];
        }

        int[] array = new int[array41.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = array42[i]*array42[i]-array41[i]*array41[i];
        }
        return array;
    }

    /**
    * 5. Напишите метод, который принимает массив логических значений и массив строк,
    * и возвращает массив строк, где каждое значение true добавляет "(valid)" к соответствующей строке.
    */

    boolean[] array51 = {true, false, false, true};
    String[] array52 = {"cat", "car", "tree", "elephant"};

    public static String[] isAnimal(boolean[] array51, String[] array52){

        if(array51.length != array52.length){
            System.out.println("Длины массивов не равны");
            return new String[0];
        }

        String[] array = new String[array51.length];
        for (int i = 0; i < array.length; i++) {
           if(array51[i]){
               array[i]=array52[i]+" (valid)";
           } else{
               array[i]=array52[i];
           }
        }
        return array;
    }

    /**
    * 6. Напишите метод, который принимает два массива строк одинаковой длины
    * и возвращает массив строк, где каждая строка — это объединение строк из обоих массивов с добавлением их длин.
    */

    String[] array61 = {"true", "false", "false", "true"};
    String[] array62 = {"cat", "car", "tree", "elephant"};

    public static String[] unity(String[] array61, String[] array62){

        if(array61.length != array62.length){
            System.out.println("Длины массивов не равны");
            return new String[0];
        }

        String[] array = new String[array61.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = array61[i] + "(" + array61[i].length() + ") " + array62[i] + "(" + array62[i].length() + ")";
        }
        return array;
    }

    /**
    * 7. Напишите метод, который принимает массив чисел с плавающей точкой и массив целых чисел,
    * и возвращает массив, содержащий произведения соответствующих элементов.
    */

    double[] array71 = {6.4, 3.7, 5.0};
    int[] array72 = {3, 7, 11};

    public static double[] productArrays(double[] array71, int[] array72){

        if(array71.length != array72.length){
            System.out.println("Разные длины массивов");
            return new double[0];
        }

        double[] array = new double[array71.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = array71[i]*array72[i];
        }
        return array;
    }

    /**
    * 8. Напишите метод, который принимает два массива символов и возвращает массив символов,
    * которые присутствуют в обоих массивах.
    */

    char[] array81 = {'g', '8', '?', 'c', '/', '3'};
    char[] array82 = {'0', '?', 'l', ']', 'c'};

    public static char[] sameChars(char[] array81, char[] array82){

        HashSet<Character> set = new HashSet<>();
        for(char a : array81){
            set.add(a);
        }

        HashSet<Character> sameChars = new HashSet<>();
        for(char a : array82){
            if(set.contains(a)){
                sameChars.add(a);
            }
        }

        char[] array = new char[sameChars.size()];
        int index=0;
        for(char a : sameChars){
            array[index++]=a;
        }
        return array;
    }

    /**
    * 9. Напишите метод, который принимает массив строк и массив чисел,
    * и возвращает true, если все строки массива имеют длину, равную соответствующему числу.
    */

    String[] array91 = {"elephant", "dog", "block"};
    int[] array92 = {4, 3, 5};

    public static boolean isSame(String[] array91, int[] array92){
        if(array91.length != array92.length){
            System.out.println("Длины массивов не равны");
            return false;
        }

        for (int i = 0; i < array91.length; i++) {
            if(array91[i].length() != array92[i]){
                return false;
            }
        }
        return true;
    }

    /**
    * 10. Напишите метод, который принимает два массива строк и возвращает строку,
    * содержащую чередующиеся элементы из двух массивов.
    */

    String[] array101 = {"true", "false", "false", "true"};
    String[] array102 = {"cat", "car", "tree", "elephant", "block"};

    public static String stringsOfBothArrays(String[] array101, String[] array102){
        StringBuilder string = new StringBuilder();
        int maxLength = Math.max(array101.length, array102.length);

        for (int i = 0; i < maxLength; i++) {
            if(i<array101.length){
                string.append(array101[i] + " ");
            }
            if(i<array102.length){
                string.append(array102[i] + " ");
            }
        }
        return string.toString();
    }
}